package com.selenium.web.test;

import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Base class for Selenium tests.  Provides a WebDriver that is wired appropriately.
 */
abstract public class AbstractSeleniumTest extends AbstractTest {

	@Autowired
	private Supplier<WebDriver> driverFactory;

	@Value("${selenium.wait.seconds:40}")
	private int waitSeconds=40;

	protected WebDriver driver;

	/**
	 * Convenience method to wait for a condition to exist
	 *
	 * @param condition The condition to wait for
	 */
	protected void waitUntil(ExpectedCondition<Object> condition) {
		
		new WebDriverWait(driver, waitSeconds).until(condition);
	}

	/**
	 * Convenience method to wait until a web element is around
	 *
	 * @param webElement The element to wait until it is displayed and enabled.
	 */
	protected void waitUntilReady(WebElement webElement) {
		waitUntil((WebDriver input) -> webElement.isDisplayed() && webElement.isEnabled());
	}

	@BeforeClass
	protected void initDriver() {
		this.driver = driverFactory.get();
	}

	/*@AfterClass
	protected void destroyDriver() {
		this.driver.quit();
	}*/
}

