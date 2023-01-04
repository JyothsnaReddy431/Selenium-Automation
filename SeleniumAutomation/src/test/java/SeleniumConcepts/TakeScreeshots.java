package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreeshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	FileUtils.copyDirectory(srcfile, new File("C:\\Users\\ajyot\\eclipse-workspace1\\SeleniumAutomation\\spice.png"));
			
		
		
	}

}
