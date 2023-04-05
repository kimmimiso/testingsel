package weblocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangelogintest {

	public static void main(String[] args) throws InterruptedException {
		
		  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	        String userName = "Admin";
	        String passWord = "admin123";

	        WebDriver driver;

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get(url);

	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	        WebElement userNameBox = driver.findElement(By.xpath("//*[@name='username']"));
	        				// you can also do this way
	  //      WebElement userNameBoxa = driver.findElement(By.name("username"));
	        
	        WebElement passWordBox = driver.findElement(By.xpath("//*[@name='password']"));

	        WebElement loginButton = driver.findElement(By.xpath("//*[contains(@class,'login-button')]"));

	        userNameBox.clear();
	        userNameBox.sendKeys(userName);

	        passWordBox.clear();
	        passWordBox.sendKeys(passWord);

	        loginButton.click();
	        
		    Thread.sleep(3000);

	        driver.quit();
	        

	    }
	}
