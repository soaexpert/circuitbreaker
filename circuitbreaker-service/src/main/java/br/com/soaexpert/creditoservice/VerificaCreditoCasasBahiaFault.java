
package br.com.soaexpert.creditoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verificaCreditoCasasBahiaFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "verificaCreditoCasasBahiaFault"
})
@XmlRootElement(name = "verificaCreditoCasasBahiaFault")
public class VerificaCreditoCasasBahiaFault {

    @XmlElement(required = true)
    protected String verificaCreditoCasasBahiaFault;

    /**
     * Gets the value of the verificaCreditoCasasBahiaFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificaCreditoCasasBahiaFault() {
        return verificaCreditoCasasBahiaFault;
    }

    /**
     * Sets the value of the verificaCreditoCasasBahiaFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificaCreditoCasasBahiaFault(String value) {
        this.verificaCreditoCasasBahiaFault = value;
    }

}
