package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\ajyot\\OneDrive\\Desktop");
		
		
		
		
		
		
		
	}

}
