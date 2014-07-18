
package br.com.soaexpert.creditoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.soaexpert.domain.Credito;


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
 *         &lt;element name="credito" type="{http://soaexpert.com.br/domain}Credito"/>
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
    "credito"
})
@XmlRootElement(name = "verificaCreditoResponse")
public class VerificaCreditoResponse {

    @XmlElement(required = true)
    protected Credito credito;

    /**
     * Gets the value of the credito property.
     * 
     * @return
     *     possible object is
     *     {@link Credito }
     *     
     */
    public Credito getCredito() {
        return credito;
    }

    /**
     * Sets the value of the credito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credito }
     *     
     */
    public void setCredito(Credito value) {
        this.credito = value;
    }

}
