/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.Expression;
import aom.scripting.xs.xs.VectorLiteral;
import aom.scripting.xs.xs.XsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.impl.VectorLiteralImpl#getX <em>X</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.VectorLiteralImpl#getY <em>Y</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.VectorLiteralImpl#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VectorLiteralImpl extends LiteralImpl implements VectorLiteral
{
  /**
   * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected Expression x;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected Expression y;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected Expression z;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VectorLiteralImpl()
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
    return XsPackage.Literals.VECTOR_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetX(Expression newX, NotificationChain msgs)
  {
    Expression oldX = x;
    x = newX;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__X, oldX, newX);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(Expression newX)
  {
    if (newX != x)
    {
      NotificationChain msgs = null;
      if (x != null)
        msgs = ((InternalEObject)x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__X, null, msgs);
      if (newX != null)
        msgs = ((InternalEObject)newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__X, null, msgs);
      msgs = basicSetX(newX, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__X, newX, newX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetY(Expression newY, NotificationChain msgs)
  {
    Expression oldY = y;
    y = newY;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__Y, oldY, newY);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(Expression newY)
  {
    if (newY != y)
    {
      NotificationChain msgs = null;
      if (y != null)
        msgs = ((InternalEObject)y).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__Y, null, msgs);
      if (newY != null)
        msgs = ((InternalEObject)newY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__Y, null, msgs);
      msgs = basicSetY(newY, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__Y, newY, newY));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZ(Expression newZ, NotificationChain msgs)
  {
    Expression oldZ = z;
    z = newZ;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__Z, oldZ, newZ);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(Expression newZ)
  {
    if (newZ != z)
    {
      NotificationChain msgs = null;
      if (z != null)
        msgs = ((InternalEObject)z).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__Z, null, msgs);
      if (newZ != null)
        msgs = ((InternalEObject)newZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.VECTOR_LITERAL__Z, null, msgs);
      msgs = basicSetZ(newZ, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.VECTOR_LITERAL__Z, newZ, newZ));
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
      case XsPackage.VECTOR_LITERAL__X:
        return basicSetX(null, msgs);
      case XsPackage.VECTOR_LITERAL__Y:
        return basicSetY(null, msgs);
      case XsPackage.VECTOR_LITERAL__Z:
        return basicSetZ(null, msgs);
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
      case XsPackage.VECTOR_LITERAL__X:
        return getX();
      case XsPackage.VECTOR_LITERAL__Y:
        return getY();
      case XsPackage.VECTOR_LITERAL__Z:
        return getZ();
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
      case XsPackage.VECTOR_LITERAL__X:
        setX((Expression)newValue);
        return;
      case XsPackage.VECTOR_LITERAL__Y:
        setY((Expression)newValue);
        return;
      case XsPackage.VECTOR_LITERAL__Z:
        setZ((Expression)newValue);
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
      case XsPackage.VECTOR_LITERAL__X:
        setX((Expression)null);
        return;
      case XsPackage.VECTOR_LITERAL__Y:
        setY((Expression)null);
        return;
      case XsPackage.VECTOR_LITERAL__Z:
        setZ((Expression)null);
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
      case XsPackage.VECTOR_LITERAL__X:
        return x != null;
      case XsPackage.VECTOR_LITERAL__Y:
        return y != null;
      case XsPackage.VECTOR_LITERAL__Z:
        return z != null;
    }
    return super.eIsSet(featureID);
  }

} //VectorLiteralImpl
