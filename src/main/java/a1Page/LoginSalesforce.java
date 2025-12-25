package a1Page;

import a1Base.Base1;
import org.openqa.selenium.By;

public class LoginSalesforce extends Base1 {


    public LoginSalesforce userName() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("balaji.qa2404336@agentforce.com");
       return this;
    }

    public LoginSalesforce passWord() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Balaji@2404");
       return this;
    }

    public LoginSalesforce rememberMe() {

        driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
        return this;
    }

    public LoginSalesforce login() {
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        return this;
    }

}
