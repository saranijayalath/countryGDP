package com.springboot.demo.springbootdemo.repository;

import java.util.Date;
import java.util.List;

import com.springboot.demo.springbootdemo.entity.Country;

public interface CountryDao {
	
	void saveCountry(Country country);
	List<Country> getCountryList();
	double getCountrybasedonyear(String alpha_3_code,String alpha_2_code, Date countryYearfrom,Date countryYearto);
	
}
