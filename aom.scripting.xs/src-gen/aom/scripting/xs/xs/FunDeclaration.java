/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.FunDeclaration#getModifier <em>Modifier</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunDeclaration#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunDeclaration#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getFunDeclaration()
 * @model
 * @generated
 */
public interface FunDeclaration extends Declaration
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
   * @see #setModifier(FunModifier)
   * @see aom.scripting.xs.xs.XsPackage#getFunDeclaration_Modifier()
   * @model containment="true"
   * @generated
   */
  FunModifier getModifier();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunDeclaration#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(FunModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see aom.scripting.xs.xs.XsPackage#getFunDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramlist</em>' containment reference.
   * @see #setParamlist(Params)
   * @see aom.scripting.xs.xs.XsPackage#getFunDeclaration_Paramlist()
   * @model containment="true"
   * @generated
   */
  Params getParamlist();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunDeclaration#getParamlist <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramlist</em>' containment reference.
   * @see #getParamlist()
   * @generated
   */
  void setParamlist(Params value);

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
   * @see aom.scripting.xs.xs.XsPackage#getFunDeclaration_Statements()
   * @model containment="true"
   * @generated
   */
  CompoundStatement getStatements();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunDeclaration#getStatements <em>Statements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statements</em>' containment reference.
   * @see #getStatements()
   * @generated
   */
  void setStatements(CompoundStatement value);

} // FunDeclaration
