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
import org.eclipse.gemoc.trace.simple.RuntimeExtension;
import org.eclipse.gemoc.trace.simple.RuntimeIntegerValue;
import org.eclipse.gemoc.trace.simple.RuntimeObject;
import org.eclipse.gemoc.trace.simple.RuntimeObjectVersion;
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
	private EClass runtimeExtensionEClass = null;

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
	private EClass runtimeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeObjectVersionEClass = null;

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
	public EReference getSimpleTrace_RuntimeObjects() {
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
	public EReference getRuntimeStep_SemanticRuleTarget() {
		return (EReference) runtimeStepEClass.getEStructuralFeatures().get(4);
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
	public EReference getRuntimeValue_Feature() {
		return (EReference) runtimeValueEClass.getEStructuralFeatures().get(0);
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
	public EClass getRuntimeExtension() {
		return runtimeExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeExtension_RuntimeValues() {
		return (EReference) runtimeExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeExtension_ExtendedStaticElement() {
		return (EReference) runtimeExtensionEClass.getEStructuralFeatures().get(1);
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
	public EClass getRuntimeObject() {
		return runtimeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeObject_Versions() {
		return (EReference) runtimeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeObjectVersion() {
		return runtimeObjectVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeObjectVersion_RuntimeState() {
		return (EReference) runtimeObjectVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuntimeObjectVersion_Value() {
		return (EReference) runtimeObjectVersionEClass.getEStructuralFeatures().get(1);
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
		createEReference(simpleTraceEClass, SIMPLE_TRACE__RUNTIME_OBJECTS);

		runtimeStateEClass = createEClass(RUNTIME_STATE);
		createEReference(runtimeStateEClass, RUNTIME_STATE__RUNTIME_EXTENSIONS);
		createEReference(runtimeStateEClass, RUNTIME_STATE__STARTING_STEPS);
		createEReference(runtimeStateEClass, RUNTIME_STATE__ENDING_STEPS);

		runtimeStepEClass = createEClass(RUNTIME_STEP);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SUB_STEPS);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SOURCE_STATE);
		createEReference(runtimeStepEClass, RUNTIME_STEP__TARGET_STATE);
		createEAttribute(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_NAME);
		createEReference(runtimeStepEClass, RUNTIME_STEP__SEMANTIC_RULE_TARGET);

		runtimeValueEClass = createEClass(RUNTIME_VALUE);
		createEReference(runtimeValueEClass, RUNTIME_VALUE__FEATURE);

		runtimeIntegerValueEClass = createEClass(RUNTIME_INTEGER_VALUE);
		createEAttribute(runtimeIntegerValueEClass, RUNTIME_INTEGER_VALUE__VALUE);

		runtimeReferenceValueEClass = createEClass(RUNTIME_REFERENCE_VALUE);
		createEReference(runtimeReferenceValueEClass, RUNTIME_REFERENCE_VALUE__REFERENCED_OBJECT);

		runtimeBooleanValueEClass = createEClass(RUNTIME_BOOLEAN_VALUE);
		createEAttribute(runtimeBooleanValueEClass, RUNTIME_BOOLEAN_VALUE__VALUE);

		runtimeStringValueEClass = createEClass(RUNTIME_STRING_VALUE);
		createEAttribute(runtimeStringValueEClass, RUNTIME_STRING_VALUE__VALUE);

		runtimeExtensionEClass = createEClass(RUNTIME_EXTENSION);
		createEReference(runtimeExtensionEClass, RUNTIME_EXTENSION__RUNTIME_VALUES);
		createEReference(runtimeExtensionEClass, RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT);

		runtimeContainmentValueEClass = createEClass(RUNTIME_CONTAINMENT_VALUE);
		createEReference(runtimeContainmentValueEClass, RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT);

		runtimeObjectEClass = createEClass(RUNTIME_OBJECT);
		createEReference(runtimeObjectEClass, RUNTIME_OBJECT__VERSIONS);

		runtimeObjectVersionEClass = createEClass(RUNTIME_OBJECT_VERSION);
		createEReference(runtimeObjectVersionEClass, RUNTIME_OBJECT_VERSION__RUNTIME_STATE);
		createEReference(runtimeObjectVersionEClass, RUNTIME_OBJECT_VERSION__VALUE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(simpleTraceEClass, SimpleTrace.class, "SimpleTrace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTrace_States(), this.getRuntimeState(), null, "states", null, 1, -1, SimpleTrace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTrace_RootSteps(), this.getRuntimeStep(), null, "rootSteps", null, 1, -1,
				SimpleTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleTrace_RuntimeObjects(), this.getRuntimeObject(), null, "runtimeObjects", null, 0, -1,
				SimpleTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeStateEClass, RuntimeState.class, "RuntimeState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeState_RuntimeExtensions(), this.getRuntimeExtension(), null, "runtimeExtensions", null,
				0, -1, RuntimeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getRuntimeStep_SemanticRuleTarget(), theEcorePackage.getEObject(), null, "semanticRuleTarget",
				null, 1, 1, RuntimeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeValueEClass, RuntimeValue.class, "RuntimeValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeValue_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1,
				RuntimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(runtimeExtensionEClass, RuntimeExtension.class, "RuntimeExtension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeExtension_RuntimeValues(), this.getRuntimeValue(), null, "runtimeValues", null, 1, -1,
				RuntimeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeExtension_ExtendedStaticElement(), theEcorePackage.getEObject(), null,
				"extendedStaticElement", null, 1, 1, RuntimeExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeContainmentValueEClass, RuntimeContainmentValue.class, "RuntimeContainmentValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeContainmentValue_RuntimeObject(), theEcorePackage.getEObject(), null, "runtimeObject",
				null, 0, 1, RuntimeContainmentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeObjectEClass, RuntimeObject.class, "RuntimeObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeObject_Versions(), this.getRuntimeObjectVersion(), null, "versions", null, 1, -1,
				RuntimeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeObjectVersionEClass, RuntimeObjectVersion.class, "RuntimeObjectVersion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuntimeObjectVersion_RuntimeState(), this.getRuntimeState(), null, "runtimeState", null, 1, 1,
				RuntimeObjectVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuntimeObjectVersion_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1,
				RuntimeObjectVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplePackageImpl
