package br.com.soaexpert.credito.components.aggregator.mapping.impl;

import br.com.soaexpert.credito.components.aggregator.mapping.CreditoMappingStrategy;
import br.com.soaexpert.creditoservice.VerificaCreditoSPCResponse;
import br.com.soaexpert.domain.Credito;


public class SPCMappingStrategy implements CreditoMappingStrategy<VerificaCreditoSPCResponse> {

	@Override
	public void mapResponse(VerificaCreditoSPCResponse response, Credito credito) {
		credito.setEmpresa(response.getCredito().getEmpresa());
		credito.setSpc(response.getCredito().isSpc());
	}

}
