package com.nikh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeAPI {
	
	@GetMapping("/name/{name}")
	public String welcomeMessage(@PathVariable String name) {
		return "Welcome to my website  dear : " + name;
	}

}
