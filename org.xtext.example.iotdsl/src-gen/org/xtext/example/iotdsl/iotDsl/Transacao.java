/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iotdsl.iotDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.iotdsl.iotDsl.Transacao#getEvento <em>Evento</em>}</li>
 *   <li>{@link org.xtext.example.iotdsl.iotDsl.Transacao#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.iotdsl.iotDsl.IotDslPackage#getTransacao()
 * @model
 * @generated
 */
public interface Transacao extends EObject
{
  /**
   * Returns the value of the '<em><b>Evento</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evento</em>' reference.
   * @see #setEvento(Evento)
   * @see org.xtext.example.iotdsl.iotDsl.IotDslPackage#getTransacao_Evento()
   * @model
   * @generated
   */
  Evento getEvento();

  /**
   * Sets the value of the '{@link org.xtext.example.iotdsl.iotDsl.Transacao#getEvento <em>Evento</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evento</em>' reference.
   * @see #getEvento()
   * @generated
   */
  void setEvento(Evento value);

  /**
   * Returns the value of the '<em><b>Estado</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado</em>' reference.
   * @see #setEstado(Estado)
   * @see org.xtext.example.iotdsl.iotDsl.IotDslPackage#getTransacao_Estado()
   * @model
   * @generated
   */
  Estado getEstado();

  /**
   * Sets the value of the '{@link org.xtext.example.iotdsl.iotDsl.Transacao#getEstado <em>Estado</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado</em>' reference.
   * @see #getEstado()
   * @generated
   */
  void setEstado(Estado value);

} // Transacao
