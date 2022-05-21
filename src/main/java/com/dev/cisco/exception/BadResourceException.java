package com.dev.cisco.exception;

import java.util.ArrayList;
import java.util.List;

public class BadResourceException extends Exception {
	
	private List<String> errorMessages = new ArrayList<>();
	
	public BadResourceException() {
	}
	
	public BadResourceException(String msg) {
		super(msg);
	}
	
	public List<String> getErrorMessages(List<String> errorMessages){
		return errorMessages;
	}
	
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	public void addErrorMessage(String message) {
		this.errorMessages.add(message);
	}
	
}
