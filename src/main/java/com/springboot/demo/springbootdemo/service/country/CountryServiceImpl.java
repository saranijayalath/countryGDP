package com.springboot.demo.springbootdemo.service.country;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.demo.springbootdemo.entity.Country;
import com.springboot.demo.springbootdemo.repository.CountryDao;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	private CountryDao  countryDao;

	@Transactional
	@Override
	public void saveCountry(Country country) {
		countryDao.saveCountry(country);
		
	}

	@Transactional
	@Override
	public List<Country> getAllCountry() {
		return countryDao.getCountryList();
	}

	@Override
	public double getCountryLisgdptBasedOnCounry(String alpha_3_code,String alpha_2_code, Date countryYearfrom,Date countryYearto) {
		// TODO Auto-generated method stub
		return countryDao.getCountrybasedonyear(alpha_3_code,alpha_2_code,countryYearfrom,countryYearto);
	}

}
