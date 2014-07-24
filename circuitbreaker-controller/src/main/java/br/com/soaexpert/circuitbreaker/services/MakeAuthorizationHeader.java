package br.com.soaexpert.circuitbreaker.services;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;


@Component("makeAuthorizationHeader")
public class MakeAuthorizationHeader {
	
	
	public String doIt() {
		String username = "circuit";
		String password = "circuit";
		
		String temp = username + ":" + password;
		byte[] data = Base64.encodeBase64(temp.getBytes());
		return "Basic " + new String(data);
	}
 
}
