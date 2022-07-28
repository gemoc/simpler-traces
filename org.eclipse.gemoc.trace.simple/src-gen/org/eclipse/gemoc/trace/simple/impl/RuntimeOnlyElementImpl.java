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

import org.eclipse.gemoc.trace.simple.RuntimeOnlyElement;
import org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion;
import org.eclipse.gemoc.trace.simple.SimplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Only Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.impl.RuntimeOnlyElementImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuntimeOnlyElementImpl extends MinimalEObjectImpl.Container implements RuntimeOnlyElement {
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeOnlyElementVersion> versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeOnlyElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplePackage.Literals.RUNTIME_ONLY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeOnlyElementVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<RuntimeOnlyElementVersion>(RuntimeOnlyElementVersion.class, this,
					SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS:
			return ((InternalEList<?>) getVersions()).basicRemove(otherEnd, msgs);
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS:
			return getVersions();
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS:
			getVersions().clear();
			getVersions().addAll((Collection<? extends RuntimeOnlyElementVersion>) newValue);
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS:
			getVersions().clear();
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
		case SimplePackage.RUNTIME_ONLY_ELEMENT__VERSIONS:
			return versions != null && !versions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuntimeOnlyElementImpl
