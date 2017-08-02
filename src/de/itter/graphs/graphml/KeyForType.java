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
 * <p>Java-Klasse für key.for.type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="key.for.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="graphml"/>
 *     &lt;enumeration value="graph"/>
 *     &lt;enumeration value="node"/>
 *     &lt;enumeration value="edge"/>
 *     &lt;enumeration value="hyperedge"/>
 *     &lt;enumeration value="port"/>
 *     &lt;enumeration value="endpoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "key.for.type")
@XmlEnum
public enum KeyForType {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("graphml")
    GRAPHML("graphml"),
    @XmlEnumValue("graph")
    GRAPH("graph"),
    @XmlEnumValue("node")
    NODE("node"),
    @XmlEnumValue("edge")
    EDGE("edge"),
    @XmlEnumValue("hyperedge")
    HYPEREDGE("hyperedge"),
    @XmlEnumValue("port")
    PORT("port"),
    @XmlEnumValue("endpoint")
    ENDPOINT("endpoint");
    private final String value;

    KeyForType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyForType fromValue(String v) {
        for (KeyForType c: KeyForType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
