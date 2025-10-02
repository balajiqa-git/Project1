package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbox {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.leafground.com/input.xhtml");

        driver.findElement(By.id("j_idt88:name")).sendKeys("Balaji");

        WebElement element = driver.findElement(By.id("j_idt88:j_idt91"));//

        System.out.println(element.getAttribute("value"));

        element.clear();

        element.sendKeys("Theni");

        WebElement element1 = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));

        if (!element1.isEnabled()) {
            System.out.println("The element is disabled");
        } else {
            System.out.println("The element is enabled");
        }





    }






}
