package com.prameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://signup.ebay.com/pa/crte");
		
	}

	
	@Test
	public void halfebayregistration(String firstname,String lastname,String Email,String password) {
		
		driver.findElement(By.xpath("//input[@id='personalaccount-radio']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}