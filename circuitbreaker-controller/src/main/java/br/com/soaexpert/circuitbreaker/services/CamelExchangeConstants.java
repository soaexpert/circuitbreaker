package br.com.soaexpert.circuitbreaker.services;

import org.apache.camel.Exchange;

public class CamelExchangeConstants<T> {
	
	public static final CamelExchangeConstants<String> CIRCUIT_STATE = new CamelExchangeConstants<>("CircuitHeader");
	
	
	
	private CamelExchangeConstants(String name) {
		this.name = name;
	}
	
	private String name;
	
	public void saveIn(Exchange exchange, T value) {
		exchange.setProperty(name, value);
	}

}
