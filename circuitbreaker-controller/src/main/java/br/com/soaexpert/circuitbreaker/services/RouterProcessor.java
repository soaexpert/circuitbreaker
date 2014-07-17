package br.com.soaexpert.circuitbreaker.services;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import static org.apache.commons.lang3.StringUtils.*;

@Component("router")
public class RouterProcessor implements Processor {
	
	
	@Override
	public void process(Exchange exchange) throws Exception {

		String path = exchange.getIn().getHeader(Exchange.HTTP_PATH, String.class);
		path = substringBefore(path, "/");
		String method = exchange.getIn().getHeader(Exchange.HTTP_METHOD, String.class);
		exchange.getIn().setHeader("Route", "direct://" + path + "Service/" + method);

	}

}
