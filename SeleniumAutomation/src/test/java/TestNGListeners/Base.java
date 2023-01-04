package TestNGListeners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public void initilization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajyot\\Downloads\\chromedriver2\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	
	public void failed() {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(srcfile, new File("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\ScreenShots"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}
	
	


