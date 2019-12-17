package com.example.demo;

import com.example.demo.config.EnvBasedConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApp implements CommandLineRunner {
    
    @Autowired
    private EnvBasedConfig envBasedConfig;

	public static void main(String[] args) {
            SpringApplication.run(HelloApp.class, args);
                
            Logger logger = LoggerFactory.getLogger(HelloApp.class);
            logger.warn("PESAN WARN");
            logger.error("PESAN ERROR");
            logger.info("PESAN INFO");
            logger.debug("PESAN DEBUG");
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------");
        envBasedConfig.setup();
    }

}
