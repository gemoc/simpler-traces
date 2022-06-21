/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.SimpleTrace#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.SimpleTrace#getRootSteps <em>Root Steps</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getSimpleTrace()
 * @model
 * @generated
 */
public interface SimpleTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getSimpleTrace_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RuntimeState> getStates();

	/**
	 * Returns the value of the '<em><b>Root Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Steps</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getSimpleTrace_RootSteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RuntimeStep> getRootSteps();

} // SimpleTrace
