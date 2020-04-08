package flight.expedia.com;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
@Test(priority = 0)                    
    public void verifyHomepageTitle() {
	//print the results in console
	String actualTitle = driver.getTitle();
	System.out.println("The actual title of the website is" +actualTitle); 
	
	String actualUrl=driver.getCurrentUrl();
	System.out.println("The correct Url is opened."+actualUrl);
   }
@Test(priority = 1)
	  public void GetCurrentDateAndTime(){
	      int day, month, year;
	      int second, minute, hour;
	      GregorianCalendar date = new GregorianCalendar();

	      day = date.get(Calendar.DAY_OF_MONTH);
	      month = date.get(Calendar.MONTH);
	      year = date.get(Calendar.YEAR);
	      System.out.println("Current date for this test is  "+day+"/"+(month+1)+"/"+year);

	      second = date.get(Calendar.SECOND);
	      minute = date.get(Calendar.MINUTE);
	      hour = date.get(Calendar.HOUR);
	      System.out.println("Current time for this test is  "+hour+" : "+minute+" : "+second);
	   }
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String siteUrl, String browserType) {
	  if (browserType.equalsIgnoreCase("chrome")) {
		    //MAC or Windows Selection for excel path
		    if(System.getProperty("os.name").toLowerCase().contains("win")) {
			  System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
		    }else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			  System.setProperty("webdriver.chrome.driver", projectPath+"//Drivers//chromedriver.exe");
		    }
		driver =new ChromeDriver();
		driver.navigate().to(siteUrl); // Navigate to URL
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Wait For Page To Load	
		driver.manage().window().maximize();
		System.out.println("The Type of browser used for for this test is: "+browserType);
	  }else if(browserType.equalsIgnoreCase("firefox")){
		  String projectPath=System.getProperty("user.dir");
		  if(System.getProperty("os.name").toLowerCase().contains("win")) {
		  System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
		  }else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
			  System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers//chromedriver.exe");
		  }
		driver =new FirefoxDriver();
		driver.navigate().to(siteUrl); // Navigate to URL
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// Wait For Page To Load
		driver.manage().window().maximize();			
		System.out.println("The Type of browser used for for this test is: "+browserType);
	  }else {
		  System.out.println("Incorrect browser value passed! Please check name of the borwser.");
	  }
  }

  @AfterClass
  public void afterClass() {
  }
  public void screenshots(String source) throws IOException {
	  Date d =new Date();
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // Now you can do whatever you need to do with it, for example copy somewhere
	  FileUtils.copyFile(scrFile, new File(source+d.toString().replace(":", "_")+".png"));
  }
}
