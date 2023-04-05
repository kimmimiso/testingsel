package FiftyOneTestCases;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccount_LoginTestCases {
	
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
	public void loginWithValidUsernameAndPassword() throws InterruptedException {	
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
		
    
        driver.close();

	}
	@Ignore
	@Test
	public void loginWithIncorrectUsernameAndIncorrectPassword() throws InterruptedException {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);

	// 4) Enter incorrect username in username textbox
		 String userName = "catmeow12@gmail.com";

	        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	        userNameBox.clear();
	        userNameBox.sendKeys(userName);
	        
	// 5) Enter incorrect password in password textbox.
	        String passWord = "Helloworld123";
	        
	        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	        passWordBox.clear();
	        passWordBox.sendKeys(passWord);
	        
	// 6) Click on login button
	        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
	        loginButton.click();
	        
	// 7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	        
	        Thread.sleep(3000);
	        
	        driver.close();
	}
	@Ignore
	@Test
	public void loginWithCorrectUsernameAndEmptyPassword() throws InterruptedException {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter valid username in username textbox
		String userName = "mildly1995@hotmail.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
	//	5) Now enter empty password in the password textbox
        String passWord = "";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
	//	6) Click on login button.
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
        
	//	7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
        
        driver.close();
	}
	@Ignore
	@Test
	public void loginWithEmptyUsernameAndValidPassword() throws InterruptedException {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
		//	4) Enter empty username in username textbox
		String userName = "";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
		//	5) Now enter valid password in the password textbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
		//	6) Click on login button.
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
        
		//	7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
        
        driver.close();
	}
	@Ignore
	@Test
	public void loginPasswordShouldBeMasked() throws InterruptedException {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
	//	4) Enter the password field with some characters.
		String passWord = "->-";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
	//	5) The password field should display the characters in asterisks or bullets 
        //such that the password is not visible on the screen
        
        driver.close();
	}
	@Ignore
	@Test
	public void loginHandlesCaseSensitive() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
		//	4) Enter the case changed username in username textbox
		String userName = "MILDLY1995@HOTMAIL.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
        
		//	5) Enter the case chenged password in the password tetxbox
        String passWord = "KIMMIMISO123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
		//	6) Now click on login button
        
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
		//	7) Login must fail saying incorrect username/password.
        
        driver.close();

		
	}
	@Test
	public void loginAuthentication() {
		String url;
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		url = "https://practice.automationtesting.in/my-account/";
		driver.get(url);
		
		//	4) Enter the case changed username in username textbox
		String userName = "mildly1995@hotmail.com";

        WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userNameBox.clear();
        userNameBox.sendKeys(userName);
		
		//	5) Enter the case chenged password in the password tetxbox
        String passWord = "kimmimiso123";
        
        WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWordBox.clear();
        passWordBox.sendKeys(passWord);
        
		//	6) Now click on login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
        loginButton.click();
        
		//	7) Once your are logged in, sign out of the site
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a"));
        logoutButton.click();
		//	8) Now press back button
        
       // driver.navigate().back();
        
        url = "https://practice.automationtesting.in/";
    	driver.navigate().to(url);

		//	9) User shouldn’t be signed in to his account rather a general webpage must be visible
    	
        driver.close();
	}
	
	
	

}
