/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.trace.simple.SimpleFactory
 * @model kind="package"
 * @generated
 */
public interface SimplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simple";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simple";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simple";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplePackage eINSTANCE = org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getSimpleTrace()
	 * @generated
	 */
	int SIMPLE_TRACE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRACE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Root Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRACE__ROOT_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Runtime Only Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRACE__RUNTIME_ONLY_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl <em>Runtime State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeState()
	 * @generated
	 */
	int RUNTIME_STATE = 1;

	/**
	 * The feature id for the '<em><b>Runtime Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STATE__RUNTIME_EXTENSIONS = 0;

	/**
	 * The feature id for the '<em><b>Starting Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STATE__STARTING_STEPS = 1;

	/**
	 * The feature id for the '<em><b>Ending Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STATE__ENDING_STEPS = 2;

	/**
	 * The number of structural features of the '<em>Runtime State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Runtime State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl <em>Runtime Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeStep()
	 * @generated
	 */
	int RUNTIME_STEP = 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SUB_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SOURCE_STATE = 1;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__TARGET_STATE = 2;

	/**
	 * The feature id for the '<em><b>Semantic Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SEMANTIC_RULE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Semantic Rule Static Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Semantic Rule Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Rule Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP__SEMANTIC_RULE_RESULT = 6;

	/**
	 * The number of structural features of the '<em>Runtime Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Runtime Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeValueImpl <em>Runtime Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeValue()
	 * @generated
	 */
	int RUNTIME_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Runtime Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeIntegerValueImpl <em>Runtime Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeIntegerValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeIntegerValue()
	 * @generated
	 */
	int RUNTIME_INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INTEGER_VALUE__VALUE = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INTEGER_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_INTEGER_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeReferenceValueImpl <em>Runtime Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeReferenceValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeReferenceValue()
	 * @generated
	 */
	int RUNTIME_REFERENCE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_REFERENCE_VALUE__REFERENCED_OBJECT = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_REFERENCE_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_REFERENCE_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeBooleanValueImpl <em>Runtime Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeBooleanValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeBooleanValue()
	 * @generated
	 */
	int RUNTIME_BOOLEAN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BOOLEAN_VALUE__VALUE = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BOOLEAN_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BOOLEAN_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStringValueImpl <em>Runtime String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStringValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeStringValue()
	 * @generated
	 */
	int RUNTIME_STRING_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STRING_VALUE__VALUE = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STRING_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_STRING_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl <em>Runtime Extension Of Static Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeExtensionOfStaticElement()
	 * @generated
	 */
	int RUNTIME_EXTENSION_OF_STATIC_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Extended Static Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Runtime Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS = 1;

	/**
	 * The number of structural features of the '<em>Runtime Extension Of Static Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXTENSION_OF_STATIC_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runtime Extension Of Static Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXTENSION_OF_STATIC_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeContainmentValueImpl <em>Runtime Containment Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeContainmentValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeContainmentValue()
	 * @generated
	 */
	int RUNTIME_CONTAINMENT_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Runtime Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime Containment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONTAINMENT_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime Containment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_CONTAINMENT_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementImpl <em>Runtime Only Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeOnlyElement()
	 * @generated
	 */
	int RUNTIME_ONLY_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT__VERSIONS = 0;

	/**
	 * The number of structural features of the '<em>Runtime Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runtime Only Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl <em>Runtime Only Element Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeOnlyElementVersion()
	 * @generated
	 */
	int RUNTIME_ONLY_ELEMENT_VERSION = 11;

	/**
	 * The feature id for the '<em><b>Runtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Runtime Only Element Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runtime Only Element Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_ONLY_ELEMENT_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeNullValueImpl <em>Runtime Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeNullValueImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeNullValue()
	 * @generated
	 */
	int RUNTIME_NULL_VALUE = 12;

	/**
	 * The number of structural features of the '<em>Runtime Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_NULL_VALUE_FEATURE_COUNT = RUNTIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runtime Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_NULL_VALUE_OPERATION_COUNT = RUNTIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl <em>Runtime Object Value Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl
	 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeObjectValueBinding()
	 * @generated
	 */
	int RUNTIME_OBJECT_VALUE_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OBJECT_VALUE_BINDING__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Runtime Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Runtime Object Value Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OBJECT_VALUE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runtime Object Value Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OBJECT_VALUE_BINDING_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.SimpleTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.gemoc.trace.simple.SimpleTrace
	 * @generated
	 */
	EClass getSimpleTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.SimpleTrace#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.eclipse.gemoc.trace.simple.SimpleTrace#getStates()
	 * @see #getSimpleTrace()
	 * @generated
	 */
	EReference getSimpleTrace_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.SimpleTrace#getRootSteps <em>Root Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Steps</em>'.
	 * @see org.eclipse.gemoc.trace.simple.SimpleTrace#getRootSteps()
	 * @see #getSimpleTrace()
	 * @generated
	 */
	EReference getSimpleTrace_RootSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.SimpleTrace#getRuntimeOnlyElements <em>Runtime Only Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Only Elements</em>'.
	 * @see org.eclipse.gemoc.trace.simple.SimpleTrace#getRuntimeOnlyElements()
	 * @see #getSimpleTrace()
	 * @generated
	 */
	EReference getSimpleTrace_RuntimeOnlyElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeState <em>Runtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime State</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState
	 * @generated
	 */
	EClass getRuntimeState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getRuntimeExtensions <em>Runtime Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Extensions</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState#getRuntimeExtensions()
	 * @see #getRuntimeState()
	 * @generated
	 */
	EReference getRuntimeState_RuntimeExtensions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getStartingSteps <em>Starting Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starting Steps</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState#getStartingSteps()
	 * @see #getRuntimeState()
	 * @generated
	 */
	EReference getRuntimeState_StartingSteps();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getEndingSteps <em>Ending Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ending Steps</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState#getEndingSteps()
	 * @see #getRuntimeState()
	 * @generated
	 */
	EReference getRuntimeState_EndingSteps();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeStep <em>Runtime Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Step</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep
	 * @generated
	 */
	EClass getRuntimeStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSubSteps()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_SubSteps();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_SourceState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_TargetState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleName <em>Semantic Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Rule Name</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleName()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EAttribute getRuntimeStep_SemanticRuleName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleStaticTarget <em>Semantic Rule Static Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semantic Rule Static Target</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleStaticTarget()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_SemanticRuleStaticTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleParameters <em>Semantic Rule Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semantic Rule Parameters</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleParameters()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_SemanticRuleParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleResult <em>Semantic Rule Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantic Rule Result</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleResult()
	 * @see #getRuntimeStep()
	 * @generated
	 */
	EReference getRuntimeStep_SemanticRuleResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeValue <em>Runtime Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeValue
	 * @generated
	 */
	EClass getRuntimeValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeIntegerValue <em>Runtime Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Integer Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeIntegerValue
	 * @generated
	 */
	EClass getRuntimeIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.trace.simple.RuntimeIntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeIntegerValue#getValue()
	 * @see #getRuntimeIntegerValue()
	 * @generated
	 */
	EAttribute getRuntimeIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeReferenceValue <em>Runtime Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Reference Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeReferenceValue
	 * @generated
	 */
	EClass getRuntimeReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeReferenceValue#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeReferenceValue#getReferencedObject()
	 * @see #getRuntimeReferenceValue()
	 * @generated
	 */
	EReference getRuntimeReferenceValue_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeBooleanValue <em>Runtime Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Boolean Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeBooleanValue
	 * @generated
	 */
	EClass getRuntimeBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.trace.simple.RuntimeBooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeBooleanValue#isValue()
	 * @see #getRuntimeBooleanValue()
	 * @generated
	 */
	EAttribute getRuntimeBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeStringValue <em>Runtime String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime String Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStringValue
	 * @generated
	 */
	EClass getRuntimeStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.trace.simple.RuntimeStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStringValue#getValue()
	 * @see #getRuntimeStringValue()
	 * @generated
	 */
	EAttribute getRuntimeStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement <em>Runtime Extension Of Static Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Extension Of Static Element</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement
	 * @generated
	 */
	EClass getRuntimeExtensionOfStaticElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement#getExtendedStaticElement <em>Extended Static Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Static Element</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement#getExtendedStaticElement()
	 * @see #getRuntimeExtensionOfStaticElement()
	 * @generated
	 */
	EReference getRuntimeExtensionOfStaticElement_ExtendedStaticElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement#getRuntimeBindings <em>Runtime Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime Bindings</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement#getRuntimeBindings()
	 * @see #getRuntimeExtensionOfStaticElement()
	 * @generated
	 */
	EReference getRuntimeExtensionOfStaticElement_RuntimeBindings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeContainmentValue <em>Runtime Containment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Containment Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeContainmentValue
	 * @generated
	 */
	EClass getRuntimeContainmentValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.trace.simple.RuntimeContainmentValue#getRuntimeObject <em>Runtime Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Object</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeContainmentValue#getRuntimeObject()
	 * @see #getRuntimeContainmentValue()
	 * @generated
	 */
	EReference getRuntimeContainmentValue_RuntimeObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElement <em>Runtime Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Only Element</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElement
	 * @generated
	 */
	EClass getRuntimeOnlyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElement#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElement#getVersions()
	 * @see #getRuntimeOnlyElement()
	 * @generated
	 */
	EReference getRuntimeOnlyElement_Versions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion <em>Runtime Only Element Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Only Element Version</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion
	 * @generated
	 */
	EClass getRuntimeOnlyElementVersion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getRuntimeState <em>Runtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runtime State</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getRuntimeState()
	 * @see #getRuntimeOnlyElementVersion()
	 * @generated
	 */
	EReference getRuntimeOnlyElementVersion_RuntimeState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getElement()
	 * @see #getRuntimeOnlyElementVersion()
	 * @generated
	 */
	EReference getRuntimeOnlyElementVersion_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeNullValue <em>Runtime Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Null Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeNullValue
	 * @generated
	 */
	EClass getRuntimeNullValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding <em>Runtime Object Value Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Object Value Binding</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding
	 * @generated
	 */
	EClass getRuntimeObjectValueBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getFeature()
	 * @see #getRuntimeObjectValueBinding()
	 * @generated
	 */
	EReference getRuntimeObjectValueBinding_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getRuntimeValue <em>Runtime Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Value</em>'.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getRuntimeValue()
	 * @see #getRuntimeObjectValueBinding()
	 * @generated
	 */
	EReference getRuntimeObjectValueBinding_RuntimeValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleFactory getSimpleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getSimpleTrace()
		 * @generated
		 */
		EClass SIMPLE_TRACE = eINSTANCE.getSimpleTrace();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TRACE__STATES = eINSTANCE.getSimpleTrace_States();

		/**
		 * The meta object literal for the '<em><b>Root Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TRACE__ROOT_STEPS = eINSTANCE.getSimpleTrace_RootSteps();

		/**
		 * The meta object literal for the '<em><b>Runtime Only Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TRACE__RUNTIME_ONLY_ELEMENTS = eINSTANCE.getSimpleTrace_RuntimeOnlyElements();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl <em>Runtime State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeState()
		 * @generated
		 */
		EClass RUNTIME_STATE = eINSTANCE.getRuntimeState();

		/**
		 * The meta object literal for the '<em><b>Runtime Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STATE__RUNTIME_EXTENSIONS = eINSTANCE.getRuntimeState_RuntimeExtensions();

		/**
		 * The meta object literal for the '<em><b>Starting Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STATE__STARTING_STEPS = eINSTANCE.getRuntimeState_StartingSteps();

		/**
		 * The meta object literal for the '<em><b>Ending Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STATE__ENDING_STEPS = eINSTANCE.getRuntimeState_EndingSteps();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl <em>Runtime Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeStep()
		 * @generated
		 */
		EClass RUNTIME_STEP = eINSTANCE.getRuntimeStep();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__SUB_STEPS = eINSTANCE.getRuntimeStep_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__SOURCE_STATE = eINSTANCE.getRuntimeStep_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__TARGET_STATE = eINSTANCE.getRuntimeStep_TargetState();

		/**
		 * The meta object literal for the '<em><b>Semantic Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_STEP__SEMANTIC_RULE_NAME = eINSTANCE.getRuntimeStep_SemanticRuleName();

		/**
		 * The meta object literal for the '<em><b>Semantic Rule Static Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET = eINSTANCE.getRuntimeStep_SemanticRuleStaticTarget();

		/**
		 * The meta object literal for the '<em><b>Semantic Rule Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS = eINSTANCE.getRuntimeStep_SemanticRuleParameters();

		/**
		 * The meta object literal for the '<em><b>Semantic Rule Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_STEP__SEMANTIC_RULE_RESULT = eINSTANCE.getRuntimeStep_SemanticRuleResult();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeValueImpl <em>Runtime Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeValue()
		 * @generated
		 */
		EClass RUNTIME_VALUE = eINSTANCE.getRuntimeValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeIntegerValueImpl <em>Runtime Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeIntegerValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeIntegerValue()
		 * @generated
		 */
		EClass RUNTIME_INTEGER_VALUE = eINSTANCE.getRuntimeIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_INTEGER_VALUE__VALUE = eINSTANCE.getRuntimeIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeReferenceValueImpl <em>Runtime Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeReferenceValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeReferenceValue()
		 * @generated
		 */
		EClass RUNTIME_REFERENCE_VALUE = eINSTANCE.getRuntimeReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_REFERENCE_VALUE__REFERENCED_OBJECT = eINSTANCE.getRuntimeReferenceValue_ReferencedObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeBooleanValueImpl <em>Runtime Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeBooleanValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeBooleanValue()
		 * @generated
		 */
		EClass RUNTIME_BOOLEAN_VALUE = eINSTANCE.getRuntimeBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_BOOLEAN_VALUE__VALUE = eINSTANCE.getRuntimeBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStringValueImpl <em>Runtime String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeStringValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeStringValue()
		 * @generated
		 */
		EClass RUNTIME_STRING_VALUE = eINSTANCE.getRuntimeStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNTIME_STRING_VALUE__VALUE = eINSTANCE.getRuntimeStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl <em>Runtime Extension Of Static Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeExtensionOfStaticElement()
		 * @generated
		 */
		EClass RUNTIME_EXTENSION_OF_STATIC_ELEMENT = eINSTANCE.getRuntimeExtensionOfStaticElement();

		/**
		 * The meta object literal for the '<em><b>Extended Static Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT = eINSTANCE
				.getRuntimeExtensionOfStaticElement_ExtendedStaticElement();

		/**
		 * The meta object literal for the '<em><b>Runtime Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS = eINSTANCE
				.getRuntimeExtensionOfStaticElement_RuntimeBindings();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeContainmentValueImpl <em>Runtime Containment Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeContainmentValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeContainmentValue()
		 * @generated
		 */
		EClass RUNTIME_CONTAINMENT_VALUE = eINSTANCE.getRuntimeContainmentValue();

		/**
		 * The meta object literal for the '<em><b>Runtime Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT = eINSTANCE.getRuntimeContainmentValue_RuntimeObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementImpl <em>Runtime Only Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeOnlyElement()
		 * @generated
		 */
		EClass RUNTIME_ONLY_ELEMENT = eINSTANCE.getRuntimeOnlyElement();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ONLY_ELEMENT__VERSIONS = eINSTANCE.getRuntimeOnlyElement_Versions();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl <em>Runtime Only Element Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeOnlyElementVersion()
		 * @generated
		 */
		EClass RUNTIME_ONLY_ELEMENT_VERSION = eINSTANCE.getRuntimeOnlyElementVersion();

		/**
		 * The meta object literal for the '<em><b>Runtime State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE = eINSTANCE.getRuntimeOnlyElementVersion_RuntimeState();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT = eINSTANCE.getRuntimeOnlyElementVersion_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeNullValueImpl <em>Runtime Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeNullValueImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeNullValue()
		 * @generated
		 */
		EClass RUNTIME_NULL_VALUE = eINSTANCE.getRuntimeNullValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl <em>Runtime Object Value Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl
		 * @see org.eclipse.gemoc.trace.simple.impl.SimplePackageImpl#getRuntimeObjectValueBinding()
		 * @generated
		 */
		EClass RUNTIME_OBJECT_VALUE_BINDING = eINSTANCE.getRuntimeObjectValueBinding();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_OBJECT_VALUE_BINDING__FEATURE = eINSTANCE.getRuntimeObjectValueBinding_Feature();

		/**
		 * The meta object literal for the '<em><b>Runtime Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE = eINSTANCE.getRuntimeObjectValueBinding_RuntimeValue();

	}

} //SimplePackage
