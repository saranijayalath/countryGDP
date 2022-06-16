package com.springboot.demo.springbootdemo.repository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.springbootdemo.entity.Country;
import com.springboot.demo.springbootdemo.entity.CountryGDP;
import com.springboot.demo.springbootdemo.entity.CountryGDPEntity;

@Repository
public class CountryDaoImpl implements CountryDao{
	
	@Autowired
	private EntityManager entityManager;

//	save query
	@Override
	public void saveCountry(Country country) {
		Session currentSession =	entityManager.unwrap(Session.class); 
		
		currentSession.saveOrUpdate(country);
		
		
	}
	
//	get all countries

	@Override
	public List<Country> getCountryList() {
		Session currentSession =	entityManager.unwrap(Session.class); 
		Query<Country> query = currentSession.createQuery("from Country" , Country.class);
		List<Country> listcountry = query.getResultList();
		return listcountry;
	}

//	get the gdp growth based on year,alpha2 and apha3
	@Override
	public double getCountrybasedonyear(String alpha_3_code,String alpha_2_code, Date countryYearfrom,Date countryYearto) {
		
		Session currentSession =	entityManager.unwrap(Session.class);
		Query<CountryGDP> query = currentSession.createQuery("select cg FROM Country c left join CountryGDP cg on c.alpha_3_code = cg.country_code  "
				+ " WHERE c.alpha_3_code =: alpha_3_code and cg.gdpValue!=''  and cg.countryYear between :fromDate and :toDate order by cg.countryYear");
		query.setParameter("alpha_3_code", alpha_3_code);
		
		query.setParameter("fromDate", countryYearfrom);
		query.setParameter("toDate", countryYearto);
		List<CountryGDP> qs = query.getResultList();
		System.out.println(qs);
		double first_value=qs.get(0).getGdpValue();
		double last_value=qs.get(qs.size()-1).getGdpValue();
		double result_value=(last_value-first_value)/first_value;
		
		return result_value;
	}

	
	
	

}
