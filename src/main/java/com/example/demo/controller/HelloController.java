package com.example.demo.controller;

import com.example.demo.entity.ErrorJson;
import com.example.demo.service.MessageProviderService;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

@RestController
public class HelloController implements ErrorController {
    
    private static final String ERROR_PATH = "/error";
    
    @Autowired
    private MessageProviderService messageProviderService;
    
    @Value("${pesan.config}")
    String pesan;
    
    @Autowired
    private DefaultErrorAttributes errorAttributes;

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
    public ErrorJson pesanError(HttpServletRequest request, HttpServletResponse response) {
        return new ErrorJson(response.getStatus(), getErrorAttributes(request, false));
    }
    
    @GetMapping(value = "/pesan")
    public String pesan() {
        return pesan;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    public Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStactTrace) {
        ServletWebRequest servletWebRequest = new ServletWebRequest(request);
        return errorAttributes.getErrorAttributes(servletWebRequest, includeStactTrace);
    }
    
    @GetMapping(value = "xmldemo")
    public String xmlDemo() {
        return messageProviderService.getMessage();
    }
}
