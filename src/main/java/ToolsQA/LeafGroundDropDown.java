package ToolsQA;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class LeafGroundDropDown {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node016qouemmwujv6c3rhp68zc2dd17573718.node0");

        WebElement drop = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));


        Select DD= new Select(drop);

        WebElement na = DD.getFirstSelectedOption();

        System.out.println(na.getText());

        List<WebElement> we = DD.getOptions();

        for(WebElement SE  : we){

            System.out.println(SE.getText());

        }

        DD.selectByVisibleText("Cypress");


    }

}
