package com.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value="/api")
	public String message() {
		String msg ="welcome to boot";
		return msg;
	}

}
