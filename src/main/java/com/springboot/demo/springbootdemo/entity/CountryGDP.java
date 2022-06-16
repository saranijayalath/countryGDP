package com.springboot.demo.springbootdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
* Table containing country gdp data
* 
*/
@Entity
@Table(name="tbl_country_gdp")
public class CountryGDP {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int countryGdp_id;
	
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="year")
	private Date countryYear;
	
	@Column(name="value")
	private double gdpValue;
	
	

	public CountryGDP() {
		super();
	}

	public int getCountryGdp_id() {
		return countryGdp_id;
	}

	public void setCountryGdp_id(int countryGdp_id) {
		this.countryGdp_id = countryGdp_id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public Date getCountryYear() {
		return countryYear;
	}

	public void setCountryYear(Date countryYear) {
		this.countryYear = countryYear;
	}

	public double getGdpValue() {
		return gdpValue;
	}

	public void setGdpValue(double gdpValue) {
		this.gdpValue = gdpValue;
	}
	
//	@JsonBackReference
//	@ManyToOne()
//	@JoinColumn(name="country_fk_id")
//	private  Country country;

	

	
	

}
