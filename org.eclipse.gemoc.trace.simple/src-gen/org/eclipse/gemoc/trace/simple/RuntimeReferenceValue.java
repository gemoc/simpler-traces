/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeReferenceValue#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeReferenceValue()
 * @model
 * @generated
 */
public interface RuntimeReferenceValue extends RuntimeValue {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeReferenceValue_ReferencedObject()
	 * @model
	 * @generated
	 */
	EObject getReferencedObject();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeReferenceValue#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(EObject value);

} // RuntimeReferenceValue
