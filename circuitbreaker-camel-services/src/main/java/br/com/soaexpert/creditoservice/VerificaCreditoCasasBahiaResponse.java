
package br.com.soaexpert.creditoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.soaexpert.domain.Credito;


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
@XmlRootElement(name = "verificaCreditoCasasBahiaResponse")
public class VerificaCreditoCasasBahiaResponse {

    @XmlElement(required = true)
    protected Credito credito;

    /**
     * Obtém o valor da propriedade credito.
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
     * Define o valor da propriedade credito.
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
