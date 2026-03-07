package A1BasePage;

import A1BaseFlipcart.BaseFlip;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class F1 extends BaseFlip {

    public F2 searchForProduct() throws InterruptedException {
        WebDriverWait wai = new WebDriverWait(driver, Duration.ofSeconds(70));

        wai.until(ExpectedConditions.elementToBeClickable(By.className("b3wTlE")));

        WebElement serachBox = driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn25'])[1]"));

        serachBox.sendKeys("mobiles");
        serachBox.sendKeys(Keys.ENTER);
        return new F2();
    }






}
