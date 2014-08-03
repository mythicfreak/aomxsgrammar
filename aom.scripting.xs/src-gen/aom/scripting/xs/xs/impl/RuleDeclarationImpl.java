/**
 */
package aom.scripting.xs.xs.impl;

import aom.scripting.xs.xs.CompoundStatement;
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
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#isRunImmediately <em>Run Immediately</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#isHighFrequency <em>High Frequency</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.impl.RuleDeclarationImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDeclarationImpl extends DeclarationImpl implements RuleDeclaration
{
  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

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
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected CompoundStatement statements;

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
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__STATUS, oldStatus, status));
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
  public CompoundStatement getStatements()
  {
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatements(CompoundStatement newStatements, NotificationChain msgs)
  {
    CompoundStatement oldStatements = statements;
    statements = newStatements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__STATEMENTS, oldStatements, newStatements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatements(CompoundStatement newStatements)
  {
    if (newStatements != statements)
    {
      NotificationChain msgs = null;
      if (statements != null)
        msgs = ((InternalEObject)statements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XsPackage.RULE_DECLARATION__STATEMENTS, null, msgs);
      if (newStatements != null)
        msgs = ((InternalEObject)newStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XsPackage.RULE_DECLARATION__STATEMENTS, null, msgs);
      msgs = basicSetStatements(newStatements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsPackage.RULE_DECLARATION__STATEMENTS, newStatements, newStatements));
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
      case XsPackage.RULE_DECLARATION__STATEMENTS:
        return basicSetStatements(null, msgs);
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
      case XsPackage.RULE_DECLARATION__STATUS:
        return getStatus();
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
      case XsPackage.RULE_DECLARATION__STATEMENTS:
        return getStatements();
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
      case XsPackage.RULE_DECLARATION__STATUS:
        setStatus((String)newValue);
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
      case XsPackage.RULE_DECLARATION__STATEMENTS:
        setStatements((CompoundStatement)newValue);
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
      case XsPackage.RULE_DECLARATION__STATUS:
        setStatus(STATUS_EDEFAULT);
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
      case XsPackage.RULE_DECLARATION__STATEMENTS:
        setStatements((CompoundStatement)null);
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
      case XsPackage.RULE_DECLARATION__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
      case XsPackage.RULE_DECLARATION__STATEMENTS:
        return statements != null;
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
    result.append(" (status: ");
    result.append(status);
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
    result.append(')');
    return result.toString();
  }

} //RuleDeclarationImpl
