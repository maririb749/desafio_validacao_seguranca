package com.devsuperior.demo.service.exceptions;

public class ResouceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResouceNotFoundException(String msg) {
		super(msg);
	}
}
