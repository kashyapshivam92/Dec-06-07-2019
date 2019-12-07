package com.hughes;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Min;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@Validated
public class ExampleForExceptionHandlingController {

	@GetMapping("/divide/{num1}/{num2}")
	public String divide(@PathVariable int num1, @PathVariable @Min(1) int num2) {
		return "Divide: " + (num1 / num2);
	}
	
	@GetMapping("/square/{num}")
	public String square(@PathVariable int num) {
		return "Square: " + (num * num);
	}
	
}
