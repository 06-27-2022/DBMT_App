package com.garden.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name = "households")
public class hhModel {

    @Id
    @Column(name = "caseNum")

    private String caseNum;
    @Column(name = "caseName")
    private String caseName;
    @Column(name = "casePassword")
    private String casePassword;
    @Column(name = "status")
    private String status;
    @Column(name = "penalties")
    private String penalities;
    
}