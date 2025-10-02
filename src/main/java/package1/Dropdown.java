package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.List;

public class Dropdown {

@Test
    public  void sample () {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.leafground.com/select.xhtml");

        WebElement Dropdown1 = driver.findElement(By.className("ui-selectonemenu"));

        Select dropdown = new Select(Dropdown1);

        WebElement firstSelectedOption = dropdown.getFirstSelectedOption();

        String text = firstSelectedOption.getText();

        System.out.println(text);

        List<WebElement> optionsw = dropdown.getOptions();

        for (int i=0; i<optionsw.size(); i++) {

            System.out.println("Options    " + optionsw.get(i).getText());
        }

        System.out.println("Options" + optionsw.get(1).getText());

        dropdown.selectByIndex(optionsw.size()-2);

        driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(.,'Playwright')]")));
        option.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement option2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(.,'PostMan')]")));
        option2.click();







    }
}

