package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BookMyShow {

    public static void main(String[]args){

        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://in.bookmyshow.com/explore/home/madurai");

      // List<WebElement> dr = driver.findElements(By.xpath("//div[starts-with(text(),'Action')"));

        List<WebElement> dr = driver.findElements(
                By.xpath("//div[@class='sc-7o7nez-0 engTII']"));

        System.out.println(dr.size());

        for(int i = 0; i < dr.size(); i++){

            String name= dr.get(i).getText();

            if(name.startsWith("Action")){

                System.out.println(name);
            }

       }



    }
}
