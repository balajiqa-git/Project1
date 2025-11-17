package A1Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Scanner;

public class Base1 {

    public static RemoteWebDriver driver;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String driverName = sc.nextLine();

        if (driverName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        } else

        {
            driver = new FirefoxDriver();
        }

        driver.get("https://www.google.com");

    }
}
