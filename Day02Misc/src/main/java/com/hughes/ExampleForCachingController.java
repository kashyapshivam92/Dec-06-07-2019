package com.hughes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleForCachingController {
	@Autowired private MyService myService;
	
	@GetMapping("/info/{name}")
	public String getInfo(@PathVariable String name) {
		return myService.getMessage(name);
	}
}
