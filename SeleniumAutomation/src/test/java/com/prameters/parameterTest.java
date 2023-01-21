package com.prameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	WebDriver driver;
	// tenstng.xml file this are the envinorment variable ,it's not test data
	@Test
	@Parameters({"Env","Browser","URL","Username","Password"})
	public void ParameterTest(String Env,String Browser,String URL,String Username,String Password) {
		if(Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver2\\chromedriver.exe");
		driver=new ChromeDriver();
		}else if(Browser.equals("firefox")) {
			System.setProperty("webdriver.geko.driver","C:\\Users\\ajyot\\Downloads\\chromedriver2\\chromedriver.exe");
		driver=new FirefoxDriver();
	}
			driver.get(URL);
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("pass")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
	}

}
