package com.rish.tutorial.demo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rish.tutorial.demo.models.City;
import com.rish.tutorial.demo.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);

	private CityRepository repository;

	@Autowired
	public CityServiceImpl(CityRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<City> findAll() {
		LOGGER.info("Inside CityServiceImpl - findAll#");
		List<City> cities = (List<City>) repository.findAll();
		return cities;
	}

}
