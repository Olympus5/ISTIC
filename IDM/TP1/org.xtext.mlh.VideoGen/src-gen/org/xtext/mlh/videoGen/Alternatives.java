/**
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mlh.videoGen.Alternatives#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.mlh.videoGen.Alternatives#getVideoseqs <em>Videoseqs</em>}</li>
 * </ul>
 *
 * @see org.xtext.mlh.videoGen.VideoGenPackage#getAlternatives()
 * @model
 * @generated
 */
public interface Alternatives extends VideoType
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getAlternatives_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.Alternatives#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Videoseqs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mlh.videoGen.VideoSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoseqs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoseqs</em>' containment reference list.
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getAlternatives_Videoseqs()
   * @model containment="true"
   * @generated
   */
  EList<VideoSeq> getVideoseqs();

} // Alternatives
