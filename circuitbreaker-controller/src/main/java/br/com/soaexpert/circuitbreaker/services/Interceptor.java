package br.com.soaexpert.circuitbreaker.services;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


@Component("interceptor")
public class Interceptor implements Processor{
	
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		System.out.println(exchange.getIn().getHeaders());
		
	}

}
