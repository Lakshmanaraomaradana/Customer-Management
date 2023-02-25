package com.example.demo.Exception;

public class CustomerAlreadyExists extends RuntimeException {
	
	String message;

	public CustomerAlreadyExists(String message) {
		super();
		this.message = message;
	}

	public CustomerAlreadyExists() {
		super();
	}
	
	
	

}
