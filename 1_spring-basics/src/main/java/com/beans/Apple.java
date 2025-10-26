package com.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple 
					/*implements BeanNameAware, //-->setBeanName
							  BeanFactoryAware, //-->setBeanFactory
							  BeanPostProcessor, //-->postProcessBeforeInitialization
							  InitializingBean, //-->afterPropertiesSet
							  DisposableBean //-->destroy
					*/
							  {
	
	@Value("${server.port}") private String testEnv;
	
	private Integer cost;
	
	private String name;
	
	private Seeds seeds;
	
	public Apple() {}
	
	public Apple(int cost, String name, Seeds seeds) {
		super();
		this.cost = cost;
		this.name = name;
		this.seeds = seeds;
	}
	public Seeds getSeeds() {
		return seeds;
	}
	
	public void setSeeds(Seeds seeds) {
		this.seeds = seeds;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{COST:"+cost+" NAME:"+name+" SEEDS:"+seeds+"}";
	}
	
	public void customInit() {
		System.out.println("**********Apple.customInit()");
	}
	
	public void customDestory() {
		System.out.println("**********Apple.customDestory()");
	}
/*
	@PostConstruct
	public void postConstruct() {
		System.out.println("**********postConstruct"+this);
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("**********PreDestroy"+this+" Property:"+testEnv);
	}
	
	@Override
	public void init() {
		System.out.println("**********Apple.init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("**********DisposableBean()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("**********InitializingBean");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("**********BeanPostProcessor.postProcessAfterInitialization :"+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("**********BeanPostProcessor.postProcessBeforeInitialization :"+beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("**********BeanFactoryAware :"+beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("**********BeanNameAware : "+name);
	}
	*/
}
