/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState <em>Source State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState <em>Target State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleName <em>Semantic Rule Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleTarget <em>Semantic Rule Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep()
 * @model
 * @generated
 */
public interface RuntimeStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SubSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeStep> getSubSteps();

	/**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getStartingSteps <em>Starting Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(RuntimeState)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SourceState()
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState#getStartingSteps
	 * @model opposite="startingSteps" required="true"
	 * @generated
	 */
	RuntimeState getSourceState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(RuntimeState value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gemoc.trace.simple.RuntimeState#getEndingSteps <em>Ending Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(RuntimeState)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_TargetState()
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState#getEndingSteps
	 * @model opposite="endingSteps"
	 * @generated
	 */
	RuntimeState getTargetState();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(RuntimeState value);

	/**
	 * Returns the value of the '<em><b>Semantic Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Rule Name</em>' attribute.
	 * @see #setSemanticRuleName(String)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SemanticRuleName()
	 * @model required="true"
	 * @generated
	 */
	String getSemanticRuleName();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleName <em>Semantic Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Rule Name</em>' attribute.
	 * @see #getSemanticRuleName()
	 * @generated
	 */
	void setSemanticRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Rule Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Rule Target</em>' reference.
	 * @see #setSemanticRuleTarget(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SemanticRuleTarget()
	 * @model required="true"
	 * @generated
	 */
	EObject getSemanticRuleTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleTarget <em>Semantic Rule Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Rule Target</em>' reference.
	 * @see #getSemanticRuleTarget()
	 * @generated
	 */
	void setSemanticRuleTarget(EObject value);

} // RuntimeStep
