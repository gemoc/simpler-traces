package org.eclipse.gemoc.trace.simple.addon;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource;
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.simple.SimpleTrace;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimpleTraceAddon implements IEngineAddon {
  private IExecutionContext<?, ?, ?> _executionContext;
  
  private boolean needTransaction = true;
  
  private BatchModelChangeListener listenerAddon;
  
  private SimpleTrace trace;
  
  private SimpleTraceConstructor traceConstructor;
  
  protected boolean activateUpdateEquivalenceClasses = true;
  
  protected boolean activateSaveOnEveryStep = true;
  
  protected boolean activateSaveOnEngineStop = true;
  
  public void aboutToExecuteStep(final IExecutionEngine<?> executionEngine, final Step<?> step) {
    this.manageStep(step, true);
  }
  
  public void stepExecuted(final IExecutionEngine<?> engine, final Step<?> step) {
    this.manageStep(step, false);
  }
  
  private void manageStep(final Step<?> step, final boolean add) {
    if ((step != null)) {
      final Runnable _function = new Runnable() {
        public void run() {
          SimpleTraceAddon.this.traceConstructor.addState(SimpleTraceAddon.this.listenerAddon.getChanges(SimpleTraceAddon.this));
          if (add) {
            SimpleTraceAddon.this.traceConstructor.addStep(step);
          } else {
            SimpleTraceAddon.this.traceConstructor.endStep(step);
          }
        }
      };
      this.modifyTrace(_function);
      if (this.activateSaveOnEveryStep) {
        this.traceConstructor.save();
      }
    }
  }
  
  /**
   * To construct the trace manager
   */
  public void engineAboutToStart(final IExecutionEngine<?> engine) {
    if ((this._executionContext == null)) {
      this._executionContext = engine.getExecutionContext();
      this.activateSaveOnEveryStep = (this._executionContext.getRunConfiguration().getAttribute(
        "org.eclipse.gemoc.trace.simple.addon.saveTraceOnStep", Boolean.valueOf(false))).booleanValue();
      this.activateSaveOnEngineStop = (this._executionContext.getRunConfiguration().getAttribute(
        "org.eclipse.gemoc.trace.simple.addon.saveTraceOnEngineStop", Boolean.valueOf(true))).booleanValue();
      final Resource modelResource = this._executionContext.getResourceModel();
      final ResourceSet rs = new ResourceSetImpl();
      final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(rs);
      this.needTransaction = (ed != null);
      String _string = this._executionContext.getWorkspace().getExecutionPath().toString();
      String _plus = (_string + "/execution.simpletrace");
      final URI traceModelURI = URI.createPlatformResourceURI(_plus, false);
      final Resource traceResource = rs.createResource(traceModelURI);
      Set<Resource> _relatedResources = EMFResource.getRelatedResources(engine.getExecutionContext().getResourceModel());
      BatchModelChangeListener _batchModelChangeListener = new BatchModelChangeListener(_relatedResources);
      this.listenerAddon = _batchModelChangeListener;
      this.listenerAddon.registerObserver(this);
      SimpleTraceConstructor _simpleTraceConstructor = new SimpleTraceConstructor(modelResource, traceResource);
      this.traceConstructor = _simpleTraceConstructor;
      final Runnable _function = new Runnable() {
        public void run() {
          SimpleTraceAddon.this.traceConstructor.initTrace();
        }
      };
      this.modifyTrace(_function);
    }
  }
  
  public void engineStopped(final IExecutionEngine<?> engine) {
    if (this.activateSaveOnEngineStop) {
      this.traceConstructor.save();
    }
  }
  
  /**
   * Wrapper using lambda to always use a RecordingCommand when modifying the trace
   */
  private void modifyTrace(final Runnable r, final String message) {
    try {
      if (this.needTransaction) {
        final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(this._executionContext.getResourceModel());
        final Set<Throwable> catchedException = new HashSet<Throwable>();
        RecordingCommand command = new RecordingCommand(ed, message) {
          protected void doExecute() {
            try {
              r.run();
            } catch (final Throwable _t) {
              if (_t instanceof Throwable) {
                final Throwable t = (Throwable)_t;
                catchedException.add(t);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        };
        CommandExecution.execute(ed, command);
        boolean _isEmpty = catchedException.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          throw IterableExtensions.<Throwable>head(catchedException);
        }
      } else {
        r.run();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Same as above, but without message.
   */
  private void modifyTrace(final Runnable r) {
    this.modifyTrace(r, "");
  }
  
  public SimpleTrace getTrace() {
    return this.trace;
  }
}
