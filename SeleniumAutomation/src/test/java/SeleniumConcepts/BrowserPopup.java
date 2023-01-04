package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//input[@id='test']")).click();
		
		Set<String>handler=driver.getWindowHandles();
		Iterator<String>it =handler.iterator();
		String parentwindowId=it.next();
		System.out.println("parent window id is:"+parentwindowId);
		String chiledWindowId=it.next();
		System.out.println("chiledwindow id is:"+chiledWindowId);
		
		driver.switchTo().window(chiledWindowId);
		System.out.println("page title is:"+driver.getTitle());
		driver.close();
	
		driver.switchTo().window(parentwindowId);
		System.out.println("page title is:"+driver.getTitle());
	}

}
