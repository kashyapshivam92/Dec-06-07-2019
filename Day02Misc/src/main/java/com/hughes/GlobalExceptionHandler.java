package com.hughes;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException ex, WebRequest webRequest) {
		return new ResponseEntity<String>("Constraint failed: " + ex.getMessage(), 
				HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> handleException(NumberFormatException ex, WebRequest webRequest) {
		return new ResponseEntity<String>("Number format Error: " + ex.getMessage(), 
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
