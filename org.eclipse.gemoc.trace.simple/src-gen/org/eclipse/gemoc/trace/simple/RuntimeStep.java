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
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleStaticTarget <em>Semantic Rule Static Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleParameters <em>Semantic Rule Parameters</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleResult <em>Semantic Rule Result</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getNumber <em>Number</em>}</li>
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
	 * Returns the value of the '<em><b>Semantic Rule Static Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Rule Static Target</em>' reference.
	 * @see #setSemanticRuleStaticTarget(EObject)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SemanticRuleStaticTarget()
	 * @model required="true"
	 * @generated
	 */
	EObject getSemanticRuleStaticTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleStaticTarget <em>Semantic Rule Static Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Rule Static Target</em>' reference.
	 * @see #getSemanticRuleStaticTarget()
	 * @generated
	 */
	void setSemanticRuleStaticTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Semantic Rule Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Rule Parameters</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SemanticRuleParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeValue> getSemanticRuleParameters();

	/**
	 * Returns the value of the '<em><b>Semantic Rule Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Rule Result</em>' containment reference.
	 * @see #setSemanticRuleResult(RuntimeValue)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_SemanticRuleResult()
	 * @model containment="true"
	 * @generated
	 */
	RuntimeValue getSemanticRuleResult();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getSemanticRuleResult <em>Semantic Rule Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Rule Result</em>' containment reference.
	 * @see #getSemanticRuleResult()
	 * @generated
	 */
	void setSemanticRuleResult(RuntimeValue value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeStep_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.gemoc.trace.simple.RuntimeStep#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // RuntimeStep
