/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Containment Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeContainmentValue#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeContainmentValue()
 * @model
 * @generated
 */
public interface RuntimeContainmentValue extends RuntimeValue {
	/**
	 * Returns the value of the '<em><b>Runtime Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Object</em>' containment reference.
	 * @see #setRuntimeObject(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeContainmentValue_RuntimeObject()
	 * @model containment="true"
	 * @generated
	 */
	EObject getRuntimeObject();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeContainmentValue#getRuntimeObject <em>Runtime Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Object</em>' containment reference.
	 * @see #getRuntimeObject()
	 * @generated
	 */
	void setRuntimeObject(EObject value);

} // RuntimeContainmentValue
