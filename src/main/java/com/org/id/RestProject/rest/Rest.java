package com.org.id.RestProject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	
	
	
	
	
	@GetMapping("/test")
	public String test() {
	 return "Rest  json from spring boot !!!!!";
	}

}
