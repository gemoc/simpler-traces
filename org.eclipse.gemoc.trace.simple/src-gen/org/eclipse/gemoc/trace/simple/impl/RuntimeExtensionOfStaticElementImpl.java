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

import org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement;
import org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Extension Of Static Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl#getExtendedStaticElement <em>Extended Static Element</em>}</li>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeExtensionOfStaticElementImpl#getRuntimeBindings <em>Runtime Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeExtensionOfStaticElementImpl extends MinimalEObjectImpl.Container
		implements RuntimeExtensionOfStaticElement {
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
	 * The cached value of the '{@link #getRuntimeBindings() <em>Runtime Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeObjectValueBinding> runtimeBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeExtensionOfStaticElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_EXTENSION_OF_STATIC_ELEMENT;
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
							SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT,
							oldExtendedStaticElement, extendedStaticElement));
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
					SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT,
					oldExtendedStaticElement, extendedStaticElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeObjectValueBinding> getRuntimeBindings() {
		if (runtimeBindings == null) {
			runtimeBindings = new EObjectContainmentEList<RuntimeObjectValueBinding>(RuntimeObjectValueBinding.class,
					this, SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS);
		}
		return runtimeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS:
			return ((InternalEList<?>) getRuntimeBindings()).basicRemove(otherEnd, msgs);
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
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT:
			if (resolve)
				return getExtendedStaticElement();
			return basicGetExtendedStaticElement();
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS:
			return getRuntimeBindings();
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
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT:
			setExtendedStaticElement((EObject) newValue);
			return;
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS:
			getRuntimeBindings().clear();
			getRuntimeBindings().addAll((Collection<? extends RuntimeObjectValueBinding>) newValue);
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
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT:
			setExtendedStaticElement((EObject) null);
			return;
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS:
			getRuntimeBindings().clear();
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
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__EXTENDED_STATIC_ELEMENT:
			return extendedStaticElement != null;
		case SimplePackage.RUNTIME_EXTENSION_OF_STATIC_ELEMENT__RUNTIME_BINDINGS:
			return runtimeBindings != null && !runtimeBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuntimeExtensionOfStaticElementImpl
