package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Class1 {

public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    driver.get("https://www.facebook.com");

    driver.navigate().to("https://chatgpt.com/c/6900d8ab-1d94-8320-9ebe-4f69d192ac44");

    WebElement element = driver.findElement(By.xpath("//div[text()='What can I help with?\n']"));

    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));


    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='What can I help with?']")));







}

}
