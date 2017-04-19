package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by MAX on 4/17/17.
 */
public class BaseTest {
   protected static WebDriver driver;

    @BeforeSuite
    public static void beforeSuite() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/luiza/Downloads/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--kiosk");
        driver = new ChromeDriver(chromeOptions);

        driver.manage().deleteAllCookies();

        driver.get("https://www.paxvapor.com/");
   }

   public void waitElToBeClicable(WebElement xp){
       WebDriverWait wait = new WebDriverWait(driver, 15);
       wait.until(ExpectedConditions.elementToBeClickable(xp));
   }

   @AfterSuite
    public static void afterSuite() {
       driver.quit();
   }
}
