/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.RuntimeValue;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSemanticRuleName <em>Semantic Rule Name</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSemanticRuleStaticTarget <em>Semantic Rule Static Target</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSemanticRuleParameters <em>Semantic Rule Parameters</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getSemanticRuleResult <em>Semantic Rule Result</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStepImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeStepImpl extends MinimalEObjectImpl.Container implements RuntimeStep {
	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeStep> subSteps;

	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected RuntimeState sourceState;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected RuntimeState targetState;

	/**
	 * The default value of the '{@link #getSemanticRuleName() <em>Semantic Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticRuleName() <em>Semantic Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticRuleName()
	 * @generated
	 * @ordered
	 */
	protected String semanticRuleName = SEMANTIC_RULE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticRuleStaticTarget() <em>Semantic Rule Static Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticRuleStaticTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject semanticRuleStaticTarget;

	/**
	 * The cached value of the '{@link #getSemanticRuleParameters() <em>Semantic Rule Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticRuleParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeValue> semanticRuleParameters;

	/**
	 * The cached value of the '{@link #getSemanticRuleResult() <em>Semantic Rule Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticRuleResult()
	 * @generated
	 * @ordered
	 */
	protected RuntimeValue semanticRuleResult;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeStep> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectContainmentEList<RuntimeStep>(RuntimeStep.class, this,
					SimplePackage.RUNTIME_STEP__SUB_STEPS);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject) sourceState;
			sourceState = (RuntimeState) eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplePackage.RUNTIME_STEP__SOURCE_STATE,
							oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceState(RuntimeState newSourceState, NotificationChain msgs) {
		RuntimeState oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_STEP__SOURCE_STATE, oldSourceState, newSourceState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceState(RuntimeState newSourceState) {
		if (newSourceState != sourceState) {
			NotificationChain msgs = null;
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, SimplePackage.RUNTIME_STATE__STARTING_STEPS,
						RuntimeState.class, msgs);
			if (newSourceState != null)
				msgs = ((InternalEObject) newSourceState).eInverseAdd(this, SimplePackage.RUNTIME_STATE__STARTING_STEPS,
						RuntimeState.class, msgs);
			msgs = basicSetSourceState(newSourceState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STEP__SOURCE_STATE,
					newSourceState, newSourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (RuntimeState) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplePackage.RUNTIME_STEP__TARGET_STATE,
							oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(RuntimeState newTargetState, NotificationChain msgs) {
		RuntimeState oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_STEP__TARGET_STATE, oldTargetState, newTargetState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(RuntimeState newTargetState) {
		if (newTargetState != targetState) {
			NotificationChain msgs = null;
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, SimplePackage.RUNTIME_STATE__ENDING_STEPS,
						RuntimeState.class, msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject) newTargetState).eInverseAdd(this, SimplePackage.RUNTIME_STATE__ENDING_STEPS,
						RuntimeState.class, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STEP__TARGET_STATE,
					newTargetState, newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticRuleName() {
		return semanticRuleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticRuleName(String newSemanticRuleName) {
		String oldSemanticRuleName = semanticRuleName;
		semanticRuleName = newSemanticRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_NAME,
					oldSemanticRuleName, semanticRuleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSemanticRuleStaticTarget() {
		if (semanticRuleStaticTarget != null && semanticRuleStaticTarget.eIsProxy()) {
			InternalEObject oldSemanticRuleStaticTarget = (InternalEObject) semanticRuleStaticTarget;
			semanticRuleStaticTarget = eResolveProxy(oldSemanticRuleStaticTarget);
			if (semanticRuleStaticTarget != oldSemanticRuleStaticTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET, oldSemanticRuleStaticTarget,
							semanticRuleStaticTarget));
			}
		}
		return semanticRuleStaticTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSemanticRuleStaticTarget() {
		return semanticRuleStaticTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticRuleStaticTarget(EObject newSemanticRuleStaticTarget) {
		EObject oldSemanticRuleStaticTarget = semanticRuleStaticTarget;
		semanticRuleStaticTarget = newSemanticRuleStaticTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET, oldSemanticRuleStaticTarget,
					semanticRuleStaticTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeValue> getSemanticRuleParameters() {
		if (semanticRuleParameters == null) {
			semanticRuleParameters = new EObjectContainmentEList<RuntimeValue>(RuntimeValue.class, this,
					SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS);
		}
		return semanticRuleParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeValue getSemanticRuleResult() {
		return semanticRuleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemanticRuleResult(RuntimeValue newSemanticRuleResult, NotificationChain msgs) {
		RuntimeValue oldSemanticRuleResult = semanticRuleResult;
		semanticRuleResult = newSemanticRuleResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT, oldSemanticRuleResult, newSemanticRuleResult);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticRuleResult(RuntimeValue newSemanticRuleResult) {
		if (newSemanticRuleResult != semanticRuleResult) {
			NotificationChain msgs = null;
			if (semanticRuleResult != null)
				msgs = ((InternalEObject) semanticRuleResult).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT, null, msgs);
			if (newSemanticRuleResult != null)
				msgs = ((InternalEObject) newSemanticRuleResult).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT, null, msgs);
			msgs = basicSetSemanticRuleResult(newSemanticRuleResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT,
					newSemanticRuleResult, newSemanticRuleResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STEP__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			if (sourceState != null)
				msgs = ((InternalEObject) sourceState).eInverseRemove(this, SimplePackage.RUNTIME_STATE__STARTING_STEPS,
						RuntimeState.class, msgs);
			return basicSetSourceState((RuntimeState) otherEnd, msgs);
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			if (targetState != null)
				msgs = ((InternalEObject) targetState).eInverseRemove(this, SimplePackage.RUNTIME_STATE__ENDING_STEPS,
						RuntimeState.class, msgs);
			return basicSetTargetState((RuntimeState) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SUB_STEPS:
			return ((InternalEList<?>) getSubSteps()).basicRemove(otherEnd, msgs);
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			return basicSetSourceState(null, msgs);
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			return basicSetTargetState(null, msgs);
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS:
			return ((InternalEList<?>) getSemanticRuleParameters()).basicRemove(otherEnd, msgs);
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT:
			return basicSetSemanticRuleResult(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SUB_STEPS:
			return getSubSteps();
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			if (resolve)
				return getSourceState();
			return basicGetSourceState();
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_NAME:
			return getSemanticRuleName();
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET:
			if (resolve)
				return getSemanticRuleStaticTarget();
			return basicGetSemanticRuleStaticTarget();
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS:
			return getSemanticRuleParameters();
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT:
			return getSemanticRuleResult();
		case SimplePackage.RUNTIME_STEP__NUMBER:
			return getNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SUB_STEPS:
			getSubSteps().clear();
			getSubSteps().addAll((Collection<? extends RuntimeStep>) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			setSourceState((RuntimeState) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			setTargetState((RuntimeState) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_NAME:
			setSemanticRuleName((String) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET:
			setSemanticRuleStaticTarget((EObject) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS:
			getSemanticRuleParameters().clear();
			getSemanticRuleParameters().addAll((Collection<? extends RuntimeValue>) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT:
			setSemanticRuleResult((RuntimeValue) newValue);
			return;
		case SimplePackage.RUNTIME_STEP__NUMBER:
			setNumber((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SUB_STEPS:
			getSubSteps().clear();
			return;
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			setSourceState((RuntimeState) null);
			return;
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			setTargetState((RuntimeState) null);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_NAME:
			setSemanticRuleName(SEMANTIC_RULE_NAME_EDEFAULT);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET:
			setSemanticRuleStaticTarget((EObject) null);
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS:
			getSemanticRuleParameters().clear();
			return;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT:
			setSemanticRuleResult((RuntimeValue) null);
			return;
		case SimplePackage.RUNTIME_STEP__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STEP__SUB_STEPS:
			return subSteps != null && !subSteps.isEmpty();
		case SimplePackage.RUNTIME_STEP__SOURCE_STATE:
			return sourceState != null;
		case SimplePackage.RUNTIME_STEP__TARGET_STATE:
			return targetState != null;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_NAME:
			return SEMANTIC_RULE_NAME_EDEFAULT == null ? semanticRuleName != null
					: !SEMANTIC_RULE_NAME_EDEFAULT.equals(semanticRuleName);
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_STATIC_TARGET:
			return semanticRuleStaticTarget != null;
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_PARAMETERS:
			return semanticRuleParameters != null && !semanticRuleParameters.isEmpty();
		case SimplePackage.RUNTIME_STEP__SEMANTIC_RULE_RESULT:
			return semanticRuleResult != null;
		case SimplePackage.RUNTIME_STEP__NUMBER:
			return number != NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semanticRuleName: ");
		result.append(semanticRuleName);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //RuntimeStepImpl
