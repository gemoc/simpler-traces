/**
 */
package org.eclipse.gemoc.trace.simple.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.trace.simple.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.trace.simple.SimplePackage
 * @generated
 */
public class SimpleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SimplePackage.SIMPLE_TRACE: {
			SimpleTrace simpleTrace = (SimpleTrace) theEObject;
			T result = caseSimpleTrace(simpleTrace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_STATE: {
			RuntimeState runtimeState = (RuntimeState) theEObject;
			T result = caseRuntimeState(runtimeState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_STEP: {
			RuntimeStep runtimeStep = (RuntimeStep) theEObject;
			T result = caseRuntimeStep(runtimeStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_VALUE: {
			RuntimeValue runtimeValue = (RuntimeValue) theEObject;
			T result = caseRuntimeValue(runtimeValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_INTEGER_VALUE: {
			RuntimeIntegerValue runtimeIntegerValue = (RuntimeIntegerValue) theEObject;
			T result = caseRuntimeIntegerValue(runtimeIntegerValue);
			if (result == null)
				result = caseRuntimeValue(runtimeIntegerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_REFERENCE_VALUE: {
			RuntimeReferenceValue runtimeReferenceValue = (RuntimeReferenceValue) theEObject;
			T result = caseRuntimeReferenceValue(runtimeReferenceValue);
			if (result == null)
				result = caseRuntimeValue(runtimeReferenceValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_BOOLEAN_VALUE: {
			RuntimeBooleanValue runtimeBooleanValue = (RuntimeBooleanValue) theEObject;
			T result = caseRuntimeBooleanValue(runtimeBooleanValue);
			if (result == null)
				result = caseRuntimeValue(runtimeBooleanValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_STRING_VALUE: {
			RuntimeStringValue runtimeStringValue = (RuntimeStringValue) theEObject;
			T result = caseRuntimeStringValue(runtimeStringValue);
			if (result == null)
				result = caseRuntimeValue(runtimeStringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT: {
			RuntimeExtensionOfStaticElement runtimeExtensionOfStaticElement = (RuntimeExtensionOfStaticElement) theEObject;
			T result = caseRuntimeExtensionOfStaticElement(runtimeExtensionOfStaticElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE: {
			RuntimeContainmentValue runtimeContainmentValue = (RuntimeContainmentValue) theEObject;
			T result = caseRuntimeContainmentValue(runtimeContainmentValue);
			if (result == null)
				result = caseRuntimeValue(runtimeContainmentValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_ONLY_ELEMENT: {
			RuntimeOnlyElement runtimeOnlyElement = (RuntimeOnlyElement) theEObject;
			T result = caseRuntimeOnlyElement(runtimeOnlyElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION: {
			RuntimeOnlyElementVersion runtimeOnlyElementVersion = (RuntimeOnlyElementVersion) theEObject;
			T result = caseRuntimeOnlyElementVersion(runtimeOnlyElementVersion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_NULL_VALUE: {
			RuntimeNullValue runtimeNullValue = (RuntimeNullValue) theEObject;
			T result = caseRuntimeNullValue(runtimeNullValue);
			if (result == null)
				result = caseRuntimeValue(runtimeNullValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING: {
			RuntimeObjectValueBinding runtimeObjectValueBinding = (RuntimeObjectValueBinding) theEObject;
			T result = caseRuntimeObjectValueBinding(runtimeObjectValueBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SimplePackage.RUNTIME_COLLECTION: {
			RuntimeCollection runtimeCollection = (RuntimeCollection) theEObject;
			T result = caseRuntimeCollection(runtimeCollection);
			if (result == null)
				result = caseRuntimeValue(runtimeCollection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTrace(SimpleTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeState(RuntimeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeStep(RuntimeStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeValue(RuntimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeIntegerValue(RuntimeIntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeReferenceValue(RuntimeReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeBooleanValue(RuntimeBooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeStringValue(RuntimeStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Extension Of Static Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Extension Of Static Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeExtensionOfStaticElement(RuntimeExtensionOfStaticElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Containment Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Containment Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeContainmentValue(RuntimeContainmentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Only Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Only Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeOnlyElement(RuntimeOnlyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Only Element Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Only Element Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeOnlyElementVersion(RuntimeOnlyElementVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Null Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Null Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeNullValue(RuntimeNullValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Object Value Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Object Value Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeObjectValueBinding(RuntimeObjectValueBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuntimeCollection(RuntimeCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimpleSwitch
