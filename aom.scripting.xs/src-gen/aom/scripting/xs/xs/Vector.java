/**
 */
package aom.scripting.xs.xs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aom.scripting.xs.xs.Vector#getX <em>X</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.Vector#getY <em>Y</em>}</li>
 *   <li>{@link aom.scripting.xs.xs.Vector#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see aom.scripting.xs.xs.XsPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends EObject
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
   * @see #setX(LiteralNumOrVar)
   * @see aom.scripting.xs.xs.XsPackage#getVector_X()
   * @model containment="true"
   * @generated
   */
  LiteralNumOrVar getX();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.Vector#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(LiteralNumOrVar value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(LiteralNumOrVar)
   * @see aom.scripting.xs.xs.XsPackage#getVector_Y()
   * @model containment="true"
   * @generated
   */
  LiteralNumOrVar getY();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.Vector#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(LiteralNumOrVar value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' containment reference.
   * @see #setZ(LiteralNumOrVar)
   * @see aom.scripting.xs.xs.XsPackage#getVector_Z()
   * @model containment="true"
   * @generated
   */
  LiteralNumOrVar getZ();

  /**
   * Sets the value of the '{@link aom.scripting.xs.xs.Vector#getZ <em>Z</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' containment reference.
   * @see #getZ()
   * @generated
   */
  void setZ(LiteralNumOrVar value);

} // Vector
