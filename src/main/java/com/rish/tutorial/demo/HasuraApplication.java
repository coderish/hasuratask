package com.rish.tutorial.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HasuraApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(HasuraApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HasuraApplication.class, args);
		LOGGER.info("HasuraApplication started successfully");
	}
}
