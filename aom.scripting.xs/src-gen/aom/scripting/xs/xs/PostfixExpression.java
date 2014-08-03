/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.PostfixExpression#getPostfixVar <em>Postfix Var</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.PostfixExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getPostfixExpression()
 * @model
 * @generated
 */
public interface PostfixExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Postfix Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postfix Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postfix Var</em>' reference.
   * @see #setPostfixVar(VarDeclaration)
   * @see aom.scripting.xs.xs.XsPackage#getPostfixExpression_PostfixVar()
   * @model
   * @generated
   */
  VarDeclaration getPostfixVar();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.PostfixExpression#getPostfixVar <em>Postfix Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postfix Var</em>' reference.
   * @see #getPostfixVar()
   * @generated
   */
  void setPostfixVar(VarDeclaration value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see aom.scripting.xs.xs.XsPackage#getPostfixExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.PostfixExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // PostfixExpression
