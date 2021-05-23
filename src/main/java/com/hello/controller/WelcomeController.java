package com.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
	@GetMapping(value="/api2")
	public String message()
	{
		return "welcome Controller";
	}
}
