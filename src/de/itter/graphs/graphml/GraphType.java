//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.08.02 um 03:51:44 AM CEST 
//


package de.itter.graphs.graphml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *       Complex type for the <graph> element.
 *     
 * 
 * <p>Java-Klasse für graph.type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="graph.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://graphml.graphdrawing.org/xmlns}desc" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}data"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}node"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}edge"/>
 *               &lt;element ref="{http://graphml.graphdrawing.org/xmlns}hyperedge"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *           &lt;element ref="{http://graphml.graphdrawing.org/xmlns}locator"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://graphml.graphdrawing.org/xmlns}graph.extra.attrib"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="edgedefault" use="required" type="{http://graphml.graphdrawing.org/xmlns}graph.edgedefault.type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graph.type", propOrder = {
    "desc",
    "dataOrNodeOrEdge",
    "locator"
})
public class GraphType {

    protected String desc;
    @XmlElements({
        @XmlElement(name = "data", type = DataType.class),
        @XmlElement(name = "node", type = NodeType.class),
        @XmlElement(name = "edge", type = EdgeType.class),
        @XmlElement(name = "hyperedge", type = HyperedgeType.class)
    })
    protected List<Object> dataOrNodeOrEdge;
    protected LocatorType locator;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "edgedefault", required = true)
    protected GraphEdgedefaultType edgedefault;
    @XmlAttribute(name = "parse.nodeids")
    protected GraphNodeidsType parseNodeids;
    @XmlAttribute(name = "parse.edgeids")
    protected GraphEdgeidsType parseEdgeids;
    @XmlAttribute(name = "parse.order")
    protected GraphOrderType parseOrder;
    @XmlAttribute(name = "parse.nodes")
    protected BigInteger parseNodes;
    @XmlAttribute(name = "parse.edges")
    protected BigInteger parseEdges;
    @XmlAttribute(name = "parse.maxindegree")
    protected BigInteger parseMaxindegree;
    @XmlAttribute(name = "parse.maxoutdegree")
    protected BigInteger parseMaxoutdegree;

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
     * Gets the value of the dataOrNodeOrEdge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOrNodeOrEdge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOrNodeOrEdge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataType }
     * {@link NodeType }
     * {@link EdgeType }
     * {@link HyperedgeType }
     * 
     * 
     */
    public List<Object> getDataOrNodeOrEdge() {
        if (dataOrNodeOrEdge == null) {
            dataOrNodeOrEdge = new ArrayList<Object>();
        }
        return this.dataOrNodeOrEdge;
    }

    /**
     * Ruft den Wert der locator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocatorType }
     *     
     */
    public LocatorType getLocator() {
        return locator;
    }

    /**
     * Legt den Wert der locator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatorType }
     *     
     */
    public void setLocator(LocatorType value) {
        this.locator = value;
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
     * Ruft den Wert der edgedefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphEdgedefaultType }
     *     
     */
    public GraphEdgedefaultType getEdgedefault() {
        return edgedefault;
    }

    /**
     * Legt den Wert der edgedefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphEdgedefaultType }
     *     
     */
    public void setEdgedefault(GraphEdgedefaultType value) {
        this.edgedefault = value;
    }

    /**
     * Ruft den Wert der parseNodeids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphNodeidsType }
     *     
     */
    public GraphNodeidsType getParseNodeids() {
        return parseNodeids;
    }

    /**
     * Legt den Wert der parseNodeids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphNodeidsType }
     *     
     */
    public void setParseNodeids(GraphNodeidsType value) {
        this.parseNodeids = value;
    }

    /**
     * Ruft den Wert der parseEdgeids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphEdgeidsType }
     *     
     */
    public GraphEdgeidsType getParseEdgeids() {
        return parseEdgeids;
    }

    /**
     * Legt den Wert der parseEdgeids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphEdgeidsType }
     *     
     */
    public void setParseEdgeids(GraphEdgeidsType value) {
        this.parseEdgeids = value;
    }

    /**
     * Ruft den Wert der parseOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GraphOrderType }
     *     
     */
    public GraphOrderType getParseOrder() {
        return parseOrder;
    }

    /**
     * Legt den Wert der parseOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphOrderType }
     *     
     */
    public void setParseOrder(GraphOrderType value) {
        this.parseOrder = value;
    }

    /**
     * Ruft den Wert der parseNodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParseNodes() {
        return parseNodes;
    }

    /**
     * Legt den Wert der parseNodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParseNodes(BigInteger value) {
        this.parseNodes = value;
    }

    /**
     * Ruft den Wert der parseEdges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParseEdges() {
        return parseEdges;
    }

    /**
     * Legt den Wert der parseEdges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParseEdges(BigInteger value) {
        this.parseEdges = value;
    }

    /**
     * Ruft den Wert der parseMaxindegree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParseMaxindegree() {
        return parseMaxindegree;
    }

    /**
     * Legt den Wert der parseMaxindegree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParseMaxindegree(BigInteger value) {
        this.parseMaxindegree = value;
    }

    /**
     * Ruft den Wert der parseMaxoutdegree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParseMaxoutdegree() {
        return parseMaxoutdegree;
    }

    /**
     * Legt den Wert der parseMaxoutdegree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParseMaxoutdegree(BigInteger value) {
        this.parseMaxoutdegree = value;
    }

}
