
package br.com.soaexpert.creditoservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
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
     * @param message
     * @param faultInfo
     */
    public VerificaCreditoSPCFault_Exception(String message, VerificaCreditoSPCFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
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