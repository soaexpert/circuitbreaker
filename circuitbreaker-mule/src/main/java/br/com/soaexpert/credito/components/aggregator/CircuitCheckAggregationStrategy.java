package br.com.soaexpert.credito.components.aggregator;

import org.mule.DefaultMuleEvent;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.routing.AggregationContext;
import org.mule.routing.AggregationStrategy;


public class CircuitCheckAggregationStrategy implements AggregationStrategy {

	private static final String CIRCUIT_HTTP_CODE = "503";

	@Override
	public MuleEvent aggregate(AggregationContext context) throws MuleException {

		boolean healthy = true;

		for (MuleEvent event : context.getEvents()) {

			MuleMessage message = event.getMessage();
			final String circuitStatusCode = message.getInboundProperty("http.status");

			if (CIRCUIT_HTTP_CODE.equals(circuitStatusCode)) {
				healthy = false;
				break;
			}
		}

		MuleMessage message = new DefaultMuleMessage((Object) healthy, context.getOriginalEvent().getMuleContext());
		return new DefaultMuleEvent(message, context.getOriginalEvent(), context.getOriginalEvent().getSession());
	}

}
