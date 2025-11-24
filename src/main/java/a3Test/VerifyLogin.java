package a3Test;

import a1Base.Base1;
import a2Page.LoginSalesforce;
import org.testng.annotations.Test;

public class VerifyLogin extends Base1 {

    @Test
    public void verifyLoginSalesforce() {
        LoginSalesforce lg = new LoginSalesforce();
        lg.userName().passWord().login();

    }
}
