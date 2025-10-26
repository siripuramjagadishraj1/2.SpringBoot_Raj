package com.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.application.HibernateEntityManagerConfiguration;
import com.application.HibernateSessionFactoryConfiguration;
import com.jpa.db.CustomerService;

@ExtendWith(SpringExtension.class)
//@Import(value= {HibernateSessionFactoryConfiguration.class})  //SessionFactory
@Import(value= {HibernateEntityManagerConfiguration.class})		//EntityManager
@PropertySource("classpath:application.properties")
public class B_Spring_Hibernate_Manual_Test {
	
	@Autowired
	private CustomerService service;

	@Test
	public void testPersistance() {
		service.persist();
		System.out.println("Done");
	}
}