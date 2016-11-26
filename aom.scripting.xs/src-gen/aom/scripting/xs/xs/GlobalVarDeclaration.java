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
 *   <li>{@link aom.scripting.xs.xs.GlobalVarDeclaration#isConst <em>Const</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.GlobalVarDeclaration#isExtern <em>Extern</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.GlobalVarDeclaration#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration()
 * @model
 * @generated
 */
public interface GlobalVarDeclaration extends Declaration, VarDeclaration
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration_Const()
   * @model
   * @generated
   */
  boolean isConst();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.GlobalVarDeclaration#isConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #isConst()
   * @generated
   */
  void setConst(boolean value);

  /**
   * Returns the value of the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extern</em>' attribute.
   * @see #setExtern(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration_Extern()
   * @model
   * @generated
   */
  boolean isExtern();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.GlobalVarDeclaration#isExtern <em>Extern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extern</em>' attribute.
   * @see #isExtern()
   * @generated
   */
  void setExtern(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see aom.scripting.xs.xs.XsPackage#getGlobalVarDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.GlobalVarDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // GlobalVarDeclaration
