package drivers;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.FrameworkConstants;

public final class Driver {
	
	private Driver() {

	}

	public static void initDriver(String browser) {
		if(Objects.isNull(DriverManager.getDriver())) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", FrameworkConstants.getGeckodriverpath());
				DriverManager.setDriver(new FirefoxDriver());
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
				DriverManager.setDriver(new ChromeDriver());
			}
		    else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", FrameworkConstants.getEdgedriverpath());
			DriverManager.setDriver(new EdgeDriver());
		    }
			DriverManager.getDriver().get(PropertyUtlis.get(ConfigProperties.URL));
		}
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
