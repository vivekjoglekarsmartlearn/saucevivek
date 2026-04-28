package pageobjectmodeldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    // ✅ FIXED locator
    By productsText = By.className("title");  
    // (Better than XPath)

    // Actions
    public void enterUserName(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public String getProductsText() {
        return driver.findElement(productsText).getText();
    }
}