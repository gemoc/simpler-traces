package org.eclipse.gemoc.trace.simple.addon

import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
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
				traceConstructor.save()
			}
		}
	}

	/**
	 * To construct the trace manager
	 */
	override engineAboutToStart(IExecutionEngine<?> engine) {
		if (_executionContext === null) {
			_executionContext = engine.executionContext

			// load addon options from the execution context
			this.activateSaveOnEveryStep = _executionContext.runConfiguration.getAttribute(
				"org.eclipse.gemoc.trace.simple.addon.saveTraceOnStep", false);
			this.activateSaveOnEngineStop = _executionContext.runConfiguration.getAttribute(
				"org.eclipse.gemoc.trace.simple.addon.saveTraceOnEngineStop", true);

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

			traceConstructor.save()

		}
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
