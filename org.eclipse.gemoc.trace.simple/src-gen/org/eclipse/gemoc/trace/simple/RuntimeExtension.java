/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeExtension#getRuntimeValues <em>Runtime Values</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeExtension#getExtendedStaticElement <em>Extended Static Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeExtension()
 * @model
 * @generated
 */
public interface RuntimeExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Values</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeExtension_RuntimeValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RuntimeValue> getRuntimeValues();

	/**
	 * Returns the value of the '<em><b>Extended Static Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Static Element</em>' reference.
	 * @see #setExtendedStaticElement(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeExtension_ExtendedStaticElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getExtendedStaticElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeExtension#getExtendedStaticElement <em>Extended Static Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Static Element</em>' reference.
	 * @see #getExtendedStaticElement()
	 * @generated
	 */
	void setExtendedStaticElement(EObject value);

} // RuntimeExtension
