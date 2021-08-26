
package com.example.springbootswagger2.copybook.transaction;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for So1Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="So1Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="so1Name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="so1Class">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="so1Country">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "So1Record", propOrder = {
    "so1Name",
    "so1Class",
    "so1Country"
})
public class So1Record
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @CobolElement(cobolName = "SO1-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(10)", srceLine = 2)
    protected String so1Name;
    @XmlElement(required = true)
    @CobolElement(cobolName = "SO1-CLASS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(10)", srceLine = 3)
    protected String so1Class;
    @XmlElement(required = true)
    @CobolElement(cobolName = "SO1-COUNTRY", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(10)", srceLine = 4)
    protected String so1Country;

    /**
     * Gets the value of the so1Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSo1Name() {
        return so1Name;
    }

    /**
     * Sets the value of the so1Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSo1Name(String value) {
        this.so1Name = value;
    }

    public boolean isSetSo1Name() {
        return (this.so1Name!= null);
    }

    /**
     * Gets the value of the so1Class property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSo1Class() {
        return so1Class;
    }

    /**
     * Sets the value of the so1Class property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSo1Class(String value) {
        this.so1Class = value;
    }

    public boolean isSetSo1Class() {
        return (this.so1Class!= null);
    }

    /**
     * Gets the value of the so1Country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSo1Country() {
        return so1Country;
    }

    /**
     * Sets the value of the so1Country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSo1Country(String value) {
        this.so1Country = value;
    }

    public boolean isSetSo1Country() {
        return (this.so1Country!= null);
    }

}
