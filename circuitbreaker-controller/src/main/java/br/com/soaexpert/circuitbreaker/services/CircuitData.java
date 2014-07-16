package br.com.soaexpert.circuitbreaker.services;

public class CircuitData {
	
	private String circuitName;
	private Boolean requestSuccessful;
	private String disableCircuitURL;
	private String enableCircuitURL;
	
	public String getCircuitName() {
		return circuitName;
	}
	public void setCircuitName(String circuitName) {
		this.circuitName = circuitName;
	}
	public Boolean getRequestSuccessful() {
		return requestSuccessful;
	}
	public void setRequestSuccessful(Boolean requestSuccessful) {
		this.requestSuccessful = requestSuccessful;
	}
	public String getDisableCircuitURL() {
		return disableCircuitURL;
	}
	public void setDisableCircuitURL(String disableCircuitURL) {
		this.disableCircuitURL = disableCircuitURL;
	}
	public String getEnableCircuitURL() {
		return enableCircuitURL;
	}
	public void setEnableCircuitURL(String enableCircuitURL) {
		this.enableCircuitURL = enableCircuitURL;
	}
	
	
	

}
