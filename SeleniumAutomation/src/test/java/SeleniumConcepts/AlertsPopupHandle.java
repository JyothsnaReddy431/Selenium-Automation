package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("corrct messgae popup");
		}else {
			System.out.println("incorrct message poup");
		}
		alert.accept();
		//alert.dismiss();
		driver.quit();
		
	
		
	}

}
