package br.com.soaexpert.circuitbreaker.services;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.stereotype.Component;


@Component("agregadorResultadosCircuitos")
public class AgregadorResultadosCircuitos implements AggregationStrategy {
	
	
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		
		
		Integer responseCode = newExchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE, new Integer(200), Integer.class);
		
		if (responseCode == 503) {
			throw new RuntimeException("Circuito está aberto.");
		}
		
		return newExchange;
	}

}
