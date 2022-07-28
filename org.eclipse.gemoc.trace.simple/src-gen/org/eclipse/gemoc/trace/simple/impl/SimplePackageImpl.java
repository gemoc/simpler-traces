/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.simple.RuntimeBooleanValue;
import org.eclipse.gemoc.trace.simple.RuntimeContainmentValue;
import org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement;
import org.eclipse.gemoc.trace.simple.RuntimeIntegerValue;
import org.eclipse.gemoc.trace.simple.RuntimeNullValue;
import org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding;
import org.eclipse.gemoc.trace.simple.RuntimeOnlyElement;
import org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion;
import org.eclipse.gemoc.trace.simple.RuntimeReferenceValue;
import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.RuntimeStringValue;
import org.eclipse.gemoc.trace.simple.RuntimeValue;
import org.eclipse.gemoc.trace.simple.SimpleFactory;
import org.eclipse.gemoc.trace.simple.SimplePackage;
import org.eclipse.gemoc.trace.simple.SimpleTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplePackageImpl extends EPackageImpl implements SimplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeIntegerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeExtensionOfStaticElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeContainmentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeOnlyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeOnlyElementVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeNullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeObjectValueBindingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplePackageImpl() {
		super(eNS_URI, SimpleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplePackage init() {
		if (isInited)
			return (SimplePackage) EPackage.Registry.INSTANCE.getEPackage(SimplePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimplePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimplePackageImpl theSimplePackage = registeredSimplePackage instanceof SimplePackageImpl
				? (SimplePackageImpl) registeredSimplePackage
				: new SimplePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimplePackage.createPackageContents();

		// Initialize created meta-data
		theSimplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplePackage.eNS_URI, theSimplePackage);
		return theSimplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTrace() {
		return simpleTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTrace_States() {
		return (EReference) simpleTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTrace_RootSteps() {
		return (EReference) simpleTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTrace_RuntimeOnlyElements() {
		return (EReference) simpleTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeState() {
		return runtimeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeState_RuntimeExtensions() {
		return (EReference) runtimeStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeState_StartingSteps() {
		return (EReference) runtimeStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeState_EndingSteps() {
		return (EReference) runtimeStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeStep() {
		return runtimeStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_SubSteps() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_SourceState() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_TargetState() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeStep_SemanticRuleName() {
		return (EAttribute) runtimeStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_SemanticRuleStaticTarget() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_SemanticRuleParameters() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeStep_SemanticRuleResult() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeValue() {
		return runtimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeIntegerValue() {
		return runtimeIntegerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeIntegerValue_Value() {
		return (EAttribute) runtimeIntegerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeReferenceValue() {
		return runtimeReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeReferenceValue_ReferencedObject() {
		return (EReference) runtimeReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeBooleanValue() {
		return runtimeBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeBooleanValue_Value() {
		return (EAttribute) runtimeBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeStringValue() {
		return runtimeStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuntimeStringValue_Value() {
		return (EAttribute) runtimeStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeExtensionOfStaticElement() {
		return runtimeExtensionOfStaticElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeExtensionOfStaticElement_ExtendedStaticElement() {
		return (EReference) runtimeExtensionOfStaticElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeExtensionOfStaticElement_RuntimeBindings() {
		return (EReference) runtimeExtensionOfStaticElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeContainmentValue() {
		return runtimeContainmentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeContainmentValue_RuntimeObject() {
		return (EReference) runtimeContainmentValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeOnlyElement() {
		return runtimeOnlyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeOnlyElement_Versions() {
		return (EReference) runtimeOnlyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeOnlyElementVersion() {
		return runtimeOnlyElementVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeOnlyElementVersion_RuntimeState() {
		return (EReference) runtimeOnlyElementVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeOnlyElementVersion_Element() {
		return (EReference) runtimeOnlyElementVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeNullValue() {
		return runtimeNullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeObjectValueBinding() {
		return runtimeObjectValueBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeObjectValueBinding_Feature() {
		return (EReference) runtimeObjectValueBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeObjectValueBinding_RuntimeValue() {
		return (EReference) runtimeObjectValueBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFactory getSimpleFactory() {
		return (SimpleFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		simpleTraceEClass = createEClass(SIMPLE_TRACE);
		createEReference(simpleTraceEClass, SIMPLE_TRACE__STATES);
		createEReference(simpleTraceEClass, SIMPLE_TRACE__ROOT_STEPS);
		createEReference(simpleTraceEClass, SIMPLE_TRACE__RUNTIME_ONLY_ELEMENTS);

		runtimeStateEClass = createEClass(RUNTIME_STATE);
		createEReference(runtimeStateEClass, RUNTIME_STATE__RUNTIME_EXTENSIONS);
		createEReference(runtimeStateEClass, RUNTIME_STATE__STARTING_STEPS);
		createEReference(runtimeStateEClass, RUNTIME_STATE__ENDING_STEPS);

		runtimeStepEClass = createEClass(RUNTIME_STEP);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SUB_STEPS);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SOURCE_STATE);
		createEReference(runtimeStepEClass, RUNTIME_STEP__TARGET_STATE);
		createEAttribute(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_NAME);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_RESULT);

		runtimeValueEClass = createEClass(RUNTIME_VALUE);

		runtimeIntegerValueEClass = createEClass(RUNTIME_INTEGER_VALUE);
		createEAttribute(runtimeIntegerValueEClass, RUNTIME_INTEGER_VALUE__VALUE);

		runtimeReferenceValueEClass = createEClass(RUNTIME_REFERENCE_VALUE);
		createEReference(runtimeReferenceValueEClass, RUNTIME_REFERENCE_VALUE__REFERENCED_OBJECT);

		runtimeBooleanValueEClass = createEClass(RUNTIME_BOOLEAN_VALUE);
		createEAttribute(runtimeBooleanValueEClass, RUNTIME_BOOLEAN_VALUE__VALUE);

		runtimeStringValueEClass = createEClass(RUNTIME_STRING_VALUE);
		createEAttribute(runtimeStringValueEClass, RUNTIME_STRING_VALUE__VALUE);

		runtimeExtensionOfStaticElementEClass = createEClass(RUNTIME_EXTENSION_OF_STATIC_ELEMENT);
		createEReference(runtimeExtensionOfStaticElementEClass,
				RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT);
		createEReference(runtimeExtensionOfStaticElementEClass, RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS);

		runtimeContainmentValueEClass = createEClass(RUNTIME_CONTAINMENT_VALUE);
		createEReference(runtimeContainmentValueEClass, RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT);

		runtimeOnlyElementEClass = createEClass(RUNTIME_ONLY_ELEMENT);
		createEReference(runtimeOnlyElementEClass, RUNTIME_ONLY_ELEMENT__VERSIONS);

		runtimeOnlyElementVersionEClass = createEClass(RUNTIME_ONLY_ELEMENT_VERSION);
		createEReference(runtimeOnlyElementVersionEClass, RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE);
		createEReference(runtimeOnlyElementVersionEClass, RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT);

		runtimeNullValueEClass = createEClass(RUNTIME_NULL_VALUE);

		runtimeObjectValueBindingEClass = createEClass(RUNTIME_OBJECT_VALUE_BINDING);
		createEReference(runtimeObjectValueBindingEClass, RUNTIME_OBJECT_VALUE_BINDING__FEATURE);
		createEReference(runtimeObjectValueBindingEClass, RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		runtimeIntegerValueEClass.getESuperTypes().add(this.getRuntimeValue());
		runtimeReferenceValueEClass.getESuperTypes().add(this.getRuntimeValue());
		runtimeBooleanValueEClass.getESuperTypes().add(this.getRuntimeValue());
		runtimeStringValueEClass.getESuperTypes().add(this.getRuntimeValue());
		runtimeContainmentValueEClass.getESuperTypes().add(this.getRuntimeValue());
		runtimeNullValueEClass.getESuperTypes().add(this.getRuntimeValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(simpleTraceEClass, SimpleTrace.class, "SimpleTrace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTrace_States(), this.getRuntimeState(), null, "states", null, 1, -1, SimpleTrace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTrace_RootSteps(), this.getRuntimeStep(), null, "rootSteps", null, 1, -1,
				SimpleTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTrace_RuntimeOnlyElements(), this.getRuntimeOnlyElement(), null, "runtimeOnlyElements",
				null, 0, -1, SimpleTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeStateEClass, RuntimeState.class, "RuntimeState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeState_RuntimeExtensions(), this.getRuntimeExtensionOfStaticElement(), null,
				"runtimeExtensions", null, 0, -1, RuntimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeState_StartingSteps(), this.getRuntimeStep(), this.getRuntimeStep_SourceState(),
				"startingSteps", null, 0, -1, RuntimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeState_EndingSteps(), this.getRuntimeStep(), this.getRuntimeStep_TargetState(),
				"endingSteps", null, 0, -1, RuntimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeStepEClass, RuntimeStep.class, "RuntimeStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeStep_SubSteps(), this.getRuntimeStep(), null, "subSteps", null, 0, -1,
				RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeStep_SourceState(), this.getRuntimeState(), this.getRuntimeState_StartingSteps(),
				"sourceState", null, 1, 1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeStep_TargetState(), this.getRuntimeState(), this.getRuntimeState_EndingSteps(),
				"targetState", null, 0, 1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuntimeStep_SemanticRuleName(), ecorePackage.getEString(), "semanticRuleName", null, 1, 1,
				RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeStep_SemanticRuleStaticTarget(), theEcorePackage.getEObject(), null,
				"semanticRuleStaticTarget", null, 1, 1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeStep_SemanticRuleParameters(), this.getRuntimeValue(), null, "semanticRuleParameters",
				null, 0, -1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeStep_SemanticRuleResult(), this.getRuntimeValue(), null, "semanticRuleResult", null, 0,
				1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeValueEClass, RuntimeValue.class, "RuntimeValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeIntegerValueEClass, RuntimeIntegerValue.class, "RuntimeIntegerValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1,
				RuntimeIntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeReferenceValueEClass, RuntimeReferenceValue.class, "RuntimeReferenceValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeReferenceValue_ReferencedObject(), theEcorePackage.getEObject(), null,
				"referencedObject", null, 0, 1, RuntimeReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeBooleanValueEClass, RuntimeBooleanValue.class, "RuntimeBooleanValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1,
				RuntimeBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeStringValueEClass, RuntimeStringValue.class, "RuntimeStringValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuntimeStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				RuntimeStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(runtimeExtensionOfStaticElementEClass, RuntimeExtensionOfStaticElement.class,
				"RuntimeExtensionOfStaticElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeExtensionOfStaticElement_ExtendedStaticElement(), theEcorePackage.getEObject(), null,
				"extendedStaticElement", null, 1, 1, RuntimeExtensionOfStaticElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeExtensionOfStaticElement_RuntimeBindings(), this.getRuntimeObjectValueBinding(), null,
				"runtimeBindings", null, 1, -1, RuntimeExtensionOfStaticElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeContainmentValueEClass, RuntimeContainmentValue.class, "RuntimeContainmentValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeContainmentValue_RuntimeObject(), theEcorePackage.getEObject(), null, "runtimeObject",
				null, 0, 1, RuntimeContainmentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeOnlyElementEClass, RuntimeOnlyElement.class, "RuntimeOnlyElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeOnlyElement_Versions(), this.getRuntimeOnlyElementVersion(), null, "versions", null, 1,
				-1, RuntimeOnlyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeOnlyElementVersionEClass, RuntimeOnlyElementVersion.class, "RuntimeOnlyElementVersion",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeOnlyElementVersion_RuntimeState(), this.getRuntimeState(), null, "runtimeState", null,
				1, 1, RuntimeOnlyElementVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeOnlyElementVersion_Element(), theEcorePackage.getEObject(), null, "element", null, 1,
				1, RuntimeOnlyElementVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeNullValueEClass, RuntimeNullValue.class, "RuntimeNullValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeObjectValueBindingEClass, RuntimeObjectValueBinding.class, "RuntimeObjectValueBinding",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeObjectValueBinding_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature",
				null, 1, 1, RuntimeObjectValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeObjectValueBinding_RuntimeValue(), this.getRuntimeValue(), null, "runtimeValue", null,
				1, 1, RuntimeObjectValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplePackageImpl
