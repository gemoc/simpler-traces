/**
 */
package org.eclipse.gemoc.trace.simple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeBooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeBooleanValue()
 * @model
 * @generated
 */
public interface RuntimeBooleanValue extends RuntimeValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeBooleanValue_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeBooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // RuntimeBooleanValue
