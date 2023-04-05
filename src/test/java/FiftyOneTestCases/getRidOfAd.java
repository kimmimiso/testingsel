package FiftyOneTestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getRidOfAd {

	
	WebDriver driver;

	@Before
	public void BeforeMethod() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://practice.automationtesting.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath(""));
		
	}
	
}
