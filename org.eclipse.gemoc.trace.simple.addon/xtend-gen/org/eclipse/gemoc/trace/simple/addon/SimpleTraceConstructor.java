package org.eclipse.gemoc.trace.simple.addon;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource;
import org.eclipse.gemoc.executionframework.debugger.DefaultDynamicPartAccessor;
import org.eclipse.gemoc.executionframework.debugger.IDynamicPartAccessor;
import org.eclipse.gemoc.executionframework.debugger.MutableField;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.simple.RuntimeBooleanValue;
import org.eclipse.gemoc.trace.simple.RuntimeContainmentValue;
import org.eclipse.gemoc.trace.simple.RuntimeExtension;
import org.eclipse.gemoc.trace.simple.RuntimeIntegerValue;
import org.eclipse.gemoc.trace.simple.RuntimeReferenceValue;
import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.RuntimeStringValue;
import org.eclipse.gemoc.trace.simple.RuntimeValue;
import org.eclipse.gemoc.trace.simple.SimpleFactory;
import org.eclipse.gemoc.trace.simple.SimpleTrace;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SimpleTraceConstructor {
  private SimpleTrace traceRoot;
  
  private Resource executedModel;
  
  private Resource traceResource;
  
  private final Deque<RuntimeStep> context = new LinkedList<RuntimeStep>();
  
  private RuntimeState lastState;
  
  private IDynamicPartAccessor dynamicPartAccessor = new DefaultDynamicPartAccessor();
  
  private SimpleFactory factory = SimpleFactory.eINSTANCE;
  
  public SimpleTraceConstructor(final Resource executedModel, final Resource traceResource) {
    this.executedModel = executedModel;
    this.traceResource = traceResource;
    this.dynamicPartAccessor = this.dynamicPartAccessor;
  }
  
  private Set<Resource> getAllExecutedModelResources() {
    Set<Resource> allResources = new HashSet<Resource>();
    allResources.add(this.executedModel);
    allResources.addAll(EMFResource.getRelatedResources(this.executedModel));
    final Predicate<Resource> _function = new Predicate<Resource>() {
      public boolean test(final Resource it) {
        return (it == null);
      }
    };
    allResources.removeIf(_function);
    return allResources;
  }
  
  public void addAllRuntimeExtensions(final RuntimeState state) {
    Set<Resource> allResources = this.getAllExecutedModelResources();
    this.lastState = SimpleFactory.eINSTANCE.createRuntimeState();
    for (final Resource r : allResources) {
      for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
        {
          final EObject o = i.next();
          boolean _isDynamic = SimpleDynamicAnnotationHelper.isDynamic(o.eClass());
          boolean _not = (!_isDynamic);
          if (_not) {
            this.addRuntimeExtensions(o, this.lastState);
          }
        }
      }
    }
  }
  
  public void addRuntimeExtensions(final EObject object, final RuntimeState state) {
    final List<MutableField> mutableFields = this.dynamicPartAccessor.extractMutableField(object);
    boolean _isEmpty = mutableFields.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final RuntimeExtension runtimeExtension = this.factory.createRuntimeExtension();
      runtimeExtension.setExtendedStaticElement(object);
      for (final MutableField field : mutableFields) {
        {
          final EStructuralFeature mutableProperty = field.getMutableProperty();
          int _upperBound = mutableProperty.getUpperBound();
          boolean _tripleEquals = (_upperBound == (-1));
          if (_tripleEquals) {
            throw new RuntimeException("Not managed");
          }
          RuntimeValue runtimeValue = null;
          if ((mutableProperty instanceof EAttribute)) {
            EClassifier _eType = field.getMutableProperty().getEType();
            boolean _matched = false;
            if (Objects.equal(_eType, EcorePackage.Literals.EINT)) {
              _matched=true;
              runtimeValue = this.factory.createRuntimeIntegerValue();
              Object _value = field.getValue();
              ((RuntimeIntegerValue) runtimeValue).setValue((((Integer) _value)).intValue());
            }
            if (!_matched) {
              if (Objects.equal(_eType, EcorePackage.Literals.ESTRING)) {
                _matched=true;
                runtimeValue = this.factory.createRuntimeStringValue();
                Object _value_1 = field.getValue();
                ((RuntimeStringValue) runtimeValue).setValue(((String) _value_1));
              }
            }
            if (!_matched) {
              if (Objects.equal(_eType, EcorePackage.Literals.EBOOLEAN)) {
                _matched=true;
                runtimeValue = this.factory.createRuntimeBooleanValue();
                Object _value_2 = field.getValue();
                ((RuntimeBooleanValue) runtimeValue).setValue((((Boolean) _value_2)).booleanValue());
              }
            }
            if (!_matched) {
              throw new RuntimeException("Not managed");
            }
          } else {
            if ((mutableProperty instanceof EReference)) {
              Object _value_3 = field.getValue();
              final EObject referencedElement = ((EObject) _value_3);
              if ((((EReference)mutableProperty).isContainment() && SimpleDynamicAnnotationHelper.isDynamic(((EReference)mutableProperty).getEType()))) {
                runtimeValue = this.factory.createRuntimeContainmentValue();
                ((RuntimeContainmentValue) runtimeValue).setRuntimeObject(EcoreUtil.<EObject>copy(referencedElement));
              } else {
                if (((!((EReference)mutableProperty).isContainment()) && 
                  (!SimpleDynamicAnnotationHelper.isDynamic(((EReference)mutableProperty).getEType())))) {
                  runtimeValue = this.factory.createRuntimeReferenceValue();
                  ((RuntimeReferenceValue) runtimeValue).setReferencedObject(referencedElement);
                } else {
                  throw new RuntimeException("Not managed");
                }
              }
            }
          }
          runtimeValue.setFeature(field.getMutableProperty());
          runtimeExtension.getRuntimeValues().add(runtimeValue);
          this.lastState.getRuntimeExtensions().add(runtimeExtension);
        }
      }
    }
  }
  
  public void addState(final List<ModelChange> modelChanges) {
    if (((this.lastState == null) || (!modelChanges.isEmpty()))) {
      this.lastState = SimpleFactory.eINSTANCE.createRuntimeState();
      this.addAllRuntimeExtensions(this.lastState);
      this.traceRoot.getStates().add(this.lastState);
    }
  }
  
  public void addStep(final Step<?> step) {
    final RuntimeStep newStep = this.factory.createRuntimeStep();
    newStep.setSemanticRuleName(step.getMseoccurrence().getMse().getName());
    newStep.setSemanticRuleTarget(step.getMseoccurrence().getMse().getCaller());
    this.lastState.getStartingSteps().add(newStep);
    if (((!this.context.isEmpty()) && (this.context.getFirst() != null))) {
      this.context.getFirst().getSubSteps().add(newStep);
    } else {
      this.traceRoot.getRootSteps().add(newStep);
    }
    this.context.push(newStep);
  }
  
  public void endStep(final Step<?> step) {
    RuntimeStep popped = this.context.pop();
    if ((popped != null)) {
      popped.setTargetState(this.lastState);
    }
  }
  
  public EObject initTrace() {
    this.traceRoot = SimpleFactory.eINSTANCE.createSimpleTrace();
    this.traceResource.getContents().add(this.traceRoot);
    return this.traceRoot;
  }
  
  public void save() {
    try {
      this.traceResource.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void save(final URI uri) {
    try {
      this.traceResource.setURI(uri);
      this.traceResource.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
