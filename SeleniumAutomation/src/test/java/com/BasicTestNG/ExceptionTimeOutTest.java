package com.BasicTestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	
	//@Test(invocationTimeOut=2)
	//public void infinityloopTest() {
	//	int i=1;
	//	while(i==1) {
	//		System.out.println(i);
	//	}
	//}

	@Test(expectedExceptions=NumberFormatException.class)
	public void NUmberformateException() {
		String x="100A";
		Integer.parseInt(x);
	}
	
	
	
	
}
