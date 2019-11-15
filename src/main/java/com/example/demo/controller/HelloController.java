package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements ErrorController {
    
    private static final String ERROR_PATH = "/error";

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
        
    @GetMapping(value = ERROR_PATH)
    public String pesanError() {
        return "Page tidak ditemukan.";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
