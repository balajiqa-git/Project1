package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {


    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver;

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0esk8o55knggo1mz1js8ovxiua6807019.node0");

        Thread.sleep(100);

        driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();

        org.openqa.selenium.Alert alert1 = driver.switchTo().alert();

        Thread.sleep(1000);

        alert1.accept();

        Thread.sleep(100);

        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();

        Thread.sleep(1000);

        alert2.dismiss();

        Thread.sleep(5000);

        driver.quit();



    }


}
