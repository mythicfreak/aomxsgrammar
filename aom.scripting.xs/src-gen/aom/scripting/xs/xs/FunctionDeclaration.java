/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.FunctionDeclaration#isMutable <em>Mutable</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunctionDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunctionDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunctionDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.FunctionDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutable</em>' attribute.
   * @see #setMutable(boolean)
   * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration_Mutable()
   * @model
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunctionDeclaration#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

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
   * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunctionDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunctionDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link aom.scripting.xs.xs.ParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDeclaration> getParameters();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see aom.scripting.xs.xs.XsPackage#getFunctionDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.FunctionDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

} // FunctionDeclaration
