package com;

public class InsufficientTicketException extends Exception {
	private String message;
	public InsufficientTicketException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}

}
