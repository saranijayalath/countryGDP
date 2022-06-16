package com.springboot.demo.springbootdemo.service.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.demo.springbootdemo.entity.CountryGDP;

import com.springboot.demo.springbootdemo.repository.CountryGDPDao;

@Service
public class CountryGDPServiceImpl implements CountryGDPService{

	
	@Autowired
	private CountryGDPDao  countryGDPDao;
	
	@Transactional
	@Override
	public List<CountryGDP> getAllCountryGDPList() {
	
		return countryGDPDao.getAllCountryGDP();
	}

}
