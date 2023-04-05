package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class targettestcase {
	
	WebDriver driver;

	@Before
	public void BeforeMethod() {
	//	1) Open the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.target.com/");
	    driver.manage().window().maximize(); 
	}
	

}
