/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.Block;
import aom.scripting.xs.xs.FunctionDeclaration;
import aom.scripting.xs.xs.ParameterDeclaration;
import aom.scripting.xs.xs.Type;
import aom.scripting.xs.xs.XsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.FunctionDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends DeclarationImpl implements FunctionDeclaration
{
  /**
   * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected static final boolean MUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMutable()
   * @generated
   * @ordered
   */
  protected boolean mutable = MUTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterDeclaration> parameters;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Block body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclarationImpl()
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
    return XsPackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMutable()
  {
    return mutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMutable(boolean newMutable)
  {
    boolean oldMutable = mutable;
    mutable = newMutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__MUTABLE, oldMutable, mutable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.FUNCTION_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.FUNCTION_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDeclaration> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, XsPackage.FUNCTION_DECLARATION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Block newBody, NotificationChain msgs)
  {
    Block oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Block newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.FUNCTION_DECLARATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.FUNCTION_DECLARATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.FUNCTION_DECLARATION__BODY, newBody, newBody));
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
      case XsPackage.FUNCTION_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case XsPackage.FUNCTION_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case XsPackage.FUNCTION_DECLARATION__BODY:
        return basicSetBody(null, msgs);
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
      case XsPackage.FUNCTION_DECLARATION__MUTABLE:
        return isMutable();
      case XsPackage.FUNCTION_DECLARATION__TYPE:
        return getType();
      case XsPackage.FUNCTION_DECLARATION__NAME:
        return getName();
      case XsPackage.FUNCTION_DECLARATION__PARAMETERS:
        return getParameters();
      case XsPackage.FUNCTION_DECLARATION__BODY:
        return getBody();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XsPackage.FUNCTION_DECLARATION__MUTABLE:
        setMutable((Boolean)newValue);
        return;
      case XsPackage.FUNCTION_DECLARATION__TYPE:
        setType((Type)newValue);
        return;
      case XsPackage.FUNCTION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case XsPackage.FUNCTION_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterDeclaration>)newValue);
        return;
      case XsPackage.FUNCTION_DECLARATION__BODY:
        setBody((Block)newValue);
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
      case XsPackage.FUNCTION_DECLARATION__MUTABLE:
        setMutable(MUTABLE_EDEFAULT);
        return;
      case XsPackage.FUNCTION_DECLARATION__TYPE:
        setType((Type)null);
        return;
      case XsPackage.FUNCTION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XsPackage.FUNCTION_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case XsPackage.FUNCTION_DECLARATION__BODY:
        setBody((Block)null);
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
      case XsPackage.FUNCTION_DECLARATION__MUTABLE:
        return mutable != MUTABLE_EDEFAULT;
      case XsPackage.FUNCTION_DECLARATION__TYPE:
        return type != null;
      case XsPackage.FUNCTION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XsPackage.FUNCTION_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case XsPackage.FUNCTION_DECLARATION__BODY:
        return body != null;
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
    result.append(" (mutable: ");
    result.append(mutable);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionDeclarationImpl
