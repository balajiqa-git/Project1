package A1BaseTest;

import A1BaseFlipcart.BaseFlip;
import A1BasePage.F1;
import org.testng.annotations.Test;

public class TestCLASS extends BaseFlip {
    @Test
    public void login() throws InterruptedException {

        F1 f1 = new F1();
        f1.searchForProduct().filter();
    }

}
