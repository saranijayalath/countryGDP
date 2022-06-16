package com.springboot.demo.springbootdemo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.springboot.demo.springbootdemo.entity.CountryGDP;

@Repository
public class CountryGDPDaoImpl implements CountryGDPDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CountryGDP> getAllCountryGDP() {
		Session currentSession =	entityManager.unwrap(Session.class); 
		Query<CountryGDP> query = currentSession.createQuery("from CountryGDP" , CountryGDP.class);
		List<CountryGDP> listCountryGDP = query.getResultList();
		return listCountryGDP;
	}

}
