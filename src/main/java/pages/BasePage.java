package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;

public class BasePage {

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	public static void click(By by, WaitStrategy waitstrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.preformExplicitWait(by, waitstrategy);
		element.click();
	}

	protected void sendKeys(By by, WaitStrategy waitstrategy, String value, String elementname) {

		WebElement element = ExplicitWaitFactory.preformExplicitWait(by, waitstrategy);
		element.sendKeys(value);
	}
}
