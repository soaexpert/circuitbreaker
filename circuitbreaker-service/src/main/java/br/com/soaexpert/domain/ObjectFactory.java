
package br.com.soaexpert.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soaexpert.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Credito_QNAME = new QName("http://soaexpert.com.br/domain", "credito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soaexpert.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Credito }
     * 
     */
    public Credito createCredito() {
        return new Credito();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link LoteEmpresa }
     * 
     */
    public LoteEmpresa createLoteEmpresa() {
        return new LoteEmpresa();
    }

    /**
     * Create an instance of {@link NotaFiscal }
     * 
     */
    public NotaFiscal createNotaFiscal() {
        return new NotaFiscal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soaexpert.com.br/domain", name = "credito")
    public JAXBElement<Credito> createCredito(Credito value) {
        return new JAXBElement<Credito>(_Credito_QNAME, Credito.class, null, value);
    }

}
