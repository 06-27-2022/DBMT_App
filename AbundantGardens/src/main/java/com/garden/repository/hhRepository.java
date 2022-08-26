package com.garden.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garden.model.hhModel;

public interface hhRepository extends JpaRepository<hhModel, Integer>{
	
	List<hhModel> findAll();
	
	<S extends hhModel>  S save(S entity);
	
	@Query("select h from hhModel h where h.casenum = ?1 and h.casepassword = ?2")
	List<hhModel> findUsernameAndPassword(String casenum, String casepassword);
	
	@Query("update h hhModel set e = h.penalties = X h where h.id = ?1")
	List<hhModel> givePenalty(int id);

}
