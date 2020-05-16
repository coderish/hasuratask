package com.rish.tutorial.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rish.tutorial.demo.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
