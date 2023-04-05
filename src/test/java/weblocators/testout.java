package weblocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testout {

	public static void main(String[] args) throws InterruptedException {
		
		// another example using google.com search bar
		
		// class="gLFyf"

		String url = "https://www.google.com//";

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get(url);
	    
	    WebElement searchBox = driver.findElement(By.className("gLFyf"));
	    
	    Thread.sleep(3000);

	    searchBox.clear();

	    searchBox.sendKeys("Hello Kitty");
	    
	   // class="gNO89b"
	    
	    WebElement searchButton = driver.findElement(By.className("gNO89b"));

	    searchButton.click();

	    driver.quit();

		
	}

}
