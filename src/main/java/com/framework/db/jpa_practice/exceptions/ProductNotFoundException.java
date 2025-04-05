package com.framework.db.jpa_practice.exceptions;

import lombok.Getter;

@Getter
public class ProductNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;

	public ProductNotFoundException(String message) {
		super(message);
	}
	public ProductNotFoundException(Long id, String message) {
		super(message);
		this.id=id;
	}
}
