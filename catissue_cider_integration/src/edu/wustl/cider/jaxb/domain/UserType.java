//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.23 at 12:30:40 CDT 
//


package edu.wustl.cider.jaxb.domain;


/**
 * Java content class for UserType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Users/pkalantri/Documents/caTissue/specimen_new.xsd line 83)
 * <p>
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface UserType {


    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getEmail();

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setEmail(java.lang.String value);

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFirstName();

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFirstName(java.lang.String value);

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLastName();

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLastName(java.lang.String value);

}
