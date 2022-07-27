/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.trace.simple.RuntimeObjectVersion;
import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Object Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectVersionImpl#getRuntimeState <em>Runtime State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectVersionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeObjectVersionImpl extends MinimalEObjectImpl.Container implements RuntimeObjectVersion {
	/**
	 * The cached value of the '{@link #getRuntimeState() <em>Runtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeState()
	 * @generated
	 * @ordered
	 */
	protected RuntimeState runtimeState;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EObject value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeObjectVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_OBJECT_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState getRuntimeState() {
		if (runtimeState != null && runtimeState.eIsProxy()) {
			InternalEObject oldRuntimeState = (InternalEObject) runtimeState;
			runtimeState = (RuntimeState) eResolveProxy(oldRuntimeState);
			if (runtimeState != oldRuntimeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE, oldRuntimeState, runtimeState));
			}
		}
		return runtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeState basicGetRuntimeState() {
		return runtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeState(RuntimeState newRuntimeState) {
		RuntimeState oldRuntimeState = runtimeState;
		runtimeState = newRuntimeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE,
					oldRuntimeState, runtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_OBJECT_VERSION__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_OBJECT_VERSION__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE:
			if (resolve)
				return getRuntimeState();
			return basicGetRuntimeState();
		case SimplePackage.RUNTIME_OBJECT_VERSION__VALUE:
			if (resolve)
				return getValue();
			return basicGetValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE:
			setRuntimeState((RuntimeState) newValue);
			return;
		case SimplePackage.RUNTIME_OBJECT_VERSION__VALUE:
			setValue((EObject) newValue);
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
		case SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE:
			setRuntimeState((RuntimeState) null);
			return;
		case SimplePackage.RUNTIME_OBJECT_VERSION__VALUE:
			setValue((EObject) null);
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
		case SimplePackage.RUNTIME_OBJECT_VERSION__RUNTIME_STATE:
			return runtimeState != null;
		case SimplePackage.RUNTIME_OBJECT_VERSION__VALUE:
			return value != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeObjectVersionImpl
