package com.garden.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity

@Table(name = "households")
public class hhModel {

	@Id
	@Column(name = "hh_id")
	
	@GeneratedValue(generator = "hh_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "hh_id_seq")
	private int hhid;
    @Column(name = "case_name")
    private String casename;
    @Column(name = "case_num")
    private String casenum;
    @Column(name = "case_password")
    private String casepassword;
    @Column(name = "penalties")
    private String penalities;
    @Column(name = "status")
    private String status;

    
} // hhModel()