/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gemoc.trace.simple.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleFactoryImpl extends EFactoryImpl implements SimpleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleFactory init() {
		try {
			SimpleFactory theSimpleFactory = (SimpleFactory) EPackage.Registry.INSTANCE
					.getEFactory(SimplePackage.eNS_URI);
			if (theSimpleFactory != null) {
				return theSimpleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SimplePackage.SIMPLE_TRACE:
			return createSimpleTrace();
		case SimplePackage.RUNTIME_STATE:
			return createRuntimeState();
		case SimplePackage.RUNTIME_STEP:
			return createRuntimeStep();
		case SimplePackage.RUNTIME_INTEGER_VALUE:
			return createRuntimeIntegerValue();
		case SimplePackage.RUNTIME_REFERENCE_VALUE:
			return createRuntimeReferenceValue();
		case SimplePackage.RUNTIME_BOOLEAN_VALUE:
			return createRuntimeBooleanValue();
		case SimplePackage.RUNTIME_STRING_VALUE:
			return createRuntimeStringValue();
		case SimplePackage.RUNTIME_OBJECT_EXTENSION:
			return createRuntimeObjectExtension();
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE:
			return createRuntimeContainmentValue();
		case SimplePackage.RUNTIME_OBJECT:
			return createRuntimeObject();
		case SimplePackage.RUNTIME_OBJECT_VERSION:
			return createRuntimeObjectVersion();
		case SimplePackage.RUNTIME_NULL_VALUE:
			return createRuntimeNullValue();
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING:
			return createRuntimeObjectValueBinding();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTrace createSimpleTrace() {
		SimpleTraceImpl simpleTrace = new SimpleTraceImpl();
		return simpleTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState createRuntimeState() {
		RuntimeStateImpl runtimeState = new RuntimeStateImpl();
		return runtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeStep createRuntimeStep() {
		RuntimeStepImpl runtimeStep = new RuntimeStepImpl();
		return runtimeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeIntegerValue createRuntimeIntegerValue() {
		RuntimeIntegerValueImpl runtimeIntegerValue = new RuntimeIntegerValueImpl();
		return runtimeIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeReferenceValue createRuntimeReferenceValue() {
		RuntimeReferenceValueImpl runtimeReferenceValue = new RuntimeReferenceValueImpl();
		return runtimeReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBooleanValue createRuntimeBooleanValue() {
		RuntimeBooleanValueImpl runtimeBooleanValue = new RuntimeBooleanValueImpl();
		return runtimeBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeStringValue createRuntimeStringValue() {
		RuntimeStringValueImpl runtimeStringValue = new RuntimeStringValueImpl();
		return runtimeStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeObjectExtension createRuntimeObjectExtension() {
		RuntimeObjectExtensionImpl runtimeObjectExtension = new RuntimeObjectExtensionImpl();
		return runtimeObjectExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeContainmentValue createRuntimeContainmentValue() {
		RuntimeContainmentValueImpl runtimeContainmentValue = new RuntimeContainmentValueImpl();
		return runtimeContainmentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeObject createRuntimeObject() {
		RuntimeObjectImpl runtimeObject = new RuntimeObjectImpl();
		return runtimeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeObjectVersion createRuntimeObjectVersion() {
		RuntimeObjectVersionImpl runtimeObjectVersion = new RuntimeObjectVersionImpl();
		return runtimeObjectVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeNullValue createRuntimeNullValue() {
		RuntimeNullValueImpl runtimeNullValue = new RuntimeNullValueImpl();
		return runtimeNullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeObjectValueBinding createRuntimeObjectValueBinding() {
		RuntimeObjectValueBindingImpl runtimeObjectValueBinding = new RuntimeObjectValueBindingImpl();
		return runtimeObjectValueBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage getSimplePackage() {
		return (SimplePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplePackage getPackage() {
		return SimplePackage.eINSTANCE;
	}

} //SimpleFactoryImpl
