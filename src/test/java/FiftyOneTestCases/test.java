package FiftyOneTestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
public static void main(String[] args) throws InterruptedException {
	
	String url = "https://practice.automationtesting.in/my-account/";
    String userName = "mildly1995@hotmail.com";
    String passWord = "kimmimiso123";

    WebDriver driver;

    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get(url);

    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    WebElement userNameBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
    				// you can also do this way
//      WebElement userNameBoxa = driver.findElement(By.name("username"));
    
    WebElement passWordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));

    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));

    userNameBox.clear();
    userNameBox.sendKeys(userName);

    passWordBox.clear();
    passWordBox.sendKeys(passWord);

    loginButton.click();
    
    Thread.sleep(3000);
    
    driver.quit();
	
}
}
