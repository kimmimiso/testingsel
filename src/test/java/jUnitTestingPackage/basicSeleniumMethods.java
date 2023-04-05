package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicSeleniumMethods {
	
	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize(); 
	}
	
	@Test
	public void testingWebApplication() {
		//gets the title of the page
		String title = driver.getTitle();
		
		//current URL
		String currentURL = driver.getCurrentUrl();
		
		//html dom
		String pageSource = driver.getPageSource();
		
		System.out.println("The title of the page is --> " + title);
		
		System.out.println("The current URL of the page is --> " + currentURL);
		
	//	System.out.println("the page source --> " + pageSource);
	}
	
	@After
	public void afterMethod() {
		driver.close();
	}
	
	
}
