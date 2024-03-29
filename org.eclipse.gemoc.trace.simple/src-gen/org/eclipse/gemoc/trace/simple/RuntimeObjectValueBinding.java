/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Object Value Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getRuntimeValue <em>Runtime Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectValueBinding()
 * @model
 * @generated
 */
public interface RuntimeObjectValueBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectValueBinding_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Runtime Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Value</em>' containment reference.
	 * @see #setRuntimeValue(RuntimeValue)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObjectValueBinding_RuntimeValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuntimeValue getRuntimeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding#getRuntimeValue <em>Runtime Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Value</em>' containment reference.
	 * @see #getRuntimeValue()
	 * @generated
	 */
	void setRuntimeValue(RuntimeValue value);

} // RuntimeObjectValueBinding
