package com.example.howmuch.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("Resource not found. Id " + id);
	}
	
	public ResourceNotFoundException(String barCode) {
		super("Resource not found. Bar code " + barCode);
	}

}
