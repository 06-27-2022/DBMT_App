package com.garden.service;

// import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.model.hhModel;
import com.garden.repository.hhRepository;

@Service("hhService")
public class hhService {
	
	@Autowired
	private hhRepository hhRepo;
	
	public hhService() {
		
	}

	public List<hhModel> findAll() {
		
		return this.hhRepo.findAll();
	}
	
	public void save(hhModel household) {
		
		this.hhRepo.save(household);
	}
	
	public List<hhModel> findUsernameAndPassword(String casename, String casepassword) {
		
		return this.hhRepo.findUsernameAndPassword(casename, casepassword);
	}

}
