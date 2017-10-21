/**
 */
package aom.scripting.xs.xs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.IncludeDeclaration#getFilePath <em>File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getIncludeDeclaration()
 * @model
 * @generated
 */
public interface IncludeDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Path</em>' attribute.
   * @see #setFilePath(String)
   * @see aom.scripting.xs.xs.XsPackage#getIncludeDeclaration_FilePath()
   * @model
   * @generated
   */
  String getFilePath();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.IncludeDeclaration#getFilePath <em>File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Path</em>' attribute.
   * @see #getFilePath()
   * @generated
   */
  void setFilePath(String value);

} // IncludeDeclaration
