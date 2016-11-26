/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.Block;
import aom.scripting.xs.xs.RuleDeclaration;
import aom.scripting.xs.xs.XsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#isActive <em>Active</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#isRunImmediately <em>Run Immediately</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#isHighFrequency <em>High Frequency</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDeclarationImpl extends DeclarationImpl implements RuleDeclaration
{
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
   * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActive()
   * @generated
   * @ordered
   */
  protected static final boolean ACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActive()
   * @generated
   * @ordered
   */
  protected boolean active = ACTIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isRunImmediately() <em>Run Immediately</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunImmediately()
   * @generated
   * @ordered
   */
  protected static final boolean RUN_IMMEDIATELY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRunImmediately() <em>Run Immediately</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRunImmediately()
   * @generated
   * @ordered
   */
  protected boolean runImmediately = RUN_IMMEDIATELY_EDEFAULT;

  /**
   * The default value of the '{@link #isHighFrequency() <em>High Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHighFrequency()
   * @generated
   * @ordered
   */
  protected static final boolean HIGH_FREQUENCY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHighFrequency() <em>High Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHighFrequency()
   * @generated
   * @ordered
   */
  protected boolean highFrequency = HIGH_FREQUENCY_EDEFAULT;

  /**
   * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected static final String GROUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected String group = GROUP_EDEFAULT;

  /**
   * The default value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInterval()
   * @generated
   * @ordered
   */
  protected static final int MIN_INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinInterval() <em>Min Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinInterval()
   * @generated
   * @ordered
   */
  protected int minInterval = MIN_INTERVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInterval()
   * @generated
   * @ordered
   */
  protected static final int MAX_INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxInterval() <em>Max Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxInterval()
   * @generated
   * @ordered
   */
  protected int maxInterval = MAX_INTERVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

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
  protected RuleDeclarationImpl()
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
    return XsPackage.Literals.RULE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isActive()
  {
    return active;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActive(boolean newActive)
  {
    boolean oldActive = active;
    active = newActive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__ACTIVE, oldActive, active));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRunImmediately()
  {
    return runImmediately;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunImmediately(boolean newRunImmediately)
  {
    boolean oldRunImmediately = runImmediately;
    runImmediately = newRunImmediately;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__RUN_IMMEDIATELY, oldRunImmediately, runImmediately));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHighFrequency()
  {
    return highFrequency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighFrequency(boolean newHighFrequency)
  {
    boolean oldHighFrequency = highFrequency;
    highFrequency = newHighFrequency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__HIGH_FREQUENCY, oldHighFrequency, highFrequency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(String newGroup)
  {
    String oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__GROUP, oldGroup, group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinInterval()
  {
    return minInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinInterval(int newMinInterval)
  {
    int oldMinInterval = minInterval;
    minInterval = newMinInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__MIN_INTERVAL, oldMinInterval, minInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxInterval()
  {
    return maxInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxInterval(int newMaxInterval)
  {
    int oldMaxInterval = maxInterval;
    maxInterval = newMaxInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__MAX_INTERVAL, oldMaxInterval, maxInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__PRIORITY, oldPriority, priority));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.RULE_DECLARATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.RULE_DECLARATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__BODY, newBody, newBody));
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
      case XsPackage.RULE_DECLARATION__BODY:
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
      case XsPackage.RULE_DECLARATION__NAME:
        return getName();
      case XsPackage.RULE_DECLARATION__ACTIVE:
        return isActive();
      case XsPackage.RULE_DECLARATION__RUN_IMMEDIATELY:
        return isRunImmediately();
      case XsPackage.RULE_DECLARATION__HIGH_FREQUENCY:
        return isHighFrequency();
      case XsPackage.RULE_DECLARATION__GROUP:
        return getGroup();
      case XsPackage.RULE_DECLARATION__MIN_INTERVAL:
        return getMinInterval();
      case XsPackage.RULE_DECLARATION__MAX_INTERVAL:
        return getMaxInterval();
      case XsPackage.RULE_DECLARATION__PRIORITY:
        return getPriority();
      case XsPackage.RULE_DECLARATION__BODY:
        return getBody();
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
      case XsPackage.RULE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case XsPackage.RULE_DECLARATION__ACTIVE:
        setActive((Boolean)newValue);
        return;
      case XsPackage.RULE_DECLARATION__RUN_IMMEDIATELY:
        setRunImmediately((Boolean)newValue);
        return;
      case XsPackage.RULE_DECLARATION__HIGH_FREQUENCY:
        setHighFrequency((Boolean)newValue);
        return;
      case XsPackage.RULE_DECLARATION__GROUP:
        setGroup((String)newValue);
        return;
      case XsPackage.RULE_DECLARATION__MIN_INTERVAL:
        setMinInterval((Integer)newValue);
        return;
      case XsPackage.RULE_DECLARATION__MAX_INTERVAL:
        setMaxInterval((Integer)newValue);
        return;
      case XsPackage.RULE_DECLARATION__PRIORITY:
        setPriority((Integer)newValue);
        return;
      case XsPackage.RULE_DECLARATION__BODY:
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
      case XsPackage.RULE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__ACTIVE:
        setActive(ACTIVE_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__RUN_IMMEDIATELY:
        setRunImmediately(RUN_IMMEDIATELY_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__HIGH_FREQUENCY:
        setHighFrequency(HIGH_FREQUENCY_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__GROUP:
        setGroup(GROUP_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__MIN_INTERVAL:
        setMinInterval(MIN_INTERVAL_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__MAX_INTERVAL:
        setMaxInterval(MAX_INTERVAL_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case XsPackage.RULE_DECLARATION__BODY:
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
      case XsPackage.RULE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XsPackage.RULE_DECLARATION__ACTIVE:
        return active != ACTIVE_EDEFAULT;
      case XsPackage.RULE_DECLARATION__RUN_IMMEDIATELY:
        return runImmediately != RUN_IMMEDIATELY_EDEFAULT;
      case XsPackage.RULE_DECLARATION__HIGH_FREQUENCY:
        return highFrequency != HIGH_FREQUENCY_EDEFAULT;
      case XsPackage.RULE_DECLARATION__GROUP:
        return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
      case XsPackage.RULE_DECLARATION__MIN_INTERVAL:
        return minInterval != MIN_INTERVAL_EDEFAULT;
      case XsPackage.RULE_DECLARATION__MAX_INTERVAL:
        return maxInterval != MAX_INTERVAL_EDEFAULT;
      case XsPackage.RULE_DECLARATION__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case XsPackage.RULE_DECLARATION__BODY:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", active: ");
    result.append(active);
    result.append(", runImmediately: ");
    result.append(runImmediately);
    result.append(", highFrequency: ");
    result.append(highFrequency);
    result.append(", group: ");
    result.append(group);
    result.append(", minInterval: ");
    result.append(minInterval);
    result.append(", maxInterval: ");
    result.append(maxInterval);
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

} //RuleDeclarationImpl
