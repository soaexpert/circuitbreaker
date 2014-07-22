package br.com.soaexpert.creditoservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.soaexpert.domain.Credito;
import br.com.soaexpert.domain.Empresa;


/**
 * Este web-service lança erros de negócio nos seguintes cenários: <br />
 * - O CNPJ da empresa terminar em 6, 7 ou 8. <br />
 * O Serviço também lança uma runtimeException na operação das casas Bahia se o CNPJ terminar em 9.
 * 
 * @author leonardogaona
 * @version 1.0
 * 
 */
@WebService(name = "CreditoService", targetNamespace = "http://soaexpert.com.br/CreditoService/")
public class CreditoServiceImpl implements CreditoService {

	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:8099/CreditoService", new CreditoServiceImpl());
		System.out.println("Service published on port 8099");
	}

	@WebMethod(action = "http://www.soaexpert.com.br/CreditoService/verificaCreditoSerasa")
	@WebResult(name = "credito", targetNamespace = "http://soaexpert.com.br/CreditoService/")
	@RequestWrapper(localName = "verificaCreditoSerasa", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoSerasa")
	@ResponseWrapper(localName = "verificaCreditoSerasaResponse", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoSerasaResponse")
	public Credito verificaCreditoSerasa(
			@WebParam(name = "empresa", targetNamespace = "http://soaexpert.com.br/CreditoService/") Empresa empresa)
			throws VerificaCreditoSerasaFault_Exception {
		
		System.out.println("Verificando crédito na SERASA");

		if (empresa.getCnpj().endsWith("6")) {
			throw new VerificaCreditoSerasaFault_Exception("Erro de negócio da Serasa", new VerificaCreditoSerasaFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setSerasa(true);

		return credito;
	}

	@WebMethod(action = "http://www.soaexpert.com.br/CreditoService/verificaCreditoSPC")
	@WebResult(name = "credito", targetNamespace = "http://soaexpert.com.br/CreditoService/")
	@RequestWrapper(localName = "verificaCreditoSPC", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoSPC")
	@ResponseWrapper(localName = "verificaCreditoSPCResponse", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoSPCResponse")
	public Credito verificaCreditoSPC(
			@WebParam(name = "empresa", targetNamespace = "http://soaexpert.com.br/CreditoService/") Empresa empresa)
			throws VerificaCreditoSPCFault_Exception {
		
		System.out.println("Verificando crédito no SPC");

		if (empresa.getCnpj().endsWith("7")) {
			throw new VerificaCreditoSPCFault_Exception("", new VerificaCreditoSPCFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setSpc(true);

		return credito;
	}

	@WebMethod(action = "http://www.soaexpert.com.br/CreditoService/verificaCreditoCasasBahia")
	@WebResult(name = "credito", targetNamespace = "http://soaexpert.com.br/CreditoService/")
	@RequestWrapper(localName = "verificaCreditoCasasBahia", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoCasasBahia")
	@ResponseWrapper(localName = "verificaCreditoCasasBahiaResponse", targetNamespace = "http://soaexpert.com.br/CreditoService/", className = "br.com.soaexpert.creditoservice.VerificaCreditoCasasBahiaResponse")
	public Credito verificaCreditoCasasBahia(
			@WebParam(name = "empresa", targetNamespace = "http://soaexpert.com.br/CreditoService/") Empresa empresa)
			throws VerificaCreditoCasasBahiaFault_Exception {

		System.out.println("Verificando crédito nas Casas Bahia");
		
		if (empresa.getCnpj().endsWith("9")) {
			throw new RuntimeException("Chama o suporte manolo");
		}

		if (empresa.getCnpj().endsWith("8")) {
			throw new VerificaCreditoCasasBahiaFault_Exception("Erro de negócio das casas bahia",
					new VerificaCreditoCasasBahiaFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setCasasBahia(true);

		return credito;
	}

}
