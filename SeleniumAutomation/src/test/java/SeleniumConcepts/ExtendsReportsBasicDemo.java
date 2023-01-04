package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtendsReportsBasicDemo {

	public static void main(String[] args) {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		//create object of extent report
		
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
        ExtentTest test1 = extent.createTest("Google search test one", "Search the google functonality");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test1.log(Status.INFO, "Starting test case");
		
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in search box");
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		//test1.pass("presed keybored enter key");
		
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		
		test1.info("Test completed");
		extent.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
