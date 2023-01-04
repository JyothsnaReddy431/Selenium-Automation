package SeleniumConcepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcpt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
		String Linktext=linklist.get(i).getText();
		System.out.println(Linktext);
		}

	}

}
