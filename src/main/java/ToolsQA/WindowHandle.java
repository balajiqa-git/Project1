package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandle {

    public static void main ( String[] args){


       ChromeDriver driver = new ChromeDriver();

       driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01vhnnmejutm1c1l4op7hadcz9718505571.node0");

       String parent = driver.getWindowHandle();

       driver.findElement(By.xpath("//span[text()='Open']")).click();

       Set<String> handles = driver.getWindowHandles();

       List<String> handleList = new ArrayList<>(handles);

       System.out.println("List" + handleList.size());

        driver.switchTo().window(handleList.get(1));
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(handleList.get(0));
        System.out.println(driver.getCurrentUrl());



        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());

                System.out.println(driver.getCurrentUrl());

                driver.switchTo().window(parent);
                System.out.println(driver.getTitle());

            }
        }


    }

}
