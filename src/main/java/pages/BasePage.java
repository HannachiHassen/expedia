package pages;

import drivers.DriverManager;

public class BasePage {
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

}
