package com.BasicTestNG;

import org.testng.annotations.Test;

public class TestNGFeature {
	// if login test case will be failed then othere test cases will be skiped
	//if login test case will be pass then other test cases also pass.
	
	@Test
	public void LoginPage() {
		System.out.println("login page test");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginPage")
	public void HomePage() {
		System.out.println("homepage page test");
	}
	
	@Test(dependsOnMethods="LoginPage")
	public void SearchPage() {
		System.out.println("Search page test");
	}
	
	@Test(dependsOnMethods="LoginPage")
	public void registrationPage() {
		System.out.println("Reg page test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
