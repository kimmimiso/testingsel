package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicOptionsTesting {

	  WebDriver driver;
	    Select select;

	    @Before
	    public void openBrowser() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.makemytrip.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    }
	    
	    @Test
	    public void dynamicDropDown() {
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        // driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iad");

	        wait.until(ExpectedConditions
	                .textToBePresentInElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0")), "IAD"));

	        driver.findElement(By.xpath("")).sendKeys("hello", Keys.ENTER); // telling it to click enters
	    }
}
