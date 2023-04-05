package weblocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findlocators {

	public static void main(String[] args) throws InterruptedException {
		// we got this from amazon inspect
	//	id="twotabsearchtextbox" --> Amazon search Box element
		
		String url;
		url = "https://www.amazon.com/";

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // this give the page the load time
	    driver.manage().window().maximize(); // this give the page a full screen once open

	    driver.get(url);
	    
	    // you can write it this way but it's not a good way to do it, looks ugly
//  driver.findElement(By.className("twotabsearchtextbox")).clear();;
//	driver.findElement(By.className("twotabsearchtextbox")).sendKeys(args);
	    
	    
	    // in order to find the single element we have to use the findElement method from driver and declare
	    //the attribute type using By.id/ By.className etc. and passing the element value from the UI
	    // amazon element is id so we use By.id();
	    //however in somewebsite like google they use class for search bar so you have to use By.className();
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    
	    // this method will keep the screen open longer
	    Thread.sleep(3000);
	    
	    // this method will clear the search box, just incase if there is any value
	    searchBox.clear();
	    
	    String product = "laptop";
	    
	    // this method will sendKeys (write some values in the box)
	    searchBox.sendKeys("laptop");
	    
	    // id = new-search-submit-button --> seachButton on Amazon
	    WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	    
	    // this method will allow the mouse to click on the search box
	    searchButton.click();
	    
	    Thread.sleep(3000);
	    
	    // How to get the title of the word you type in search bar
	    if(driver.getTitle().equals("Amazon.com : " +product)) {
            System.out.println("You are searching the right product: "+product);
        }else {
            System.out.println("You are searching something else and the title: " + driver.getTitle());
        }
	    
	    driver.quit();
	}

}
