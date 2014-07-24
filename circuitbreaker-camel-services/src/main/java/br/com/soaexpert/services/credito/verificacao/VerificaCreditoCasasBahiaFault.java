
package br.com.soaexpert.services.credito.verificacao;

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
     * Obtém o valor da propriedade verificaCreditoCasasBahiaFault.
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
     * Define o valor da propriedade verificaCreditoCasasBahiaFault.
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
