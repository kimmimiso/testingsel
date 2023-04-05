package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountTestCases {

	WebDriver driver;

	@Before
	public void BeforeMethod() throws InterruptedException {
	//	1) Open the browser
	//	2) Enter the URL “http://practice.automationtesting.in/”
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://practice.automationtesting.in/");
	    driver.manage().window().maximize();       
	 // 3) Click on My Account Menu
	 		driver.findElement(By.id("menu-item-50")).click();
	 		
	        Thread.sleep(3000);   
	        
	        driver.close();
	}
	
	@Test
	public void myAccountsDashboard() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter registered username in username textbox
		String userName = "mildly1995@hotmail.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
	//	5) Enter password in password textbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
	//	6) Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
        
	//	7) User must successfully login to the web page
        
	//	8) Click on Myaccount link which leads to Dashboard
        WebElement dashboardButton = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a"));
        dashboardButton.click();
        
	//	9) User must view Dashboard of the site
        driver.close();

	}
}
