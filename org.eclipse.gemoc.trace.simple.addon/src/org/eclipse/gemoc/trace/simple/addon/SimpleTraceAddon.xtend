package org.eclipse.gemoc.trace.simple.addon

import java.time.Duration
import java.time.Instant
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.transaction.RecordingCommand
import org.eclipse.emf.transaction.util.TransactionUtil
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution
import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.trace.simple.SimpleTrace
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener

class SimpleTraceAddon implements IEngineAddon {

	IExecutionContext<?, ?, ?> _executionContext
	var boolean needTransaction = true
	BatchModelChangeListener listenerAddon
	SimpleTrace trace
	SimpleTraceConstructor traceConstructor

	protected boolean activateUpdateEquivalenceClasses = true;
	protected boolean activateSaveOnEveryStep = true;
	protected boolean activateSaveOnEngineStop = true;
	protected boolean activateSaveAsBinaryResource = true;
	
	Map<Object,Object> saveOptions
	
	Instant start
	Instant finish

	override aboutToExecuteStep(IExecutionEngine<?> executionEngine, Step<?> step) {
		manageStep(step, true)
	}

	override stepExecuted(IExecutionEngine<?> engine, Step<?> step) {
		manageStep(step, false)
	}

	private def manageStep(Step<?> step, boolean add) {
		if (step !== null) {
			modifyTrace([
				traceConstructor.addState(listenerAddon.getChanges(this))
				if (add) {
					traceConstructor.addStep(step)
				} else {
					traceConstructor.endStep(step)
				}
			])
			if (activateSaveOnEveryStep) {
				traceConstructor.save(saveOptions)
			}
		}
	}

	/**
	 * To construct the trace manager
	 */
	override engineAboutToStart(IExecutionEngine<?> engine) {
		start = Instant.now()
		if (_executionContext === null) {
			_executionContext = engine.executionContext

			// load addon options from the execution context
			this.activateSaveOnEveryStep = _executionContext.runConfiguration.getAttribute(
				"org.eclipse.gemoc.trace.simple.addon.saveTraceOnStep", false);
			this.activateSaveOnEngineStop = _executionContext.runConfiguration.getAttribute(
				"org.eclipse.gemoc.trace.simple.addon.saveTraceOnEngineStop", true);
			this.activateSaveAsBinaryResource = _executionContext.runConfiguration.getAttribute(
				"org.eclipse.gemoc.trace.simple.addon.saveTraceAsBinaryResource", false);
			
			this.saveOptions = new HashMap()
			if (activateSaveAsBinaryResource){
				this.saveOptions.put(XMLResource.OPTION_BINARY, Boolean.TRUE)	
			}
				
			this.saveOptions = if (activateSaveAsBinaryResource) 
       			newHashMap(XMLResource.OPTION_BINARY -> Boolean.TRUE) 
       			else Collections.emptyMap()

			val modelResource = _executionContext.resourceModel

			// Creating the resource of the trace
			val ResourceSet rs = new ResourceSetImpl

			// We check whether or not we need transactions
			val ed = TransactionUtil.getEditingDomain(rs)
			needTransaction = ed !== null

			val URI traceModelURI = URI.createPlatformResourceURI(
				_executionContext.getWorkspace().getExecutionPath().toString() + "/execution.simpletrace", false)
			val Resource traceResource = rs.createResource(traceModelURI)

			// We construct a new listener addon if required
			this.listenerAddon = new BatchModelChangeListener(
				EMFResource.getRelatedResources(engine.executionContext.resourceModel))
			listenerAddon.registerObserver(this)

			// We construct the trace constructor, using the concrete generated method
			traceConstructor = new SimpleTraceConstructor(modelResource, traceResource)

			// We initialize the trace
			modifyTrace([traceConstructor.initTrace()])

		}
	}

	override engineStopped(IExecutionEngine<?> engine) {
		if (activateSaveOnEngineStop) {
			traceConstructor.save(saveOptions)
		}
		finish = Instant.now()
		println("==> Overall execution time : "+ Duration.between(start, finish).toSeconds + " sec.")
	}

	/**
	 * Wrapper using lambda to always use a RecordingCommand when modifying the trace
	 */
	private def void modifyTrace(Runnable r, String message) {
		if (needTransaction) {
			val ed = TransactionUtil.getEditingDomain(_executionContext.resourceModel)
			val Set<Throwable> catchedException = new HashSet
			var RecordingCommand command = new RecordingCommand(ed, message) {
				protected override void doExecute() {
					try {
						r.run
					} catch (Throwable t) {
						catchedException.add(t)
					}
				}
			}
			CommandExecution.execute(ed, command)
			if (!catchedException.empty)
				throw catchedException.head
		} else {
			r.run
		}
	}

	/**
	 * Same as above, but without message.
	 */
	private def void modifyTrace(Runnable r) {
		modifyTrace(r, "")
	}


	def getTrace() {
		return trace
	}
}
