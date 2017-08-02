//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.08.02 um 03:51:44 AM CEST 
//


package de.itter.graphs.graphml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *       Extension mechanism for the content of <data> and <default>.
 *       The complex type data-extension.type is empty per default.
 *       Users may redefine this type in order to add content to 
 *       the complex types data.type and default.type which are 
 *       extensions of data-extension.type.
 *     
 * 
 * <p>Java-Klasse für data-extension.type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="data-extension.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data-extension.type", propOrder = {
    "content"
})
@XmlSeeAlso({
    DefaultType.class,
    DataType.class
})
public class DataExtensionType {

    @XmlValue
    protected String content;

    /**
     * 
     *       Extension mechanism for the content of <data> and <default>.
     *       The complex type data-extension.type is empty per default.
     *       Users may redefine this type in order to add content to 
     *       the complex types data.type and default.type which are 
     *       extensions of data-extension.type.
     *     
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Legt den Wert der content-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

}
