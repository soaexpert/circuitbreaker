
package br.com.soaexpert.creditoservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "verificaCreditoSPCFault", targetNamespace = "http://soaexpert.com.br/CreditoService/")
public class VerificaCreditoSPCFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private VerificaCreditoSPCFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public VerificaCreditoSPCFault_Exception(String message, VerificaCreditoSPCFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public VerificaCreditoSPCFault_Exception(String message, VerificaCreditoSPCFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.soaexpert.creditoservice.VerificaCreditoSPCFault
     */
    public VerificaCreditoSPCFault getFaultInfo() {
        return faultInfo;
    }

}
