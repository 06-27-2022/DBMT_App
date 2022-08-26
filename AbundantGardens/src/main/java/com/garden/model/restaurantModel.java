package com.garden.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity

@Table(name = "restaurants")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class restaurantModel {
	
	@Id
	@Column(name = "restid")
	
	@GeneratedValue(generator = "restaurant_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "restaurant_id_seq")
	private int restid;
	@Column(name = "restname")
	private String restname;
	@Column(name = "category")
	private String category;
	@Column(name = "address")
	private String address;
	@Column(name = "contact")
	private String contact;
	@Column(name = "rating")
	private String rating;
	

} // restaurantModel()
