package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String sayHello() {
		return "Halo bro..";
	}
	
	@PostMapping(value="/uang")
	public String uang() {
		return "hello";
	}
	
	@GetMapping(value="/duit")
	public int duit() {
		return 1000;
	}
}
