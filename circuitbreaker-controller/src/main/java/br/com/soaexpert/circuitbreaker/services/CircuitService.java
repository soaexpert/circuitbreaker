package br.com.soaexpert.circuitbreaker.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;


@Service("circuitService")
@Path("/circuit")
public class CircuitService {

	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insert(CircuitData circuitData) {
		throw new UnsupportedOperationException("Should be executed by Camel");
	}
	
	
}
