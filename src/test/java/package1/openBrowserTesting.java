package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowserTesting {

	public static void main(String[] args) {

		//declared and initialized webdriver to chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/kimberlysristienvong/Desktop/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();
        

        String url = "https://www.techcircleschool.com/";
        driver.get(url);
        
        
        // for window user
        // \\Users\\kimberlysristienvong\\Desktop\\chromedriver_mac_arm64\\chromedriver.exe"
    }
	}


