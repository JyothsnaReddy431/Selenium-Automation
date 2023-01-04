package SeleniumConcepts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportswithTestNg {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	WebDriver driver;
@BeforeSuite
	public void setup() {
	 htmlReporter = new ExtentHtmlReporter("extent.html");
     extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
}
@BeforeTest
public void SetupTest() {
	
    ExtentTest test1 = extent.createTest("Google search test one", "Search the google functonality");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
	 driver=new ChromeDriver();
	}

@Test
public void test1() throws IOException {
	
	ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	driver.get("https://google.com");
	test.pass("navigate to google page");
    test.log(Status.INFO, "This step shows usage of log(status, details)");
    test.info("This step shows usage of info(details)");
    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    test.addScreenCaptureFromPath("screenshot.png");
}

@Test
public void test2() throws IOException {
	ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
    test.log(Status.INFO, "This step shows usage of log(status, details)");
    test.info("This step shows usage of info(details)");
    test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    test.addScreenCaptureFromPath("screenshot.png");
}
@AfterTest
public void tearDownTest() {
	driver.close();
	driver.quit();
	System.out.println("test is completed successfully");
}
@AfterSuite
public void tearDown() {
	extent.flush();
}
}
