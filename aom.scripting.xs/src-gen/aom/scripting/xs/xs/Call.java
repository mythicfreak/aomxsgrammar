/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.Call#getFunction <em>Function</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.Call#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(FunctionDeclaration)
   * @see aom.scripting.xs.xs.XsPackage#getCall_Function()
   * @model
   * @generated
   */
  FunctionDeclaration getFunction();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.Call#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(FunctionDeclaration value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link aom.scripting.xs.xs.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see aom.scripting.xs.xs.XsPackage#getCall_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

} // Call
