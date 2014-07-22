package br.com.soaexpert.credito.components.aggregator.mapping.impl;

import br.com.soaexpert.credito.components.aggregator.mapping.CreditoMappingStrategy;
import br.com.soaexpert.creditoservice.VerificaCreditoSerasaResponse;
import br.com.soaexpert.domain.Credito;


public class SerasaMappingStrategy implements CreditoMappingStrategy<VerificaCreditoSerasaResponse> {

	@Override
	public void mapResponse(VerificaCreditoSerasaResponse response, Credito credito) {
		credito.setEmpresa(response.getCredito().getEmpresa());
		credito.setSerasa(response.getCredito().isSerasa());
	}

}
