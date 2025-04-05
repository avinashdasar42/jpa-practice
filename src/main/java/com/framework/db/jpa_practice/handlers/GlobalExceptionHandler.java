package com.framework.db.jpa_practice.handlers;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.framework.db.jpa_practice.exceptions.ProductNotFoundException;
import com.framework.db.jpa_practice.models.ApiError;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<ApiError> handleProductNotFoundException(ProductNotFoundException exc){
		ApiError error  = new ApiError();
		error.setMessage("Product id: "+exc.getId()+ " not found");
		error.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ApiError>(error, HttpStatus.BAD_REQUEST);
	}

}
