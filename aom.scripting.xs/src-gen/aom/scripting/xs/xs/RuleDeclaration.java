/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#isActive <em>Active</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#isRunImmediately <em>Run Immediately</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#isHighFrequency <em>High Frequency</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#getGroup <em>Group</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.RuleDeclaration#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration()
 * @model
 * @generated
 */
public interface RuleDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see #setActive(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_Active()
   * @model
   * @generated
   */
  boolean isActive();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#isActive <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' attribute.
   * @see #isActive()
   * @generated
   */
  void setActive(boolean value);

  /**
   * Returns the value of the '<em><b>Run Immediately</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Run Immediately</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Run Immediately</em>' attribute.
   * @see #setRunImmediately(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_RunImmediately()
   * @model
   * @generated
   */
  boolean isRunImmediately();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#isRunImmediately <em>Run Immediately</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Run Immediately</em>' attribute.
   * @see #isRunImmediately()
   * @generated
   */
  void setRunImmediately(boolean value);

  /**
   * Returns the value of the '<em><b>High Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High Frequency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Frequency</em>' attribute.
   * @see #setHighFrequency(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_HighFrequency()
   * @model
   * @generated
   */
  boolean isHighFrequency();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#isHighFrequency <em>High Frequency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Frequency</em>' attribute.
   * @see #isHighFrequency()
   * @generated
   */
  void setHighFrequency(boolean value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute.
   * @see #setGroup(String)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_Group()
   * @model
   * @generated
   */
  String getGroup();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#getGroup <em>Group</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' attribute.
   * @see #getGroup()
   * @generated
   */
  void setGroup(String value);

  /**
   * Returns the value of the '<em><b>Min Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Interval</em>' attribute.
   * @see #setMinInterval(int)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_MinInterval()
   * @model
   * @generated
   */
  int getMinInterval();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#getMinInterval <em>Min Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Interval</em>' attribute.
   * @see #getMinInterval()
   * @generated
   */
  void setMinInterval(int value);

  /**
   * Returns the value of the '<em><b>Max Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Interval</em>' attribute.
   * @see #setMaxInterval(int)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_MaxInterval()
   * @model
   * @generated
   */
  int getMaxInterval();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#getMaxInterval <em>Max Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Interval</em>' attribute.
   * @see #getMaxInterval()
   * @generated
   */
  void setMaxInterval(int value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference.
   * @see #setStatements(CompoundStatement)
   * @see aom.scripting.xs.xs.XsPackage#getRuleDeclaration_Statements()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getStatements();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.RuleDeclaration#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(CompoundStatement value);

} // RuleDeclaration
