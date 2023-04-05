package jUnitTestingPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AnnotationTesting {

	@BeforeMethod
	public void before() {
		System.out.println("BrowserOpening and Maximizing");
	}
	
	@Test
	public void ValidUsernameAndValidPassword() {
		System.out.println("Executing Test1");
	}
	
	@Test
	public void InvalidUsernameAndValidPassword() {
		System.out.println("Executing Test2");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("Browser Closing/Quiting");
	}
	
	
	
}
