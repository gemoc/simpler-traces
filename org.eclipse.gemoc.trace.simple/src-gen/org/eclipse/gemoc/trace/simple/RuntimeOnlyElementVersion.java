/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Only Element Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getRuntimeState <em>Runtime State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeOnlyElementVersion()
 * @model
 * @generated
 */
public interface RuntimeOnlyElementVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime State</em>' reference.
	 * @see #setRuntimeState(RuntimeState)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeOnlyElementVersion_RuntimeState()
	 * @model required="true"
	 * @generated
	 */
	RuntimeState getRuntimeState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getRuntimeState <em>Runtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime State</em>' reference.
	 * @see #getRuntimeState()
	 * @generated
	 */
	void setRuntimeState(RuntimeState value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeOnlyElementVersion_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

} // RuntimeOnlyElementVersion
