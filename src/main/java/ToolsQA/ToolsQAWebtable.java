package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToolsQAWebtable {

    public static void main (String[] args){

        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demoqa.com/webtables");

        String td = driver.findElement(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']//tbody/tr[2]/td[2]")).getText();

        System.out.println(td);
    }
}
