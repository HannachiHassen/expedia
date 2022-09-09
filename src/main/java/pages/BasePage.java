package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import reports.ExtentLogger;

public class BasePage {

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	protected void click(By by, WaitStrategy waitstrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.preformExplicitWait(by, waitstrategy);
		element.click();
		try {
			ExtentLogger.pass(elementname + " is clicked", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void sendKeys(By by, WaitStrategy waitstrategy, String value, String elementname) {

		WebElement element = ExplicitWaitFactory.preformExplicitWait(by, waitstrategy);
		element.sendKeys(value);
		try {
			ExtentLogger.pass(value + " is entered successfully in " + elementname, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
