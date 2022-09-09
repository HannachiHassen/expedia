package drivers;

import java.util.Objects;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.FrameworkConstants;
import enums.ConfigProperties;
import utils.PropertyUtlis;

public final class Driver {
	
	private Driver() {

	}

	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.gecko.driver", FrameworkConstants.getGeckoDriverPath());
			DriverManager.setDriver(new FirefoxDriver());
		}
		DriverManager.getDriver().get(PropertyUtlis.get(ConfigProperties.URL));
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
