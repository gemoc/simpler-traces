package org.eclipse.gemoc.trace.simple.addon

import java.io.IOException
import java.util.Deque
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource
import org.eclipse.gemoc.executionframework.debugger.DefaultDynamicPartAccessor
import org.eclipse.gemoc.executionframework.debugger.IDynamicPartAccessor
import org.eclipse.gemoc.trace.commons.model.trace.Step
import org.eclipse.gemoc.trace.simple.RuntimeBooleanValue
import org.eclipse.gemoc.trace.simple.RuntimeContainmentValue
import org.eclipse.gemoc.trace.simple.RuntimeIntegerValue
import org.eclipse.gemoc.trace.simple.RuntimeOnlyElement
import org.eclipse.gemoc.trace.simple.RuntimeReferenceValue
import org.eclipse.gemoc.trace.simple.RuntimeState
import org.eclipse.gemoc.trace.simple.RuntimeStep
import org.eclipse.gemoc.trace.simple.RuntimeStringValue
import org.eclipse.gemoc.trace.simple.RuntimeValue
import org.eclipse.gemoc.trace.simple.SimpleFactory
import org.eclipse.gemoc.trace.simple.SimpleTrace
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange
import java.util.Collection

class SimpleTraceConstructor {
	SimpleTrace traceRoot
	Resource executedModel
	Resource traceResource
	final Deque<RuntimeStep> context = new LinkedList()
	RuntimeState lastState
	IDynamicPartAccessor dynamicPartAccessor = new DefaultDynamicPartAccessor
	SimpleFactory factory = SimpleFactory.eINSTANCE
	var stateCounter = 0
	var stepCounter = 0

	Map<EObject, RuntimeOnlyElement> exe2trace = new HashMap

	new(Resource executedModel, Resource traceResource) {
		this.executedModel = executedModel
		this.traceResource = traceResource
		this.dynamicPartAccessor = dynamicPartAccessor
	}

	def private Set<Resource> getAllExecutedModelResources() {
		var Set<Resource> allResources = new HashSet()
		allResources.add(executedModel)
		allResources.addAll(EMFResource.getRelatedResources(executedModel))
		allResources.removeIf([it === null])
		return allResources
	}

	def createState() {
		var Set<Resource> allResources = getAllExecutedModelResources()
		val state = SimpleFactory.eINSTANCE.createRuntimeState()
		state.number = stateCounter++
		for (Resource r : allResources) {
			for (var TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
				val EObject o = i.next()

				// We only look at *static* objects (that may contain runtime extensions)
				if (!SimpleDynamicAnnotationHelper.isDynamic(o.eClass)) {
					addRuntimeExtensions(o, state)
				}
			}
		}
		return state
	}

	def addRuntimeExtensions(EObject object, RuntimeState state) {
		val mutableFields = dynamicPartAccessor.extractMutableField(object)

		if (!mutableFields.empty) {

			val runtimeExtension = factory.createRuntimeExtensionOfStaticElement
			runtimeExtension.extendedStaticElement = object

			for (field : mutableFields) {
				val mutableProperty = field.mutableProperty

				if (mutableProperty.upperBound === -1) {
					throw new RuntimeException("Not managed")
				}

				var RuntimeValue runtimeValue
				if (mutableProperty instanceof EAttribute) {
					switch (field.mutableProperty.EType) {
						case EcorePackage.Literals.EINT: {
							runtimeValue = factory.createRuntimeIntegerValue;
							(runtimeValue as RuntimeIntegerValue).value = field.value as Integer
						}
						case EcorePackage.Literals.ESTRING: {
							runtimeValue = factory.createRuntimeStringValue;
							(runtimeValue as RuntimeStringValue).value = field.value as String
						}
						case EcorePackage.Literals.EBOOLEAN: {
							runtimeValue = factory.createRuntimeBooleanValue;
							(runtimeValue as RuntimeBooleanValue).value = field.value as Boolean
						}
						default:
							throw new RuntimeException("Not managed")
					}

				} else if (mutableProperty instanceof EReference) {
					val referencedElement = field.value as EObject

					// If the referenced element is a contained runtime element, we make a deep copy
					if (mutableProperty.containment && SimpleDynamicAnnotationHelper.isDynamic(mutableProperty.EType)) {
						runtimeValue = factory.createRuntimeContainmentValue;
						val EcoreUtil.Copier copier = new EcoreUtil.Copier();
						(runtimeValue as RuntimeContainmentValue).runtimeObject = copier.copy(referencedElement)
						copier.copyReferences()

						// Browse all copied objects, and add them as RuntimeObjects (or update existing RuntimeObjects)
						for (exeObject : copier.keySet()) {
							val copiedObject = copier.get(exeObject)
							val traceObject = createOrGetRuntimeObjectOf(exeObject)
							val version = factory.createRuntimeOnlyElementVersion
							version.runtimeState = state
							version.element = copiedObject
							traceObject.versions.add(version)
						}

					} // If the referenced element is a referenced static element, we copy the reference
					else if (!mutableProperty.containment &&
						!SimpleDynamicAnnotationHelper.isDynamic(mutableProperty.EType)) {
						runtimeValue = factory.createRuntimeReferenceValue;
						(runtimeValue as RuntimeReferenceValue).referencedObject = referencedElement

					} // Else we crash
					else {
						throw new RuntimeException("Not managed")
					}
				}
				val binding = factory.createRuntimeObjectValueBinding
				binding.feature = field.mutableProperty
				binding.runtimeValue = runtimeValue
				runtimeExtension.runtimeBindings.add(binding)
				state.runtimeExtensions.add(runtimeExtension)
			}

		}

	}

