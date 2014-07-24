
package br.com.soaexpert.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Credito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade empresa.
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
     * Define o valor da propriedade empresa.
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
     * Obtém o valor da propriedade serasa.
     * 
     */
    public boolean isSerasa() {
        return serasa;
    }

    /**
     * Define o valor da propriedade serasa.
     * 
     */
    public void setSerasa(boolean value) {
        this.serasa = value;
    }

    /**
     * Obtém o valor da propriedade spc.
     * 
     */
    public boolean isSpc() {
        return spc;
    }

    /**
     * Define o valor da propriedade spc.
     * 
     */
    public void setSpc(boolean value) {
        this.spc = value;
    }

    /**
     * Obtém o valor da propriedade casasBahia.
     * 
     */
    public boolean isCasasBahia() {
        return casasBahia;
    }

    /**
     * Define o valor da propriedade casasBahia.
     * 
     */
    public void setCasasBahia(boolean value) {
        this.casasBahia = value;
    }

    /**
     * Obtém o valor da propriedade aprovado.
     * 
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Define o valor da propriedade aprovado.
     * 
     */
    public void setAprovado(boolean value) {
        this.aprovado = value;
    }

}
