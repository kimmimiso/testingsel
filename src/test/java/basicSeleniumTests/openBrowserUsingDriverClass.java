package basicSeleniumTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utitlties.BaseClass;

public class openBrowserUsingDriverClass {
	
	//recalling the web opening from BaseClass file in Utilities package

	@Before
	public void beforeMethod() {
		BaseClass.getDriver();
	}
	
	@Test
	public void test1() {
		
		// open the window
		String titlePage = BaseClass.getDriver().getTitle();
		System.out.println(titlePage);	
		System.out.println(BaseClass.getProperty("userName"));
		System.out.println(BaseClass.getProperty("passWord"));
	}
	
	@After
	public void afterMethod() {
		
		// close the window
		BaseClass.closeDriver();	
	}
}
