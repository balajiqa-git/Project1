package a1Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Base1 {

    public static ChromeDriver driver;

    //public static void main(String[] args) {

    @BeforeSuite
    public void preCondtion() {
      /*  Scanner sc = new Scanner(System.in);

        String driverName = sc.nextLine();

        sc.close();

        if (driverName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        } else if (driverName.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {

            driver = new EdgeDriver();
        } */
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://orgfarm-b2997a6491-dev-ed.develop.my.salesforce.com/");


    }

    @AfterSuite
        public void postCondtion() {

        try {
            Thread.sleep(200);
        }catch (InterruptedException e){

            System.out.println(e.getMessage());
        }

        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();

        }
        /*
        https://orgfarm-b2997a6491-dev-ed.develop.my.salesforce.com/

        balaji.qa2404336@agentforce.com

        Balaji@2404
         */

    }


