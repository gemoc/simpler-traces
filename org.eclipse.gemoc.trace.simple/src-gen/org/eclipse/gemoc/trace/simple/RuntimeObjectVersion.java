/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Object Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeObjectVersion#getRuntimeState <em>Runtime State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeObjectVersion#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectVersion()
 * @model
 * @generated
 */
public interface RuntimeObjectVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime State</em>' reference.
	 * @see #setRuntimeState(RuntimeState)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectVersion_RuntimeState()
	 * @model required="true"
	 * @generated
	 */
	RuntimeState getRuntimeState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectVersion#getRuntimeState <em>Runtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime State</em>' reference.
	 * @see #getRuntimeState()
	 * @generated
	 */
	void setRuntimeState(RuntimeState value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectVersion_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectVersion#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // RuntimeObjectVersion
