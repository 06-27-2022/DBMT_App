package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garden.model.restaurantModel;

public interface restaurantRepository extends JpaRepository<restaurantModel, Integer>{
	
	List<restaurantModel> findAll();
	
	<S extends restaurantModel> S save(restaurantModel restaurant);
	
	@Query("select r from restaurantModel r where r.category = ?1")
	List<restaurantModel> findByRestCat(String category);
	
}
