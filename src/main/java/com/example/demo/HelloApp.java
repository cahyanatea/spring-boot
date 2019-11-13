package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) {
            SpringApplication.run(HelloApp.class, args);
                
            Logger logger = LoggerFactory.getLogger(HelloApp.class);
            logger.warn("PESAN WARN");
            logger.error("PESAN ERROR");
            logger.info("PESAN INFO");
            logger.debug("PESAN DEBUG");
	}

}