	def void addState(List<ModelChange> modelChanges) {
		if (this.lastState === null || !modelChanges.isEmpty()) {
			this.lastState = createState()
			this.traceRoot.getStates().add(lastState)
		}
	}

	def void addStep(Step<?> step) {
		val newStep = factory.createRuntimeStep
		newStep.number = stepCounter++
		newStep.semanticRuleName = step.mseoccurrence.mse.name
		newStep.semanticRuleStaticTarget = step.mseoccurrence.mse.caller

		for (param : step.mseoccurrence.parameters) {
			newStep.semanticRuleParameters.add(javaObjectToRuntimeValue(param))
		}

		lastState.startingSteps.add(newStep)
		if (!context.isEmpty() && context.getFirst() !== null) {
			context.getFirst().getSubSteps().add(newStep)
		} else {
			traceRoot.getRootSteps().add(newStep)
		}
		context.push(newStep)
	}

	def void endStep(Step<?> step) {
		var RuntimeStep popped = context.pop()
		if (!step.mseoccurrence.result.isEmpty) {
			popped.semanticRuleResult = javaObjectToRuntimeValue(step.mseoccurrence.result.get(0))
		}
		if(popped !== null) popped.targetState = (lastState)
	}

	private def RuntimeValue javaObjectToRuntimeValue(Object object) {
		return if (object === null) {
			(factory.createRuntimeNullValue)
		} else if (object instanceof EObject) {
			val reference = factory.createRuntimeReferenceValue
			reference.referencedObject = if (SimpleDynamicAnnotationHelper.isDynamic(object.eClass)) {
				createOrGetRuntimeObjectOf(object)
			} else {
				object
			}
			reference
		} else if (object instanceof Integer) {
			val intValue = factory.createRuntimeIntegerValue
			intValue.value = object
			intValue
		} else if (object instanceof Boolean) {
			val boolValue = factory.createRuntimeBooleanValue
			boolValue.value = object
			boolValue
		} else if (object instanceof String) {
			val stringValue = factory.createRuntimeStringValue
			stringValue.value = object
			stringValue
		} else if (object instanceof Collection) {
			val collection = factory.createRuntimeCollection
			for (Object content : object) {
				collection.contents.add(javaObjectToRuntimeValue(content))
			}
			collection
		} else {
			throw new Exception("Cannot store this value in the simple trace: " + object)
		}
	}

	def RuntimeOnlyElement createOrGetRuntimeObjectOf(EObject exeObject) {
		if (!exe2trace.containsKey(exeObject)) {
			val traceObject = factory.createRuntimeOnlyElement
			exe2trace.put(exeObject, traceObject)
			this.traceRoot.runtimeOnlyElements.add(traceObject)
		}
		return exe2trace.get(exeObject)
	}

	def EObject initTrace() {
		traceRoot = SimpleFactory.eINSTANCE.createSimpleTrace()
		traceResource.getContents().add(traceRoot)
		return traceRoot
	}

	def void save() {
		try {
			traceResource.save(null)
		} catch (IOException e) {
			e.printStackTrace()
		}

	}

	def void save(URI uri) {
		try {
			traceResource.setURI(uri)
			traceResource.save(null)
		} catch (IOException e) {
			e.printStackTrace()
		}

	}

}
