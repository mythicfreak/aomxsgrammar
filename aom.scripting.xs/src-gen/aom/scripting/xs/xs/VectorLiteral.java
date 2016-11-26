/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.VectorLiteral#getX <em>X</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.VectorLiteral#getY <em>Y</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.VectorLiteral#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getVectorLiteral()
 * @model
 * @generated
 */
public interface VectorLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(Expression)
   * @see aom.scripting.xs.xs.XsPackage#getVectorLiteral_X()
   * @model containment="true"
   * @generated
   */
  Expression getX();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VectorLiteral#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(Expression value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(Expression)
   * @see aom.scripting.xs.xs.XsPackage#getVectorLiteral_Y()
   * @model containment="true"
   * @generated
   */
  Expression getY();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VectorLiteral#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(Expression value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' containment reference.
   * @see #setZ(Expression)
   * @see aom.scripting.xs.xs.XsPackage#getVectorLiteral_Z()
   * @model containment="true"
   * @generated
   */
  Expression getZ();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VectorLiteral#getZ <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' containment reference.
   * @see #getZ()
   * @generated
   */
  void setZ(Expression value);

} // VectorLiteral
