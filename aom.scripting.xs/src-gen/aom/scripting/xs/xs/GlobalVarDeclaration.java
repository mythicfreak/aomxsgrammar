/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.GlobalVarDeclaration#getModifier <em>Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration()
 * @model
 * @generated
 */
public interface GlobalVarDeclaration extends VarDeclaration
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
   * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration_Modifier()
   * @model containment="true"
   * @generated
   */
  VarModifier getModifier();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.GlobalVarDeclaration#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(VarModifier value);

} // GlobalVarDeclaration
