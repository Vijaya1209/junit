package com.assignments.testcases;

public class InsufficientBalanceException extends RuntimeException {
	
	private String message;
	
	public InsufficientBalanceException(String message) {
		this.message = message;
	}

}
