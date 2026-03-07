package A1BaseFlipcart;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseFlip {

    public static ChromeDriver driver;

    @BeforeSuite
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.flipkart.com/");


    }

  //  @AfterSuite
   // public void closeBrowser() {
     //   driver.quit();
    //}

}
