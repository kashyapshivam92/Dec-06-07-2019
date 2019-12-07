package com.hughes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleForCachingController {
	@Autowired private MyService myService;

	@Autowired
	private CacheManager cacheManager;
	
	@GetMapping("/info/{name}")
	public String getInfo(@PathVariable String name) {
		Cache cache =  cacheManager.getCache("message");
		ValueWrapper vw = cache.get(name);
		
		if(vw != null) {
			System.out.println("---Present in the cache " + vw.get());
		}
		return myService.getMessage(name);
	}
}








