/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.trace.simple.RuntimeObject#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObject()
 * @model
 * @generated
 */
public interface RuntimeObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gemoc.trace.simple.RuntimeObjectVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.eclipse.gemoc.trace.simple.SimplePackage#getRuntimeObject_Versions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RuntimeObjectVersion> getVersions();

} // RuntimeObject
