package br.com.soaexpert.credito.components.aggregator;

import org.mule.DefaultMuleEvent;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.routing.AggregationContext;
import org.mule.routing.AggregationStrategy;

import br.com.soaexpert.credito.components.aggregator.mapping.CreditoMappingStrategyFactory;
import br.com.soaexpert.creditoservice.VerificaCreditoResponse;
import br.com.soaexpert.domain.Credito;


public class VerificacaoCreditoAggregationStrategy implements AggregationStrategy {

	@Override
	public MuleEvent aggregate(AggregationContext context) throws MuleException {
		VerificaCreditoResponse resultado = new VerificaCreditoResponse();
		resultado.setCredito(new Credito());

		for (MuleEvent event : context.getEvents()) {
			CreditoMappingStrategyFactory.mapCredito(event.getMessage().getPayload(), resultado.getCredito());
		}

		boolean aprovado = resultado.getCredito().isCasasBahia() && resultado.getCredito().isSerasa() && resultado.getCredito().isSpc();
		resultado.getCredito().setAprovado(aprovado);

		MuleMessage response = new DefaultMuleMessage((Object) resultado, context.getOriginalEvent().getMuleContext());
		return new DefaultMuleEvent(response, context.getOriginalEvent(), context.getOriginalEvent().getSession());
	}

}