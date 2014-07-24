
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
 *         &lt;element name="verificaCreditoSPCFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "verificaCreditoSPCFault"
})
@XmlRootElement(name = "verificaCreditoSPCFault")
public class VerificaCreditoSPCFault {

    @XmlElement(required = true)
    protected String verificaCreditoSPCFault;

    /**
     * Obtém o valor da propriedade verificaCreditoSPCFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificaCreditoSPCFault() {
        return verificaCreditoSPCFault;
    }

    /**
     * Define o valor da propriedade verificaCreditoSPCFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificaCreditoSPCFault(String value) {
        this.verificaCreditoSPCFault = value;
    }

}
