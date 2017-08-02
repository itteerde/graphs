//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.08.02 um 03:51:44 AM CEST 
//


package de.itter.graphs.graphml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für graph.order.type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="graph.order.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="free"/>
 *     &lt;enumeration value="nodesfirst"/>
 *     &lt;enumeration value="adjacencylist"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "graph.order.type")
@XmlEnum
public enum GraphOrderType {

    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("nodesfirst")
    NODESFIRST("nodesfirst"),
    @XmlEnumValue("adjacencylist")
    ADJACENCYLIST("adjacencylist");
    private final String value;

    GraphOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GraphOrderType fromValue(String v) {
        for (GraphOrderType c: GraphOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
