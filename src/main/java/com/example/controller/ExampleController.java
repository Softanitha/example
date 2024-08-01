package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping("/welcome")
	public String getExample() {
		return "Hello Welcome to my project";
	}
}
