package com.BasicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsIntestNg {
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void test1() {
		 
		System.out.println("open brwoser");
		// hard assertion ---immidiatly it will terminate the program ,it will not exicute next line of code
		Assert.assertEquals(true, true);
		
		System.out.println("enter username");
		System.out.println("Enter password");
		System.out.println("click on sigin button");
		Assert.assertEquals(true, true);
		
		
		System.out.println("validate home page");
		softassert.assertEquals(true, false);
		
		System.out.println("go to deals page");
		System.out.println("Create deals page");
		softassert.assertEquals(true, false);
		
		System.out.println("go to contacts page");
		System.out.println("Create contacts page");
		softassert.assertEquals(true, false);
		
		//soft assertion if test case field also it won't terminate the programm it will exicute next test cases
		//if we use assert all method by end it will show the field test cases
		// always use softassertions
		
		softassert.assertAll();
	}
	@Test
	public void logout() {
		System.out.println("logout");
		softassert.assertEquals(true, false);
		softassert.assertAll();
		
	}

}
