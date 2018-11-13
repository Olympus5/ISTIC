/**
 * generated by Xtext 2.15.0
 */
package org.xtext.mlh.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mlh.videoGen.Mandatory#getVideoseq <em>Videoseq</em>}</li>
 * </ul>
 *
 * @see org.xtext.mlh.videoGen.VideoGenPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends VideoType
{
  /**
   * Returns the value of the '<em><b>Videoseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoseq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoseq</em>' containment reference.
   * @see #setVideoseq(VideoSeq)
   * @see org.xtext.mlh.videoGen.VideoGenPackage#getMandatory_Videoseq()
   * @model containment="true"
   * @generated
   */
  VideoSeq getVideoseq();

  /**
   * Sets the value of the '{@link org.xtext.mlh.videoGen.Mandatory#getVideoseq <em>Videoseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Videoseq</em>' containment reference.
   * @see #getVideoseq()
   * @generated
   */
  void setVideoseq(VideoSeq value);

} // Mandatory
