package TestNGListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	public void onTestFailur(ITestResult result) {
		System.out.println("FailedTest");
		failed();
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}
