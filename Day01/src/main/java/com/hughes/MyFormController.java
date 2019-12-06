package com.hughes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFormController {

	@PostMapping("/processData")
	//@ResponseBody
	public String processFormData(@RequestParam("firstname") String firstName) {
		String message = "Hello " + firstName;
		return "output";
	}
	
}
