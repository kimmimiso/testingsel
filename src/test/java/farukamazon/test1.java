package farukamazon;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);    
        wait = new WebDriverWait(driver, 30);
    }
    
    

    @Test
    public void searchBoxTest() {
        // twotabsearchtextbox

        WebElement searchBox = driver.findElement(By.xpath("//*[contains(@id,'searchtextbox')]"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

//        wait.until(ExpectedConditions.visibilityOf(searchBox));
//
//        searchBox.clear();
//        searchBox.sendKeys("laptop");
//        searchButton.click();

        if (wait.until(ExpectedConditions.visibilityOf(searchBox)) != null) {
            searchBox.clear();
            searchBox.sendKeys("laptop");
            searchButton.click();
        }
        
        String expectedTitle = "Amazon.com : laptop...";
        String actualTitle = driver.getTitle();
        
        Assert.assertEquals(expectedTitle, actualTitle);
        
        if(!(expectedTitle.equals(actualTitle))) {
        //    System.out.println("---Expected: " + expectedTitle + " +++Actual: " + actualTitle);
            
            Assert.assertFalse("Actual: "+actualTitle,false);
            
        }
        
        

    }

    @After
    public void afterMethod() {
        driver.quit();
    }

}
/*it has annotations that help us to write our tests and split some of the methods

@before
@test
@after


Test Annotation --> @Test 
Executes before the first test method is invoked in the current class --> @BeforeClass 

Executes after all the test methods in the current class --> @AfterClass


Executes before each test method --> @Before 
Executes after each test method     --> @After



annotation to ignore a test

@BeforeClass -- 
Method(){
    
    1. execute
}

@Before
Method(){
    2. execute
}

@Test1
Method(){
    
    

    tests.method  --
}

@Test2
Method(){
    
    

    tests.method  --
}
@Test3
Method(){
    
    

    tests.method  --
}
@After
Method(){
    
    4. execute
}


@AfterClass --
Method(){
    5. execute
}

 

Waits (Implicit and Explicit)



Assertion

assertEquals: 

assertequals method compares the expected result with that of the actual result. It throws an AssertionError if the expected result does not match with that of the actual result and terminates the program execution at assert equals method.

Syntax

public static void assertEquals(String expected, String actual)


assertTrue: 

asserttrue method asserts that a specified condition is true.

It takes in two parameters i.e. one is the message and the other is the condition against which the assertion needs to be applied. It throws an AssertionError if the condition passed to the asserttrue method is not satisfied.

public static void assertTrue(java.lang.String message, boolean condition)


Syntax:
public static void assertTrue(java.lang.String message, boolean condition)

message – Message to be displayed in case of an Assertion Error.
condition – Condition against which the assertion needs to be applied.

Example:

Assert.assertTrue(“Assert True test message”, true);



assertFalse
assert false method asserts that a specified condition is false.

It takes in two parameters, i.e. one is the message and the other is the condition against which the assertion needs to be applied. It throws an AssertionError if the condition passed to the assertfalse method is not satisfied.

Syntax:

public static void assertFalse(java.lang.String message, boolean condition)
message – Message to be displayed in case of an Assertion Error.
condition – Condition against which the assertion needs to be applied.

Example:

Assert.assertFalse(“Assert false test message” false);

Xpaths 
*/


