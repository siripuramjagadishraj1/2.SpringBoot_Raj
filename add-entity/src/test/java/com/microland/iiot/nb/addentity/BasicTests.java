package com.microland.iiot.nb.addentity;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages= {"com.microland.iiot.nb"})
@TestPropertySource(locations="classpath:application.properties")
@EnableTransactionManagement  //Required for entity manager to work..
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicTests {}
