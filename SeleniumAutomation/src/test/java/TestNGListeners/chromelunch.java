package TestNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("open face book page");
		
		
		driver.quit();

	}

}
