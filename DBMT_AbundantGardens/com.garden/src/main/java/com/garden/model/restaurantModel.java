package com.garden.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity

@Table(name = "restaurants")

public class restaurantModel {
	
	@Id
	@Column(name = "restId")
	
	@GeneratedValue(generator = "restaurant_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "restaurant_id_seq")
	private int restId;
	@Column(name = "restName")
	private String restName;
	@Column(name = "catergory")
	private String catergory;
	@Column(name = "address")
	private String address;
	@Column(name = "contact")
	private String contact;
	

}
