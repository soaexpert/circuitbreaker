
package br.com.soaexpert.services.credito.verificacao;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soaexpert.services.credito.verificacao package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soaexpert.services.credito.verificacao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificaCreditoSerasaFault }
     * 
     */
    public VerificaCreditoSerasaFault createVerificaCreditoSerasaFault() {
        return new VerificaCreditoSerasaFault();
    }

    /**
     * Create an instance of {@link VerificaCreditoResponse }
     * 
     */
    public VerificaCreditoResponse createVerificaCreditoResponse() {
        return new VerificaCreditoResponse();
    }

    /**
     * Create an instance of {@link VerificaCredito }
     * 
     */
    public VerificaCredito createVerificaCredito() {
        return new VerificaCredito();
    }

    /**
     * Create an instance of {@link VerificaCreditoCasasBahiaFault }
     * 
     */
    public VerificaCreditoCasasBahiaFault createVerificaCreditoCasasBahiaFault() {
        return new VerificaCreditoCasasBahiaFault();
    }

    /**
     * Create an instance of {@link VerificaCreditoSPCFault }
     * 
     */
    public VerificaCreditoSPCFault createVerificaCreditoSPCFault() {
        return new VerificaCreditoSPCFault();
    }

}
