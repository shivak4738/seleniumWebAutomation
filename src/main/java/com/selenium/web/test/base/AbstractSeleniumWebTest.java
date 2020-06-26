package com.selenium.web.test.base;

import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeClass;

import com.selenium.web.test.AbstractSeleniumTest;
import com.selenium.web.test.config.ChromeDriverFactoryConfig;
import com.selenium.web.test.config.SeleniumConfig;
import com.selenium.web.test.config.TestConfig;


@ContextConfiguration(
		classes = {
				//BaseConfig.class,
				SeleniumConfig.class,
				ChromeDriverFactoryConfig.class,
				TestConfig.class
		}
)
public class AbstractSeleniumWebTest extends AbstractSeleniumTest{

	protected String sampleURL;

	@BeforeClass
	protected void setup() {
		sampleURL = env.getRequiredProperty("sampleURL");
	}
}
