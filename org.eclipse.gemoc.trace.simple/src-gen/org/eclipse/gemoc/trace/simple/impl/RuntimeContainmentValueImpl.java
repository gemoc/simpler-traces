/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gemoc.trace.simple.RuntimeContainmentValue;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Containment Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeContainmentValueImpl#getRuntimeObject <em>Runtime Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeContainmentValueImpl extends RuntimeValueImpl implements RuntimeContainmentValue {
	/**
	 * The cached value of the '{@link #getRuntimeObject() <em>Runtime Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeObject()
	 * @generated
	 * @ordered
	 */
	protected EObject runtimeObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeContainmentValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_CONTAINMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRuntimeObject() {
		return runtimeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeObject(EObject newRuntimeObject, NotificationChain msgs) {
		EObject oldRuntimeObject = runtimeObject;
		runtimeObject = newRuntimeObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT, oldRuntimeObject, newRuntimeObject);
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
	public void setRuntimeObject(EObject newRuntimeObject) {
		if (newRuntimeObject != runtimeObject) {
			NotificationChain msgs = null;
			if (runtimeObject != null)
				msgs = ((InternalEObject) runtimeObject).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT, null, msgs);
			if (newRuntimeObject != null)
				msgs = ((InternalEObject) newRuntimeObject).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT, null, msgs);
			msgs = basicSetRuntimeObject(newRuntimeObject, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT, newRuntimeObject, newRuntimeObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT:
			return basicSetRuntimeObject(null, msgs);
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
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT:
			return getRuntimeObject();
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
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT:
			setRuntimeObject((EObject) newValue);
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
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT:
			setRuntimeObject((EObject) null);
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
		case SimplePackage.RUNTIME_CONTAINMENT_VALUE__RUNTIME_OBJECT:
			return runtimeObject != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeContainmentValueImpl
