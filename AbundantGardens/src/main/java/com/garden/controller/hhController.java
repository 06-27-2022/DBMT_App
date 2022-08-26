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
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(path = "/allhh", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<hhModel> findAll() {
		
		return this.hhService.findAll();
	}

	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody hhModel household) {
		
		this.hhService.save(household);
	}
	
	@GetMapping(path = "/{casename}&{casepassword}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<hhModel> findUsernameAndPassword(@PathVariable String casename, @PathVariable String casepassword) {
		
		return this.hhService.findUsernameAndPassword(casename, casepassword);
	}
}
