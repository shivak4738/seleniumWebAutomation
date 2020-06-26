package test.selenium.web.ui.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleHomePageObject {

	@FindBy(xpath="/html/body/form/input[1]")
	private WebElement submitButtonElement;

	@FindBy(xpath="/html/body/form/input[2]")
	private WebElement ResetButtonElement;

	@FindBy(xpath="/html/body/form/input[3]")
	private WebElement OkButtonElement;

	@FindBy(xpath="/html/body/form/input[4]")
	private WebElement imageElement;

	public Boolean isSubmitButtonPresent() {

		return !submitButtonElement.getAttribute("value").isEmpty();
	}

	public Boolean isResetButtonPresent() {

		return !ResetButtonElement.getAttribute("value").isEmpty();
	}

	public Boolean isOkButtonPresent() {

		return !OkButtonElement.getAttribute("value").isEmpty();
	}

	public Boolean isImagePresent() {

		return !imageElement.getAttribute("src").isEmpty();
	}
}
