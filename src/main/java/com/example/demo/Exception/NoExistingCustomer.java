package com.example.demo.Exception;

public class NoExistingCustomer extends RuntimeException{
	
	String message;

	public NoExistingCustomer(String message) {
		super();
		this.message = message;
	}

	public NoExistingCustomer() {
		super();
	}
	
	

}
