/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding;
import org.eclipse.gemoc.trace.simple.RuntimeValue;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Object Value Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeObjectValueBindingImpl#getRuntimeValue <em>Runtime Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeObjectValueBindingImpl extends MinimalEObjectImpl.Container implements RuntimeObjectValueBinding {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The cached value of the '{@link #getRuntimeValue() <em>Runtime Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeValue()
	 * @generated
	 * @ordered
	 */
	protected RuntimeValue runtimeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeObjectValueBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_OBJECT_VALUE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject) feature;
			feature = (EStructuralFeature) eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE,
					oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeValue getRuntimeValue() {
		return runtimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeValue(RuntimeValue newRuntimeValue, NotificationChain msgs) {
		RuntimeValue oldRuntimeValue = runtimeValue;
		runtimeValue = newRuntimeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE, oldRuntimeValue, newRuntimeValue);
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
	public void setRuntimeValue(RuntimeValue newRuntimeValue) {
		if (newRuntimeValue != runtimeValue) {
			NotificationChain msgs = null;
			if (runtimeValue != null)
				msgs = ((InternalEObject) runtimeValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE, null, msgs);
			if (newRuntimeValue != null)
				msgs = ((InternalEObject) newRuntimeValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE, null, msgs);
			msgs = basicSetRuntimeValue(newRuntimeValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE, newRuntimeValue, newRuntimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE:
			return basicSetRuntimeValue(null, msgs);
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
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE:
			if (resolve)
				return getFeature();
			return basicGetFeature();
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE:
			return getRuntimeValue();
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
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE:
			setFeature((EStructuralFeature) newValue);
			return;
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE:
			setRuntimeValue((RuntimeValue) newValue);
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
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE:
			setFeature((EStructuralFeature) null);
			return;
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE:
			setRuntimeValue((RuntimeValue) null);
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
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__FEATURE:
			return feature != null;
		case SimplePackage.RUNTIME_OBJECT_VALUE_BINDING__RUNTIME_VALUE:
			return runtimeValue != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeObjectValueBindingImpl
