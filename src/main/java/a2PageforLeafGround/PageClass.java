package a2PageforLeafGround;

import a2BaseforLeafGround.BaseClassforLeafGround;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PageClass extends BaseClassforLeafGround {

    public PageClass dropDownfavorite() {

        WebElement drop = driver.findElement(By.className("ui-selectonemenu"));

        Select select = new Select(drop);

        WebElement firstSelectedOption = select.getFirstSelectedOption();

        System.out.println("First option selected: " + firstSelectedOption.getText());

        List<WebElement> options = select.getOptions();

        for (int i = 0; i < options.size(); i++) {

            select.selectByIndex(options.size() - 1);
        }

        return this;

    }

}
