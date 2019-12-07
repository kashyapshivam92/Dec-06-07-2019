package com.hughes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleForSecurityController {

	@GetMapping("/bye/{name}")
	public String bye(@PathVariable String name) {
		return "Bye " + name;
	}
	
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable String name) {
		return "Hello " + name;
	}
	
}
