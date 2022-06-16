package com.springboot.demo.springbootdemo.service.country;

import java.util.Date;
import java.util.List;

import com.springboot.demo.springbootdemo.entity.Country;

public interface CountryService {
	
	void saveCountry(Country country);
	List<Country> getAllCountry();
	double getCountryLisgdptBasedOnCounry(String alpha_3_code,String alpha_2_code, Date countryYearfrom,Date countryYearto);
}
