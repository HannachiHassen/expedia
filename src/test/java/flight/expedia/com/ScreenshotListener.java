package flight.expedia.com;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener extends Browser implements ITestListener {
	public static String projectPath=System.getProperty("user.dir");
	
	public void onTestSuccess(ITestResult result) {
		  try {
			  screenshots(projectPath+"\\Pass\\");
		  }catch (IOException e) {
			  e.printStackTrace();
		  }
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  try {
			  screenshots(projectPath+"\\Fail\\");
		  }catch (IOException e) {
			  e.printStackTrace();
		  }
	  }
}
