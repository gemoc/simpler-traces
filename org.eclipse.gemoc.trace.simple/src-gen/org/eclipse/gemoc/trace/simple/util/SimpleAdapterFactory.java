/**
 */
package org.eclipse.gemoc.trace.simple.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.simple.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.trace.simple.SimplePackage
 * @generated
 */
public class SimpleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSwitch<Adapter> modelSwitch = new SimpleSwitch<Adapter>() {
		@Override
		public Adapter caseSimpleTrace(SimpleTrace object) {
			return createSimpleTraceAdapter();
		}

		@Override
		public Adapter caseRuntimeState(RuntimeState object) {
			return createRuntimeStateAdapter();
		}

		@Override
		public Adapter caseRuntimeStep(RuntimeStep object) {
			return createRuntimeStepAdapter();
		}

		@Override
		public Adapter caseRuntimeValue(RuntimeValue object) {
			return createRuntimeValueAdapter();
		}

		@Override
		public Adapter caseRuntimeIntegerValue(RuntimeIntegerValue object) {
			return createRuntimeIntegerValueAdapter();
		}

		@Override
		public Adapter caseRuntimeReferenceValue(RuntimeReferenceValue object) {
			return createRuntimeReferenceValueAdapter();
		}

		@Override
		public Adapter caseRuntimeBooleanValue(RuntimeBooleanValue object) {
			return createRuntimeBooleanValueAdapter();
		}

		@Override
		public Adapter caseRuntimeStringValue(RuntimeStringValue object) {
			return createRuntimeStringValueAdapter();
		}

		@Override
		public Adapter caseRuntimeExtensionOfStaticElement(RuntimeExtensionOfStaticElement object) {
			return createRuntimeExtensionOfStaticElementAdapter();
		}

		@Override
		public Adapter caseRuntimeContainmentValue(RuntimeContainmentValue object) {
			return createRuntimeContainmentValueAdapter();
		}

		@Override
		public Adapter caseRuntimeOnlyElement(RuntimeOnlyElement object) {
			return createRuntimeOnlyElementAdapter();
		}

		@Override
		public Adapter caseRuntimeOnlyElementVersion(RuntimeOnlyElementVersion object) {
			return createRuntimeOnlyElementVersionAdapter();
		}

		@Override
		public Adapter caseRuntimeNullValue(RuntimeNullValue object) {
			return createRuntimeNullValueAdapter();
		}

		@Override
		public Adapter caseRuntimeObjectValueBinding(RuntimeObjectValueBinding object) {
			return createRuntimeObjectValueBindingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.SimpleTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.SimpleTrace
	 * @generated
	 */
	public Adapter createSimpleTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeState <em>Runtime State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeState
	 * @generated
	 */
	public Adapter createRuntimeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeStep <em>Runtime Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStep
	 * @generated
	 */
	public Adapter createRuntimeStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeValue <em>Runtime Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeValue
	 * @generated
	 */
	public Adapter createRuntimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeIntegerValue <em>Runtime Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeIntegerValue
	 * @generated
	 */
	public Adapter createRuntimeIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeReferenceValue <em>Runtime Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeReferenceValue
	 * @generated
	 */
	public Adapter createRuntimeReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeBooleanValue <em>Runtime Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeBooleanValue
	 * @generated
	 */
	public Adapter createRuntimeBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeStringValue <em>Runtime String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeStringValue
	 * @generated
	 */
	public Adapter createRuntimeStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement <em>Runtime Extension Of Static Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeExtensionOfStaticElement
	 * @generated
	 */
	public Adapter createRuntimeExtensionOfStaticElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeContainmentValue <em>Runtime Containment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeContainmentValue
	 * @generated
	 */
	public Adapter createRuntimeContainmentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElement <em>Runtime Only Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElement
	 * @generated
	 */
	public Adapter createRuntimeOnlyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion <em>Runtime Only Element Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeOnlyElementVersion
	 * @generated
	 */
	public Adapter createRuntimeOnlyElementVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeNullValue <em>Runtime Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeNullValue
	 * @generated
	 */
	public Adapter createRuntimeNullValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding <em>Runtime Object Value Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.simple.RuntimeObjectValueBinding
	 * @generated
	 */
	public Adapter createRuntimeObjectValueBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimpleAdapterFactory
