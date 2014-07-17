package br.com.soaexpert.circuitbreaker.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;


@Service("circuitService")
@Path("/circuit")
public class CircuitService {

	
	
	/**
	 * Retorna os estados do circuito.
	 * Códigos de resposta:
	 * 	-> 200, se circuito fechado ou entre-aberto
	 *  -> 503, se circuito aberto
	 */
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{circuitName}")
	public Response find(@PathParam("circuitName")String circuitName) {
		throw new UnsupportedOperationException("Should be executed by Camel");
	}

	
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response insert(CircuitData circuitData) {
		throw new UnsupportedOperationException("Should be executed by Camel");
	}
	
	
}
