/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.VarDeclaration#getModifier <em>Modifier</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.VarDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.VarDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends Declaration, VarDeclarationOrStatement
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference.
   * @see #setModifier(VarModifier)
   * @see aom.scripting.xs.xs.XsPackage#getVarDeclaration_Modifier()
   * @model containment="true"
   * @generated
   */
  VarModifier getModifier();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VarDeclaration#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(VarModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(VarTypeSpecifier)
   * @see aom.scripting.xs.xs.XsPackage#getVarDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  VarTypeSpecifier getType();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VarDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(VarTypeSpecifier value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see aom.scripting.xs.xs.XsPackage#getVarDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.VarDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // VarDeclaration
