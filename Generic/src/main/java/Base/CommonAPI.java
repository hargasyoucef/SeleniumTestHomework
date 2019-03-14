package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;
    @Parameters({"url"})
   @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Youcef\\IdeaProjects\\webAutomationJanuary2019\\Generic\\driver\\chromedriver.exe ");
       driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
     }
     @AfterMethod
     public void closeUp(){
       driver.close();
     }
     public void typeOnId(String locator){
        driver.findElement(By.id(locator)).sendKeys("books", Keys.ENTER);
     }
    public void typeOnCSS(String locator){
        driver.findElement(By.cssSelector(locator)).sendKeys("books", Keys.ENTER);
    }
    public void typeOnWebElement(String locator , String value) {
//        try {
//            driver.findElement(By.cssSelector(locator)).sendKeys("books", Keys.ENTER);
//        } catch(Exception Ex) {
//            System.out.println("Tried with CSS, did not work. will try by ID now: ");
//            driver.findElement(By.id(locator)).sendKeys("books", Keys.ENTER);
//
//        }

        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception Ex1) {
            System.out.println("Id Locator did not work ");
        }
        try {
            driver.findElement(By.name(locator)).sendKeys("books", Keys.ENTER);
        } catch (Exception ex2){
            System.out.println("Name Locator did not work");
        }
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch(Exception ex3){
            System.out.println("CSS locator did not work");
        }
    }

    public String getCurrentPageUrl() {
        String urls = driver.getCurrentUrl();
        return urls;
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

 }

