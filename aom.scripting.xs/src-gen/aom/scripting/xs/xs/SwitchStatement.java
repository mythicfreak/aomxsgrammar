/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.SwitchStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.SwitchStatement#getCases <em>Cases</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.SwitchStatement#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see aom.scripting.xs.xs.XsPackage#getSwitchStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.SwitchStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link aom.scripting.xs.xs.SwitchCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see aom.scripting.xs.xs.XsPackage#getSwitchStatement_Cases()
   * @model containment="true"
   * @generated
   */
  EList<SwitchCase> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(SwitchDefault)
   * @see aom.scripting.xs.xs.XsPackage#getSwitchStatement_Default()
   * @model containment="true"
   * @generated
   */
  SwitchDefault getDefault();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.SwitchStatement#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(SwitchDefault value);

} // SwitchStatement
