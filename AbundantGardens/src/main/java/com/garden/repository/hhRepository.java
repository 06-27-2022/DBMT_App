package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garden.model.hhModel;

public interface hhRepository extends JpaRepository<hhModel, Integer>{
	
	List<hhModel> findAll();
	
	<S extends hhModel>  S save(S entity);
	
	// List<hhModel> findAllById(int id);

}
