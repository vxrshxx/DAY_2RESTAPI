package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Question1 {
	@Value("${var}")
	private String name;
	
	@GetMapping("/sh")
	public String getName()
	{
		return "Hello, my name is "+name;
	}

}
