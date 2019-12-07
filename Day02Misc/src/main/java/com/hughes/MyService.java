package com.hughes;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Cacheable(value = "message")
	public String getMessage(String name) {
		System.out.println("**** Getting the message for " + name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello " + name;
	}
}
