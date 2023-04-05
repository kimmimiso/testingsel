package tuesdayselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {
	
	public static void main(String[] args) {
		
	String url;
		
	WebDriver driver;
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	// this will make browser full screen, we want to make sure everything is in it's full size
	driver.manage().window().maximize();
	
	/*
	 Open google.com
	 */
	url = "https://www.google.com/";
	
	// this will navigate you to the url you have passed
	driver.get(url);
	
	// driver.getTitle(); --> this will return you the title of the page
	System.out.println(driver.getTitle());
	String title = driver.getTitle();
	String expectedTitle = "Google";
	
	String currentUrl = driver.getCurrentUrl();
	
	// driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
	
	if (title.equals(expectedTitle) && currentUrl.equals(url)) {
		System.out.println("We are in " + url);
	}else {
		System.out.println("You are in different page: " + driver.getCurrentUrl());
		}
	
		// This will navigate you to url you have pass, it is different than the driver.get !!!
		// run the code and it will land on google.com and then pass over to amazon.com	
		
	url = "https://www.amazon.com/";
	driver.navigate().to(url);
			/*
			 you can also write navigation this way
			 *
	 driver.navigate().to("https://www.amazon.com/");
			 *
			 */	
		
		if (currentUrl.equals(url)) {
			System.out.println("We are in " + url);
		}else {
			System.out.println("You are in different page: " + driver.getCurrentUrl());
			}
	
	// what happens if we want to go back to google.com
		// this will navigate back to your previous page
	driver.navigate().back();
		
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("We are in " + url);
		}else {
			System.out.println("You are in different page: " + driver.getCurrentUrl());
		}
		
		// this will navigate me back to forward page, which in this case is amazon.com
	driver.navigate().forward();
	
	// this will close the webpage for you
	driver.quit();
		
	}
}
