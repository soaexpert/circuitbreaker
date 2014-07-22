package br.com.soaexpert.credito.components.aggregator.mapping;

import java.util.HashMap;
import java.util.Map;

import br.com.soaexpert.credito.components.aggregator.mapping.impl.CasasBahiaMappingStrategy;
import br.com.soaexpert.credito.components.aggregator.mapping.impl.SPCMappingStrategy;
import br.com.soaexpert.credito.components.aggregator.mapping.impl.SerasaMappingStrategy;
import br.com.soaexpert.creditoservice.VerificaCreditoCasasBahiaResponse;
import br.com.soaexpert.creditoservice.VerificaCreditoSPCResponse;
import br.com.soaexpert.creditoservice.VerificaCreditoSerasaResponse;
import br.com.soaexpert.domain.Credito;


@SuppressWarnings("rawtypes")
public final class CreditoMappingStrategyFactory {

	private static Map<Class, CreditoMappingStrategy> strategies;

	static {
		strategies = new HashMap<Class, CreditoMappingStrategy>();
		strategies.put(VerificaCreditoSerasaResponse.class, new SerasaMappingStrategy());
		strategies.put(VerificaCreditoSPCResponse.class, new SPCMappingStrategy());
		strategies.put(VerificaCreditoCasasBahiaResponse.class, new CasasBahiaMappingStrategy());
	}

	@SuppressWarnings("unchecked")
	public static void mapCredito(Object response, Credito credito) {

		if (!strategies.containsKey(response.getClass())) {
			throw new RuntimeException("No mapping strategy found!");
		}

		strategies.get(response.getClass()).mapResponse(response, credito);
	}
}