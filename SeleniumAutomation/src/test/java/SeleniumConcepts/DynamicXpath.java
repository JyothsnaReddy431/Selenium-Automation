package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//input[contains(@class,'addin')]")).sendKeys("java");
		//----startwith function using 
		//id='test_123 input
		//id='test-567
		//----ends with
		//id='2345test-'
		//id='234 test-t
		
		
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[start-with(@id,'text-')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test)]")).sendKeys("java");
		
		//links
		driver.findElement(By.xpath("//a[contains(text(),'mylinks')]")).click();
}
}