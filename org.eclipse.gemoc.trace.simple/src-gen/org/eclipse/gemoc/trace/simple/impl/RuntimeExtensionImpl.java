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

import org.eclipse.gemoc.trace.simple.RuntimeExtension;
import org.eclipse.gemoc.trace.simple.RuntimeValue;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionImpl#getRuntimeValues <em>Runtime Values</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionImpl#getExtendedStaticElement <em>Extended Static Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeExtensionImpl extends MinimalEObjectImpl.Container implements RuntimeExtension {
	/**
	 * The cached value of the '{@link #getRuntimeValues() <em>Runtime Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeValue> runtimeValues;

	/**
	 * The cached value of the '{@link #getExtendedStaticElement() <em>Extended Static Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStaticElement()
	 * @generated
	 * @ordered
	 */
	protected EObject extendedStaticElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeValue> getRuntimeValues() {
		if (runtimeValues == null) {
			runtimeValues = new EObjectContainmentEList<RuntimeValue>(RuntimeValue.class, this,
					SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES);
		}
		return runtimeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExtendedStaticElement() {
		if (extendedStaticElement != null && extendedStaticElement.eIsProxy()) {
			InternalEObject oldExtendedStaticElement = (InternalEObject) extendedStaticElement;
			extendedStaticElement = eResolveProxy(oldExtendedStaticElement);
			if (extendedStaticElement != oldExtendedStaticElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT, oldExtendedStaticElement,
							extendedStaticElement));
			}
		}
		return extendedStaticElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetExtendedStaticElement() {
		return extendedStaticElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedStaticElement(EObject newExtendedStaticElement) {
		EObject oldExtendedStaticElement = extendedStaticElement;
		extendedStaticElement = newExtendedStaticElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT, oldExtendedStaticElement,
					extendedStaticElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES:
			return ((InternalEList<?>) getRuntimeValues()).basicRemove(otherEnd, msgs);
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
		case SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES:
			return getRuntimeValues();
		case SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT:
			if (resolve)
				return getExtendedStaticElement();
			return basicGetExtendedStaticElement();
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
		case SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES:
			getRuntimeValues().clear();
			getRuntimeValues().addAll((Collection<? extends RuntimeValue>) newValue);
			return;
		case SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT:
			setExtendedStaticElement((EObject) newValue);
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
		case SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES:
			getRuntimeValues().clear();
			return;
		case SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT:
			setExtendedStaticElement((EObject) null);
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
		case SimplePackage.RUNTIME_EXTENSION__RUNTIME_VALUES:
			return runtimeValues != null && !runtimeValues.isEmpty();
		case SimplePackage.RUNTIME_EXTENSION__EXTENDED_STATIC_ELEMENT:
			return extendedStaticElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeExtensionImpl
