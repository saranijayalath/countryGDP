package com.springboot.demo.springbootdemo.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.springbootdemo.entity.Country;
import com.springboot.demo.springbootdemo.entity.CountryQuery;
import com.springboot.demo.springbootdemo.service.country.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
//	view countries
	@GetMapping("/viewCountry")
	public List<Country> viewCountryList(){
		
		return countryService.getAllCountry();
	}
	
//	using parameters get gdp value
	@GetMapping("/country")
	public double viewCountryLists(@RequestBody CountryQuery cq) {
		
		String alpha_3_code = cq.getAlpha_3_code();
		String alpha_2_code = cq.getAlpha_2_code();
		Date countryYearfrom = cq.getCountryYearfrom();
		Date countryYearto = cq.getCountryYearto();

		return countryService.getCountryLisgdptBasedOnCounry(alpha_3_code,alpha_2_code,countryYearfrom,countryYearto);
		
		
	}
	

}
