package com.garden.controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.garden.model.hhModel;
import com.garden.service.hhService;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("hhController")
@RequestMapping(path = "/hh")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class hhController {

	@Autowired
	private hhService hhService;
	
	@GetMapping(path = "/allhh", produces = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(path = "/allhh", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<hhModel> findAll() {
		
		return this.hhService.findAll();
	}
	
//	@GetMapping(path = "/{casenum}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<hhModel> findByCaseNum(@PathVariable String casenum) {
//		
//		return new ResponseEntity<hhModel>(this.hhService.findByCaseNum(casenum), HttpStatus.OK);
//	}
	
	@PostMapping(path = "/savehh", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody hhModel household) {
		
		this.hhService.save(household);
	}
	
//	@GetMapping(path = "/status/{status}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<hhModel> findByStatus(@PathVariable String status) {
//
//		return this.hhService.findByStatus(status);
//	}
	
//	@GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<hhModel> findById(@RequestParam int id) {
//		
//		return this.hhService.findAllById(id);
//	}
}
