package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecific100Windows {
 static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")).click();
		//driver.findElement(By.name("Linkedin")).click();
		driver.findElement(By.name("faceBook")).click();
		driver.findElement(By.name("Twitter")).click();
		
	Set<String>handles=driver.getWindowHandles();
	List<String> hlist=new ArrayList<String>(handles);
	if(SwithToRightWindow("Linkedin",hlist)){
		System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());
	}
	SwitchToParentwindow(parentwindowId);
	System.out.println(driver.getCurrentUrl()+":"+driver.getTitle());
	}
	public static void closeAllWindows(List<String>hlist,String parentwindowId) {
		for(String e:hlist) {
			if(!e.equals(parentwindowId)) {
				driver.switchTo().window(e).close();
			}
		}
		
	}
	
	public static void SwitchToParentwindow(String parentwindowId) {
		
		driver.switchTo().window(parentwindowId);
	}
	public static boolean SwithToRightWindow(String WindowTitle,List<String>hlist) {
		for(String e:hlist) {
		String title= driver.switchTo().window(e).getTitle();
		if(title.contains(WindowTitle)) {
			System.out.println("Found right window....");
			return true;
		}
		}
		return false;
		
	}
	



	

}
