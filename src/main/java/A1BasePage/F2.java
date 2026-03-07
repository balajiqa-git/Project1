package A1BasePage;

import A1BaseFlipcart.BaseFlip;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class F2 extends BaseFlip{

    public F2 filter() {
        WebDriverWait   wa = new WebDriverWait(driver, Duration.ofSeconds(20));

        wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='MocAag']"))).sendKeys("Samsung"+ Keys.ENTER);

        wa.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ybaCDx'])[1]"))) .click();
        return this;
    }

    public F3 clickProduct(){

        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//div[text()='Samsung Galaxy F06 5G (Bahama Blue, 64 GB)']")).click();

        Set<String> windows = driver.getWindowHandles();

        // switch to new tab
        for(String win : windows){
            if(!win.equals(parent)){
                driver.switchTo().window(win);
            }
        }


        return new F3() ;
    }
}
