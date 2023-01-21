package com.BasicTestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	 WebDriver driver;
	 // verbose=1 to 10 we can define
	 //it will give more details information in console out put
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajyot\\Downloads\\chromedriver2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		driver.get("http://www.google.com");
		
	}
	@Test(priority=1,groups="Title")
	public void googleTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	@Test(priority=2,groups="Logo")
	public void googlogo() {
		boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(b);
		
	}
	
	@Test(priority=3,groups="Links")
	public void VerifyGmailLink() {
		boolean b=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
		Assert.assertEquals(b, true);
	}
	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("test1 method");
	}
	@Test(priority=5,groups="Test")
	public void test2() {
	System.out.println("test2 method");	
		
	}	
		
	@Test(priority=6,groups="Test")
	public void test3() {
	System.out.println("test2 method");	
		
	}		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
