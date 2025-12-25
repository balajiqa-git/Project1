package a1Test;

import a1Base.Base1;
import a1Page.LoginSalesforce;
import org.testng.annotations.Test;

public class VerifyLogin extends Base1 {

    @Test
    public void verifyLoginSalesforce() {
        LoginSalesforce lg = new LoginSalesforce();
        lg.userName().passWord().login();

    }
}
