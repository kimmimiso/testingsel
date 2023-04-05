package basicSeleniumTests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxesTesting {

	WebDriver driver;

	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/checkboxes");
	    driver.manage().window().maximize(); 
	}
	
	@Test
	public void test1() {
	 WebElement checkBox1 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
	 WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));

     
     Boolean isTrueOrFALSE = checkBox1.isSelected();
     
     WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
     Boolean isTrue = checkBox1.isSelected();
     
     if(isTrue) {
         System.out.println("It is selected");
     } else {
         driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
     }
     
     if(isTrue) {
         System.out.println("It is selected");
     } else {
         driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
     }
 }

	
	@Test
	public void test2() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//xpath")))).click();
	}
}
