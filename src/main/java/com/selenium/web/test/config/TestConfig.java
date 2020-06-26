package com.selenium.web.test.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration// replaces .xml configuration
@ComponentScan({"com.selenium.web.test"}) // uses to autowire
@PropertySource(value = {"classpath:target-qa.properties"})
public class TestConfig {

	private static final Logger log = LoggerFactory.getLogger(TestConfig.class);

//	@Bean
//	public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
//		log.info("Building PropertyPlaceHolder configurer");
//		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
//		ppc.setIgnoreResourceNotFound(false);
//		return ppc;
//	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		System.out.println("Building PropertySourcesPlaceholderConfigurer");
		return new PropertySourcesPlaceholderConfigurer();
	}
}
