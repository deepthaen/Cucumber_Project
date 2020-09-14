package com.vikas.cucumberFramework;

import org.testng.annotations.Test;

public class ReturnTestNGMethod {
	
	// A @Test method which is returning a value will be ignored by TestNG
		@Test
		public String returnMethod()
		{
			System.out.println("Returning Method");
			return "AmodMahajan";
		}
		
		@Test
		public void normalMethod()
		{
			System.out.println("Normal Method");
			System.out.println(returnMethod());
			
		}

}

/*
 * /////We can execute the return test cases with the help of TestNg.xml
 * file(small configuration required) you can force TestNG to include test
 * methods which are returning values to be included in normal run. You need to
 * set allow-return-values as true at suite level. <suite name="Suite"
 * allow-return-values="true"> <test thread-count="5" name="Test"> <classes>
 * <class name="TestAnnotation.ValueReturningTest"/> </classes>
 */