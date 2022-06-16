package com.springboot.demo.springbootdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
* Table containing country data
* 
*/
@Entity
@Table(name="tbl_country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int country_id;
	
	@Column(name="country")
	private String countryName;
	
	@Column(name="alpha_2_code")
	private String alpha_2_code;
	
	@Column(name="alpha_3_code")
	private String alpha_3_code;
	
	@Column(name="numeric_value")
	private String numeric;
//	@JsonManagedReference  
//	@OneToMany(mappedBy="country",cascade = CascadeType.ALL)
//	private List<CountryGDP> countryGDPList;

	public Country() {
		super();
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAlpha_2_code() {
		return alpha_2_code;
	}

	public void setAlpha_2_code(String alpha_2_code) {
		this.alpha_2_code = alpha_2_code;
	}

	public String getAlpha_3_code() {
		return alpha_3_code;
	}

	public void setAlpha_3_code(String alpha_3_code) {
		this.alpha_3_code = alpha_3_code;
	}

	public String getNumeric() {
		return numeric;
	}

	public void setNumeric(String numeric) {
		this.numeric = numeric;
	}

	

}
