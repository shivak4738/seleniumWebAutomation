package test.selenium.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.web.test.base.AbstractSeleniumWebTest;

import test.selenium.web.ui.po.SampleHomePageObject;

public class SeleniumWebTest extends AbstractSeleniumWebTest{

	SampleHomePageObject homePage;

	@Test(priority=1)
	public void testIsSubmitButtonPresent() {

		final String sampleURL = env.getRequiredProperty("sampleURL");
		driver.get(sampleURL);
		driver.manage().window().maximize();

		homePage = PageFactory.initElements(driver,
				SampleHomePageObject.class);

		Boolean isSubmitButtonPresent = homePage.isSubmitButtonPresent();

		assertTrue(isSubmitButtonPresent, "Submit Button is not present");
	}

	@Test(priority=2)
	public void testIsResetButtonPresent() {

		Boolean isResetButtonPresent = homePage.isResetButtonPresent();

		assertTrue(isResetButtonPresent, "Reset Button is not present");
	}

	@Test(priority=3)
	public void testIsOkButtonPresent() {

		Boolean isOkButtonPresent = homePage.isOkButtonPresent();

		assertTrue(isOkButtonPresent, "Ok Button is not present");
	}

	@Test(priority=4)
	public void testIsImagePresent() {

		Boolean isImagePresent = homePage.isImagePresent();

		assertTrue(isImagePresent, "Image is not present");
	}
	
}
