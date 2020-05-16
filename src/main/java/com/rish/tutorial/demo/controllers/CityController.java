package com.rish.tutorial.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rish.tutorial.demo.models.City;
import com.rish.tutorial.demo.services.CityService;

@Controller
@RequestMapping("v1/cities")
public class CityController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);

	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}

	@GetMapping("/health")
	public ResponseEntity<String> health() {
		LOGGER.info("Inside CityController - health#");
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

	@GetMapping("/get-all")
	public ResponseEntity<List<City>> findCities() {
		LOGGER.info("Inside CityController - findCities#");

		List<City> cities = cityService.findAll();
		return new ResponseEntity<>(cities, HttpStatus.OK);
	}

	@GetMapping("/view")
	public String getView(Model model) {
		LOGGER.info("Inside CityController - getView#");

		List<City> cities = cityService.findAll();
		model.addAttribute("cities", cities);
		return "showCities";
	}
}
