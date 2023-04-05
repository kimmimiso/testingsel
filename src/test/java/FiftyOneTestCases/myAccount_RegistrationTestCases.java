package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccount_RegistrationTestCases {
	
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
	@Ignore
	@Test
	public void registrationSignin() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter registered Email Address in Email-Address textbox
		String userName = "mildly1995@hotmail.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
	//	5) Enter your own password in password textbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);

	//	6) Click on Register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        registerButton.click();
        
	//	7) User will be registered successfully and will be navigated to the Home page
        driver.close();
	}
	@Ignore
	@Test
	public void registrationWithInvalidEmailId(){
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter invalid Email Address in Email-Address textbox
		String userName = "catmeow_23@cutemail";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
	//	5) Enter your own password in password textbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
	//	6) Click on Register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        registerButton.click();
        
	//	7) Registration must fail with a warning message(ie You must enter a valid email address
        driver.close();
	}
	@Ignore
	@Test
	public void registrationWithEmptyEmailId() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
		//	4) Enter empty Email Address in Email-Address textbox
		String userName = "";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
		//	5) Enter your own password in password textbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
		//	6) Click on Register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        registerButton.click();
        
		//	7) Registration must fail with a warning message(ie please provide valid email address)
        driver.close();
	}
	@Ignore
	@Test
	public void registrationWithEmptyPassword() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter valid Email Address in Email-Address textbox
		String userName = "mildly1995@hotmail.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
	//	5) Enter empty password in password textbox
        String passWord = "";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
	//	6) Click on Register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        registerButton.click();
	//	7) Registration must fail with a warning message(ie please enter an account password)
        driver.close();
	}
	
	@Test
	public void registrationWithEmptyEmailIdAndPassword(){
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
		//	4) Enter empty Email Address in Email-Address textbox
		String userName = "";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
		//	5) Enter empty password in password textbox
        String passWord = "";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
		//	6) Click on Register button
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
        registerButton.click();
        
		//	7) Registration must fail with a warning message(ie please provide valid email address)
        driver.close();

	}
	
	
}
