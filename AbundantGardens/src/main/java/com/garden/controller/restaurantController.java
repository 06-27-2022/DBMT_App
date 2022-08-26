package com.garden.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.garden.model.restaurantModel;
import com.garden.service.restaurantService;

@RestController("restaurantController")
@RequestMapping(path = "/restaurant")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class restaurantController {
	
	@Autowired
	private restaurantService restServ;
	
	@GetMapping(path = "/all")
	public List<restaurantModel> findAll() {
		
		return this.restServ.findAll();
	}
	
	@GetMapping(path = "/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<restaurantModel> findByRestCat(@PathVariable String category) {
	
		return this.restServ.findByRestCat(category);
	}
	
	
//	@GetMapping(path = "/{restName}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<restaurantModel> findByRestname(@PathVariable String restname) {
//		
//		return new ResponseEntity<restaurantModel>(this.restServ.findByRestName(restname), HttpStatus.OK);
//	}
	

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody restaurantModel restaurant) {
		this.restServ.save(restaurant);
	}
}
