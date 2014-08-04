package br.com.soaexpert.circuitbreaker.services;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.stereotype.Component;

import br.com.soaexpert.domain.Credito;
import br.com.soaexpert.domain.Empresa;


@Component("agregadorResultadosServicos")
public class AgregadorResultadosServicos implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		Credito result = null;

		if (newExchange.isFailed() || (oldExchange != null && oldExchange.isFailed())) {

			if (newExchange.isFailed()) {
				return newExchange;
			}
			else {
				return oldExchange;
			}

		}

		if (oldExchange == null) {

			result = newExchange.getIn().getBody(Credito.class);

			Empresa empresa = newExchange.getProperty("bodyOriginal", Empresa.class);
			result.setEmpresa(empresa);

		} else {
			result = oldExchange.getIn().getBody(Credito.class);
		}

		Credito responseBody = newExchange.getIn().getBody(Credito.class);
		switch (newExchange.getIn()
				.getHeader("operationName", String.class)) {
		case "verificaCreditoSerasa":
			result.setSerasa(responseBody.isSerasa());
			break;
		case "verificaCreditoSPC":
			result.setSpc(responseBody.isSpc());
			break;
		case "verificaCreditoCasasBahia":
			result.setCasasBahia(responseBody.isCasasBahia());
			break;
		}
		newExchange.getIn().setBody(result);
		result.setAprovado(result.isCasasBahia() && result.isSpc() && result.isSerasa());
		return newExchange;

	}

}
