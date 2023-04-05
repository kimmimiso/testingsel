package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertTestingExamples {

	 WebDriver driver;
	    Select select;

	    @Before
	    public void openBrowser() {

	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    }
	    @Ignore
	    @Test
	    public void firstAlert() {
	        
	        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]")).click();
	        
	        String jsText = driver.switchTo().alert().getText();
	        
	        System.out.println(jsText);
	        
	        driver.switchTo().alert().accept();
	        
	    }
	    @Ignore
	    @Test
	    public void secondAlert() {
	    	driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]")).click();
	        
	        String jsConfirm = driver.switchTo().alert().getText();
	        
	        System.out.println(jsConfirm);
	        
	        driver.switchTo().alert().accept();
	    }
	    
	    @Test
	    public void thirdAlert() {
	    	//pressing the alert button )bliuebutton)
	    	driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Prompt')]")).click();
	        
	    	//getting the text of the alert box and printing it out
	        String jsPrompt = driver.switchTo().alert().getText();
	        System.out.println(jsPrompt);
	        
	        //sending string word to the alert box and accepting the alert
	        String sendingString = "Happy Valentine's Day";
	        driver.switchTo().alert().sendKeys(sendingString); 
	        driver.switchTo().alert().accept();
	        
	        WebElement actualPrint = driver.findElement(By.xpath("//*[@id='result']"));
	                       // or you can write like this 
	    //    String actualResultOnthePage=  driver.findElement(By.xpath("//*[@id='result']")).getText();
	        
	        //String expectedPrint = "You entered: "Happy Valentine's Day";
	        Assert.assertTrue(actualPrint.getText().contains(sendingString));
	    }
}
