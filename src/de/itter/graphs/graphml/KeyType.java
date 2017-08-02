//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.08.02 um 03:51:44 AM CEST 
//


package de.itter.graphs.graphml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *       Complex type for the <key> element.
 *     
 * 
 * <p>Java-Klasse für key.type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="key.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}desc" minOccurs="0"/>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}default" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}key.extra.attrib"/>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="dynamic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="for" type="{http://graphml.graphdrawing.org/xmlns}key.for.type" default="all" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key.type", propOrder = {
    "desc",
    "_default"
})
public class KeyType {

    protected String desc;
    @XmlElement(name = "default")
    protected DefaultType _default;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "dynamic")
    protected Boolean dynamic;
    @XmlAttribute(name = "for")
    protected KeyForType _for;
    @XmlAttribute(name = "attr.name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attrName;
    @XmlAttribute(name = "attr.type")
    protected KeyTypeType attrType;

    /**
     * Ruft den Wert der desc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Legt den Wert der desc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Ruft den Wert der default-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultType }
     *     
     */
    public DefaultType getDefault() {
        return _default;
    }

    /**
     * Legt den Wert der default-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultType }
     *     
     */
    public void setDefault(DefaultType value) {
        this._default = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der dynamic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDynamic() {
        if (dynamic == null) {
            return false;
        } else {
            return dynamic;
        }
    }

    /**
     * Legt den Wert der dynamic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamic(Boolean value) {
        this.dynamic = value;
    }

    /**
     * Ruft den Wert der for-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyForType }
     *     
     */
    public KeyForType getFor() {
        if (_for == null) {
            return KeyForType.ALL;
        } else {
            return _for;
        }
    }

    /**
     * Legt den Wert der for-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyForType }
     *     
     */
    public void setFor(KeyForType value) {
        this._for = value;
    }

    /**
     * Ruft den Wert der attrName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Legt den Wert der attrName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Ruft den Wert der attrType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyTypeType }
     *     
     */
    public KeyTypeType getAttrType() {
        return attrType;
    }

    /**
     * Legt den Wert der attrType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTypeType }
     *     
     */
    public void setAttrType(KeyTypeType value) {
        this.attrType = value;
    }

}
