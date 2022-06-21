/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.SimplePackage;
import org.eclipse.gemoc.trace.simple.SimpleTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.SimpleTraceImpl#getRootSteps <em>Root Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTraceImpl extends MinimalEObjectImpl.Container implements SimpleTrace {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeState> states;

	/**
	 * The cached value of the '{@link #getRootSteps() <em>Root Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeStep> rootSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.SIMPLE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<RuntimeState>(RuntimeState.class, this,
					SimplePackage.SIMPLE_TRACE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeStep> getRootSteps() {
		if (rootSteps == null) {
			rootSteps = new EObjectContainmentEList<RuntimeStep>(RuntimeStep.class, this,
					SimplePackage.SIMPLE_TRACE__ROOT_STEPS);
		}
		return rootSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.SIMPLE_TRACE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case SimplePackage.SIMPLE_TRACE__ROOT_STEPS:
			return ((InternalEList<?>) getRootSteps()).basicRemove(otherEnd, msgs);
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
		case SimplePackage.SIMPLE_TRACE__STATES:
			return getStates();
		case SimplePackage.SIMPLE_TRACE__ROOT_STEPS:
			return getRootSteps();
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
		case SimplePackage.SIMPLE_TRACE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends RuntimeState>) newValue);
			return;
		case SimplePackage.SIMPLE_TRACE__ROOT_STEPS:
			getRootSteps().clear();
			getRootSteps().addAll((Collection<? extends RuntimeStep>) newValue);
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
		case SimplePackage.SIMPLE_TRACE__STATES:
			getStates().clear();
			return;
		case SimplePackage.SIMPLE_TRACE__ROOT_STEPS:
			getRootSteps().clear();
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
		case SimplePackage.SIMPLE_TRACE__STATES:
			return states != null && !states.isEmpty();
		case SimplePackage.SIMPLE_TRACE__ROOT_STEPS:
			return rootSteps != null && !rootSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleTraceImpl
