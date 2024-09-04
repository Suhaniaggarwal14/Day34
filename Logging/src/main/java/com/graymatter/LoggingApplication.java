package com.graymatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class LoggingApplication {
	
	Logger logger=LoggerFactory.getLogger(Logger.class);
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello...";
	}

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
	}

}
