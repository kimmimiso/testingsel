package tuesdayselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testout {

	public static void main(String[] args) {

		
		 String url;
	        WebDriver driver;
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        url = "https://www.youtube.com/";

	        driver.get(url);

	        url = "https://www.amazon.com/";

	        driver.get(url);

	        url = "https://www.apple.com/";

	        driver.get(url);

	        url = "https://www.bestbuy.com/";

	        driver.get(url);

	        url = "https://www.netflix.com/";
	        
	        driver.get(url);
	        
	        driver.navigate().back();
	        
	        driver.navigate().forward();
	        
	        driver.quit();
	}

}
