package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageFile {
public static  WebDriver  driver;
// Step 1 create  web elements OR Ui element OR Page Factory  OR Object Repository
By username=By.xpath("//input[@id=\"user-name\"]");//  driver.findElement(By.xpath(""))
By password=By.xpath("//input[@id=\"password\"]");
By loginBtn=By.xpath("//input[@id=\"login-button\"]");

// Step 2 create constrcture of current class
public LoginPageFile(WebDriver  d) {
	driver=d;
}
// Step 3 create actions across. methods
public void enterUsername(String uname)
{
	//driver.findElement(By.xpath("")).sendKeys(uname);
	driver.findElement(username).sendKeys(uname);
}
public void enterPassword(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
}	
public void clickOnLogonBtn()
{
	driver.findElement(loginBtn).click();
}



	
	
}
