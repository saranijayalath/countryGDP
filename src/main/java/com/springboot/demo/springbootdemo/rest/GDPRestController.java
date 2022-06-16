package com.springboot.demo.springbootdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.springbootdemo.entity.CountryGDP;
import com.springboot.demo.springbootdemo.service.country.CountryGDPService;


@RestController

public class GDPRestController {
	
	@Autowired
	private CountryGDPService countryGDPService;
	
	//view gdp data
	@GetMapping("/viewCountrygdp")
	public List<CountryGDP> getAllCountryGDP(){
		return countryGDPService.getAllCountryGDPList();
	}
	
	

}
