package com.rish.tutorial.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/books")
public class BookController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

	@GetMapping("/health")
	public ResponseEntity<String> health() {
		LOGGER.info("Inside BookController - health#");
		return new ResponseEntity<>("Health is good", HttpStatus.OK);
	}

}
