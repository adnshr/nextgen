//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.23 at 12:30:40 CDT 
//


package edu.wustl.cider.jaxb.domain;


/**
 * Java content class for CollectionEventType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/C:/Users/pkalantri/Documents/caTissue/specimen_new.xsd line 62)
 * <p>
 * <pre>
 * &lt;complexType name="CollectionEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="collectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface CollectionEventType {


    /**
     * Gets the value of the collectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getCollectionDate();

    /**
     * Sets the value of the collectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setCollectionDate(java.util.Calendar value);

}
