package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping
	public String returnHelloWorld() {
		return "Welcome to Jenkis with Springboot Journey";
	}

}
