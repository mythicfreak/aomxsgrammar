/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.Expression;
import aom.scripting.xs.xs.Statement;
import aom.scripting.xs.xs.SwitchCase;
import aom.scripting.xs.xs.XsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.impl.SwitchCaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.SwitchCaseImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchCaseImpl extends MinimalEObjectImpl.Container implements SwitchCase
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchCaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XsPackage.Literals.SWITCH_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.SWITCH_CASE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.SWITCH_CASE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.SWITCH_CASE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.SWITCH_CASE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.SWITCH_CASE__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.SWITCH_CASE__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.SWITCH_CASE__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.SWITCH_CASE__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XsPackage.SWITCH_CASE__VALUE:
        return basicSetValue(null, msgs);
      case XsPackage.SWITCH_CASE__STATEMENT:
        return basicSetStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XsPackage.SWITCH_CASE__VALUE:
        return getValue();
      case XsPackage.SWITCH_CASE__STATEMENT:
        return getStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XsPackage.SWITCH_CASE__VALUE:
        setValue((Expression)newValue);
        return;
      case XsPackage.SWITCH_CASE__STATEMENT:
        setStatement((Statement)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XsPackage.SWITCH_CASE__VALUE:
        setValue((Expression)null);
        return;
      case XsPackage.SWITCH_CASE__STATEMENT:
        setStatement((Statement)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XsPackage.SWITCH_CASE__VALUE:
        return value != null;
      case XsPackage.SWITCH_CASE__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchCaseImpl
