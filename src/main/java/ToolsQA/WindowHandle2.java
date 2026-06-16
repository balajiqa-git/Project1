package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandle2 {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.com");

        driver.navigate().to("https://www.leafground.com/window.xhtml;jsessionid=node01vhnnmejutm1c1l4op7hadcz9718505571.node0");


        String parent = driver.getWindowHandle();

        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

        Set<String> handles = driver.getWindowHandles();

        System.out.println("Handles: " + handles.size());

        for (String handle : handles) {
            if(!handle.equals(parent)) {

                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());


            }

        }
    }
}
