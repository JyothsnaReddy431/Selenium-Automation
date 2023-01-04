package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		//clickon( driver, driver.findElement(By.xpath("//button[@name='login']")), 20);
	
	}
	
	

	public static void clickon(WebDriver driver, WebElement locator,Duration timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	
	}
	
	
	
}
