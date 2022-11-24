/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeState#getRuntimeExtensions <em>Runtime Extensions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeState#getStartingSteps <em>Starting Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeState#getEndingSteps <em>Ending Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeState#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeState()
 * @model
 * @generated
 */
public interface RuntimeState extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Extensions</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeState_RuntimeExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeExtensionOfStaticElement> getRuntimeExtensions();

	/**
	 * Returns the value of the '<em><b>Starting Steps</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeStep}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Steps</em>' reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeState_StartingSteps()
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState
	 * @model opposite="sourceState"
	 * @generated
	 */
	EList<RuntimeStep> getStartingSteps();

	/**
	 * Returns the value of the '<em><b>Ending Steps</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeStep}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Steps</em>' reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeState_EndingSteps()
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState
	 * @model opposite="targetState"
	 * @generated
	 */
	EList<RuntimeStep> getEndingSteps();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeState_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // RuntimeState
