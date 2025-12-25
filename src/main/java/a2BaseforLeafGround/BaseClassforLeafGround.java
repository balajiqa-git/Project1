package a2BaseforLeafGround;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseClassforLeafGround {

    public static ChromeDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.leafground.com/select.xhtml");
    }

    @AfterSuite
    public void afterSuite() throws InterruptedException {

        Thread.sleep(100);
        driver.quit();
    }

}
