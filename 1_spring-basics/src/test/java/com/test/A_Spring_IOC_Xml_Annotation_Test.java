package com.test;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
//1. XML Way
@ContextConfiguration(locations = "classpath:spring.xml" )

//2. Zero XML way
//@Import(value= {SpringBeanConfiguration.class})
//@PropertySource("classpath:application.properties")
public class A_Spring_IOC_Xml_Annotation_Test {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() throws Exception{
		System.out.println(ctx.getBean("apple3"));
		System.out.println(dataSource.getConnection());
	}

}
