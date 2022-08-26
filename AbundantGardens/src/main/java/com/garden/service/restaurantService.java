package com.garden.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.model.restaurantModel;
import com.garden.repository.restaurantRepository;

@Service("restaurantService")
public class restaurantService {
	
	@Autowired
	private restaurantRepository restaurantRepo;
	
	public restaurantService() {
		
	}
	
	public List<restaurantModel> findAll() {
		
		return this.restaurantRepo.findAll();
	}
	
	public restaurantModel save(restaurantModel restaurant) {
		
		return this.restaurantRepo.save(restaurant);
	}
	
	public List<restaurantModel> findByRestCat(String category) {
		
		return this.restaurantRepo.findByRestCat(category);
	}

}
