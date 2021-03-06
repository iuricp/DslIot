/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iotdsl.iotDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.iotdsl.iotDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotDslFactoryImpl extends EFactoryImpl implements IotDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IotDslFactory init()
  {
    try
    {
      IotDslFactory theIotDslFactory = (IotDslFactory)EPackage.Registry.INSTANCE.getEFactory(IotDslPackage.eNS_URI);
      if (theIotDslFactory != null)
      {
        return theIotDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IotDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IotDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IotDslPackage.IOT_DSL: return createIotDsl();
      case IotDslPackage.EVENTO: return createEvento();
      case IotDslPackage.COMANDO: return createComando();
      case IotDslPackage.ESTADO: return createEstado();
      case IotDslPackage.TRANSACAO: return createTransacao();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IotDsl createIotDsl()
  {
    IotDslImpl iotDsl = new IotDslImpl();
    return iotDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Evento createEvento()
  {
    EventoImpl evento = new EventoImpl();
    return evento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comando createComando()
  {
    ComandoImpl comando = new ComandoImpl();
    return comando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Estado createEstado()
  {
    EstadoImpl estado = new EstadoImpl();
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transacao createTransacao()
  {
    TransacaoImpl transacao = new TransacaoImpl();
    return transacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IotDslPackage getIotDslPackage()
  {
    return (IotDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IotDslPackage getPackage()
  {
    return IotDslPackage.eINSTANCE;
  }

} //IotDslFactoryImpl
