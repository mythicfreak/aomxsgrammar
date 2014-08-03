/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.PostfixExpression;
import aom.scripting.xs.xs.VarDeclaration;
import aom.scripting.xs.xs.XsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.impl.PostfixExpressionImpl#getPostfixVar <em>Postfix Var</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.PostfixExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostfixExpressionImpl extends ExpressionImpl implements PostfixExpression
{
  /**
   * The cached value of the '{@link #getPostfixVar() <em>Postfix Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostfixVar()
   * @generated
   * @ordered
   */
  protected VarDeclaration postfixVar;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostfixExpressionImpl()
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
    return XsPackage.Literals.POSTFIX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration getPostfixVar()
  {
    if (postfixVar != null && postfixVar.eIsProxy())
    {
      InternalEObject oldPostfixVar = (InternalEObject)postfixVar;
      postfixVar = (VarDeclaration)eResolveProxy(oldPostfixVar);
      if (postfixVar != oldPostfixVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR, oldPostfixVar, postfixVar));
      }
    }
    return postfixVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration basicGetPostfixVar()
  {
    return postfixVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostfixVar(VarDeclaration newPostfixVar)
  {
    VarDeclaration oldPostfixVar = postfixVar;
    postfixVar = newPostfixVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR, oldPostfixVar, postfixVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.POSTFIX_EXPRESSION__OP, oldOp, op));
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
      case XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR:
        if (resolve) return getPostfixVar();
        return basicGetPostfixVar();
      case XsPackage.POSTFIX_EXPRESSION__OP:
        return getOp();
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
      case XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR:
        setPostfixVar((VarDeclaration)newValue);
        return;
      case XsPackage.POSTFIX_EXPRESSION__OP:
        setOp((String)newValue);
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
      case XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR:
        setPostfixVar((VarDeclaration)null);
        return;
      case XsPackage.POSTFIX_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
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
      case XsPackage.POSTFIX_EXPRESSION__POSTFIX_VAR:
        return postfixVar != null;
      case XsPackage.POSTFIX_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //PostfixExpressionImpl
