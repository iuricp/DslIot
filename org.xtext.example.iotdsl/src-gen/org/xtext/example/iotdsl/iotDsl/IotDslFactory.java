/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iotdsl.iotDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.iotdsl.iotDsl.IotDslPackage
 * @generated
 */
public interface IotDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IotDslFactory eINSTANCE = org.xtext.example.iotdsl.iotDsl.impl.IotDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Iot Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iot Dsl</em>'.
   * @generated
   */
  IotDsl createIotDsl();

  /**
   * Returns a new object of class '<em>Evento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evento</em>'.
   * @generated
   */
  Evento createEvento();

  /**
   * Returns a new object of class '<em>Comando</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comando</em>'.
   * @generated
   */
  Comando createComando();

  /**
   * Returns a new object of class '<em>Estado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estado</em>'.
   * @generated
   */
  Estado createEstado();

  /**
   * Returns a new object of class '<em>Transacao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transacao</em>'.
   * @generated
   */
  Transacao createTransacao();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IotDslPackage getIotDslPackage();

} //IotDslFactory
