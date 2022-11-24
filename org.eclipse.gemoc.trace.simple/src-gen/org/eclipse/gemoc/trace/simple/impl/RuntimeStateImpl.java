/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement;
import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl#getRuntimeExtensions <em>Runtime Extensions</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl#getStartingSteps <em>Starting Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl#getEndingSteps <em>Ending Steps</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeStateImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeStateImpl extends MinimalEObjectImpl.Container implements RuntimeState {
	/**
	 * The cached value of the '{@link #getRuntimeExtensions() <em>Runtime Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeExtensionOfStaticElement> runtimeExtensions;

	/**
	 * The cached value of the '{@link #getStartingSteps() <em>Starting Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeStep> startingSteps;

	/**
	 * The cached value of the '{@link #getEndingSteps() <em>Ending Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeStep> endingSteps;

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
	protected RuntimeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeExtensionOfStaticElement> getRuntimeExtensions() {
		if (runtimeExtensions == null) {
			runtimeExtensions = new EObjectContainmentEList<RuntimeExtensionOfStaticElement>(
					RuntimeExtensionOfStaticElement.class, this, SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS);
		}
		return runtimeExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeStep> getStartingSteps() {
		if (startingSteps == null) {
			startingSteps = new EObjectWithInverseResolvingEList<RuntimeStep>(RuntimeStep.class, this,
					SimplePackage.RUNTIME_STATE__STARTING_STEPS, SimplePackage.RUNTIME_STEP__SOURCE_STATE);
		}
		return startingSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeStep> getEndingSteps() {
		if (endingSteps == null) {
			endingSteps = new EObjectWithInverseResolvingEList<RuntimeStep>(RuntimeStep.class, this,
					SimplePackage.RUNTIME_STATE__ENDING_STEPS, SimplePackage.RUNTIME_STEP__TARGET_STATE);
		}
		return endingSteps;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_STATE__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStartingSteps()).basicAdd(otherEnd, msgs);
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEndingSteps()).basicAdd(otherEnd, msgs);
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
		case SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS:
			return ((InternalEList<?>) getRuntimeExtensions()).basicRemove(otherEnd, msgs);
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			return ((InternalEList<?>) getStartingSteps()).basicRemove(otherEnd, msgs);
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			return ((InternalEList<?>) getEndingSteps()).basicRemove(otherEnd, msgs);
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
		case SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS:
			return getRuntimeExtensions();
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			return getStartingSteps();
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			return getEndingSteps();
		case SimplePackage.RUNTIME_STATE__NUMBER:
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
		case SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS:
			getRuntimeExtensions().clear();
			getRuntimeExtensions().addAll((Collection<? extends RuntimeExtensionOfStaticElement>) newValue);
			return;
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			getStartingSteps().clear();
			getStartingSteps().addAll((Collection<? extends RuntimeStep>) newValue);
			return;
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			getEndingSteps().clear();
			getEndingSteps().addAll((Collection<? extends RuntimeStep>) newValue);
			return;
		case SimplePackage.RUNTIME_STATE__NUMBER:
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
		case SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS:
			getRuntimeExtensions().clear();
			return;
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			getStartingSteps().clear();
			return;
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			getEndingSteps().clear();
			return;
		case SimplePackage.RUNTIME_STATE__NUMBER:
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
		case SimplePackage.RUNTIME_STATE__RUNTIME_EXTENSIONS:
			return runtimeExtensions != null && !runtimeExtensions.isEmpty();
		case SimplePackage.RUNTIME_STATE__STARTING_STEPS:
			return startingSteps != null && !startingSteps.isEmpty();
		case SimplePackage.RUNTIME_STATE__ENDING_STEPS:
			return endingSteps != null && !endingSteps.isEmpty();
		case SimplePackage.RUNTIME_STATE__NUMBER:
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //RuntimeStateImpl
