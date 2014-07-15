package br.com.soaexpert.creditoservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

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
		Endpoint.publish("http://localhost:8099/CreditoService", new CreditoServiceImpl());
	}

	public Credito verificaCreditoSerasa(Empresa empresa) throws VerificaCreditoSerasaFault_Exception {
		if (empresa.getCnpj().endsWith("6")) {
			throw new VerificaCreditoSerasaFault_Exception("Erro de negócio da Serasa", new VerificaCreditoSerasaFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setSerasa(true);

		return credito;
	}

	public Credito verificaCreditoSPC(Empresa empresa) throws VerificaCreditoSPCFault_Exception {
		if (empresa.getCnpj().endsWith("7")) {
			throw new VerificaCreditoSPCFault_Exception("", new VerificaCreditoSPCFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setSerasa(true);

		return credito;
	}

	public Credito verificaCreditoCasasBahia(Empresa empresa) throws VerificaCreditoCasasBahiaFault_Exception {
		if (empresa.getCnpj().endsWith("9")) {
			throw new RuntimeException("Chama o suporte manolo");
		}

		if (empresa.getCnpj().endsWith("8")) {
			throw new VerificaCreditoCasasBahiaFault_Exception("Erro de negócio das casas bahia",
					new VerificaCreditoCasasBahiaFault());
		}

		Credito credito = new Credito();
		credito.setEmpresa(empresa);
		credito.setSerasa(true);

		return credito;
	}

}
