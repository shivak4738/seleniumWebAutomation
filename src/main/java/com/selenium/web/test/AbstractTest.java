package com.selenium.web.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

/**
 * Base class for all tests.  Provides spring support for TestNG, SLF4J logging, and target property support.
 */
@TestPropertySource(locations = {"classpath:target-qa.properties"})
abstract public class AbstractTest extends AbstractTestNGSpringContextTests {

	// Not static: we want log information included from each of the subclasses, not from this one.
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected Environment env;
	
}
