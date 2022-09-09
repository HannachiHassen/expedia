package flight;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener extends Browser implements ITestListener {
	//public static String projectPath = System.getProperty("user.dir");

	public void onTestSuccess(ITestResult result) {
		try {
			screenshots(projectPath + "\\Pass\\");
			System.out.println("This is onTest Success method ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		try {
			screenshots(projectPath + "\\Fail\\");
			System.out.println("This is onTest Failure method ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is onTest Skipped method ");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("This is onTest Failed But Within Success Percentage method ");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is onStart method ");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is onStart method ");
	}
}
