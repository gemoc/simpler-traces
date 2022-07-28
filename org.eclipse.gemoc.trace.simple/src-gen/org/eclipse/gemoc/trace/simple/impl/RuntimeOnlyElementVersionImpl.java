/**
 */
package org.eclipse.gemoc.trace.simple.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion;
import org.eclipse.gemoc.trace.simple.RuntimeState;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Only Element Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl#getRuntimeState <em>Runtime State</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementVersionImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeOnlyElementVersionImpl extends MinimalEObjectImpl.Container implements RuntimeOnlyElementVersion {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EObject element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeOnlyElementVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_ONLY_ELEMENT_VERSION;
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
							SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE, oldRuntimeState, runtimeState));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE, oldRuntimeState, runtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		EObject oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT,
					oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE:
			if (resolve)
				return getRuntimeState();
			return basicGetRuntimeState();
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE:
			setRuntimeState((RuntimeState) newValue);
			return;
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT:
			setElement((EObject) newValue);
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE:
			setRuntimeState((RuntimeState) null);
			return;
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT:
			setElement((EObject) null);
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__RUNTIME_STATE:
			return runtimeState != null;
		case SimplePackage.RUNTIME_ONLY_ELEMENT_VERSION__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeOnlyElementVersionImpl
