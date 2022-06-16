package com.springboot.demo.springbootdemo.entity;

import java.util.Date;
/**
* request body
* 
*/
public class CountryQuery {
	
	String alpha_3_code;
	String alpha_2_code;
	Date countryYearfrom;
	Date countryYearto;
	public String getAlpha_3_code() {
		return alpha_3_code;
	}
	public void setAlpha_3_code(String alpha_3_code) {
		this.alpha_3_code = alpha_3_code;
	}
	public String getAlpha_2_code() {
		return alpha_2_code;
	}
	public void setAlpha_2_code(String alpha_2_code) {
		this.alpha_2_code = alpha_2_code;
	}
	public Date getCountryYearfrom() {
		return countryYearfrom;
	}
	public void setCountryYearfrom(Date countryYearfrom) {
		this.countryYearfrom = countryYearfrom;
	}
	public Date getCountryYearto() {
		return countryYearto;
	}
	public void setCountryYearto(Date countryYearto) {
		this.countryYearto = countryYearto;
	}
	
	
	

}
