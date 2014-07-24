
package br.com.soaexpert.creditoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verificaCreditoFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "verificaCreditoFault"
})
@XmlRootElement(name = "verificaCreditoSerasaFault")
public class VerificaCreditoSerasaFault {

    @XmlElement(required = true)
    protected String verificaCreditoFault;

    /**
     * Obtém o valor da propriedade verificaCreditoFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificaCreditoFault() {
        return verificaCreditoFault;
    }

    /**
     * Define o valor da propriedade verificaCreditoFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificaCreditoFault(String value) {
        this.verificaCreditoFault = value;
    }

}
