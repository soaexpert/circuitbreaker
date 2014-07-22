package br.com.soaexpert.credito.components.aggregator.mapping;

import br.com.soaexpert.domain.Credito;


public interface CreditoMappingStrategy<T> {

	void mapResponse(T response, Credito credito);
}
