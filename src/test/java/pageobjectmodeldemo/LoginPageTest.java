package pageobjectmodeldemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vivek.testbase.TestBase;

public class LoginPageTest extends TestBase {

    LoginPage lp;

    @Test
    public void loginTest() {

        // Create object of LoginPage
        lp = new LoginPage(driver);

        // Use data from TestBase
        lp.enterUserName(username);
        lp.enterPassword(password);
        lp.clickOnLoginBtn();

        // Capture actual result
        String actualText = lp.getProductsText();

        System.out.println("Actual text after login: " + actualText);

        // Assertion
        Assert.assertEquals(actualText, expectedTxt, "Login failed or text mismatch");
    }
}