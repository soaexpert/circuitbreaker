
package br.com.soaexpert.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Credito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Credito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empresa" type="{http://soaexpert.com.br/domain}Empresa"/>
 *         &lt;element name="serasa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="spc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="casasBahia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aprovado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credito", propOrder = {
    "empresa",
    "serasa",
    "spc",
    "casasBahia",
    "aprovado"
})
public class Credito {

    @XmlElement(required = true)
    protected Empresa empresa;
    protected boolean serasa;
    protected boolean spc;
    protected boolean casasBahia;
    protected boolean aprovado;

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresa(Empresa value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the serasa property.
     * 
     */
    public boolean isSerasa() {
        return serasa;
    }

    /**
     * Sets the value of the serasa property.
     * 
     */
    public void setSerasa(boolean value) {
        this.serasa = value;
    }

    /**
     * Gets the value of the spc property.
     * 
     */
    public boolean isSpc() {
        return spc;
    }

    /**
     * Sets the value of the spc property.
     * 
     */
    public void setSpc(boolean value) {
        this.spc = value;
    }

    /**
     * Gets the value of the casasBahia property.
     * 
     */
    public boolean isCasasBahia() {
        return casasBahia;
    }

    /**
     * Sets the value of the casasBahia property.
     * 
     */
    public void setCasasBahia(boolean value) {
        this.casasBahia = value;
    }

    /**
     * Gets the value of the aprovado property.
     * 
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Sets the value of the aprovado property.
     * 
     */
    public void setAprovado(boolean value) {
        this.aprovado = value;
    }

}
