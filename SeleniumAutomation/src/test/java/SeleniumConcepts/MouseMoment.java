package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMoment {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Add-ons']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SpiceMAX")).click();
		System.out.println(driver.getTitle());
		String text=driver.getTitle();
		if(text.equals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets")) {
			System.out.println("corrct title is present");
		}else {
			System.out.println("incorrect title is present");
		}
				
		driver.quit();		
				

	}

}
