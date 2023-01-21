package com.BasicTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGclass {
	/*@BefoureSuite
	 * @BefoureTest
	 * @Befoureclass
	 * @BefoureMethod
	 * @Test
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 */

@BeforeSuite
public void Setup() {
	System.out.println("setup system property methods");
}
@BeforeTest
public void lounchBrowser() {
	System.out.println("lounch browser");
}
@BeforeClass
public void login(){
	System.out.println("login app");	
	
}
@BeforeMethod
public void enterURl() {
	System.out.println("enter URL");
}
// for every method befoure it will print befoure method,test,after method	
/*@BeforeMethod
 * @Test
 * @@AfterMethod

 */

@Test(priority=1)
public void googletitleTest() {
	System.out.println("google title");
}
@Test(priority=2)
public void SearchText() {
	System.out.println("Search text in text box");
}
@Test(priority=3)
public void googleLogo() {
	System.out.println("identify google logo");
}
	
@AfterMethod
public void logout() {
	System.out.println("logout from app");
}
@AfterClass
public void closebrowser() {
	System.out.println("close the browser");
}
@AfterTest
public void DeleteAllcookies() {
	System.out.println("delete all cookies");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
