package br.com.soaexpert.credito.components.aggregator.mapping.impl;

import br.com.soaexpert.credito.components.aggregator.mapping.CreditoMappingStrategy;
import br.com.soaexpert.creditoservice.VerificaCreditoCasasBahiaResponse;
import br.com.soaexpert.domain.Credito;


public class CasasBahiaMappingStrategy implements CreditoMappingStrategy<VerificaCreditoCasasBahiaResponse> {

	@Override
	public void mapResponse(VerificaCreditoCasasBahiaResponse response, Credito credito) {
		credito.setEmpresa(response.getCredito().getEmpresa());
		credito.setCasasBahia(response.getCredito().isCasasBahia());
	}

}
