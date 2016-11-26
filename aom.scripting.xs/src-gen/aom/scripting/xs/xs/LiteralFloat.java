/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.LiteralFloat#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getLiteralFloat()
 * @model
 * @generated
 */
public interface LiteralFloat extends Literal
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see aom.scripting.xs.xs.XsPackage#getLiteralFloat_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.LiteralFloat#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

} // LiteralFloat
