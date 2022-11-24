/**
 */
package org.eclipse.gemoc.trace.simple;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.trace.simple.SimplePackage
 * @generated
 */
public interface SimpleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleFactory eINSTANCE = org.eclipse.gemoc.trace.simple.impl.SimpleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	SimpleTrace createSimpleTrace();

	/**
	 * Returns a new object of class '<em>Runtime State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime State</em>'.
	 * @generated
	 */
	RuntimeState createRuntimeState();

	/**
	 * Returns a new object of class '<em>Runtime Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Step</em>'.
	 * @generated
	 */
	RuntimeStep createRuntimeStep();

	/**
	 * Returns a new object of class '<em>Runtime Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Integer Value</em>'.
	 * @generated
	 */
	RuntimeIntegerValue createRuntimeIntegerValue();

	/**
	 * Returns a new object of class '<em>Runtime Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Reference Value</em>'.
	 * @generated
	 */
	RuntimeReferenceValue createRuntimeReferenceValue();

	/**
	 * Returns a new object of class '<em>Runtime Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Boolean Value</em>'.
	 * @generated
	 */
	RuntimeBooleanValue createRuntimeBooleanValue();

	/**
	 * Returns a new object of class '<em>Runtime String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime String Value</em>'.
	 * @generated
	 */
	RuntimeStringValue createRuntimeStringValue();

	/**
	 * Returns a new object of class '<em>Runtime Extension Of Static Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Extension Of Static Element</em>'.
	 * @generated
	 */
	RuntimeExtensionOfStaticElement createRuntimeExtensionOfStaticElement();

	/**
	 * Returns a new object of class '<em>Runtime Containment Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Containment Value</em>'.
	 * @generated
	 */
	RuntimeContainmentValue createRuntimeContainmentValue();

	/**
	 * Returns a new object of class '<em>Runtime Only Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Only Element</em>'.
	 * @generated
	 */
	RuntimeOnlyElement createRuntimeOnlyElement();

	/**
	 * Returns a new object of class '<em>Runtime Only Element Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Only Element Version</em>'.
	 * @generated
	 */
	RuntimeOnlyElementVersion createRuntimeOnlyElementVersion();

	/**
	 * Returns a new object of class '<em>Runtime Null Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Null Value</em>'.
	 * @generated
	 */
	RuntimeNullValue createRuntimeNullValue();

	/**
	 * Returns a new object of class '<em>Runtime Object Value Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Object Value Binding</em>'.
	 * @generated
	 */
	RuntimeObjectValueBinding createRuntimeObjectValueBinding();

	/**
	 * Returns a new object of class '<em>Runtime Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Collection</em>'.
	 * @generated
	 */
	RuntimeCollection createRuntimeCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplePackage getSimplePackage();

} //SimpleFactory
