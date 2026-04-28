package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vivek.testbase.TestBase;
import com.vivek.testutil.TestUtil;

public class LoginTestCase  extends  TestBase {
//	public static  WebDriver  driver;
public	LoginPageFile  loginPg;
//public static  String url, username, password, expectedTxt;
//@BeforeMethod// execute before test	
//public void seup()  {
//	
//		// Step 1 open firefox browser
//		driver= new FirefoxDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOADTIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITWAITTIMEOUT));
//		
//}
@Test(priority =1)
public void logintest()
{
	
	//  Create Object of  LoginPage class
	loginPg= new LoginPageFile(driver);
	loginPg.enterUsername(username);
	loginPg.enterPassword(password);
	loginPg.clickOnLogonBtn();
	//  fetch the products
	String actualTxt=driver.findElement(By.xpath("//span[@class=\"title\"]")).getText();
	System.out.println("  Actual text is ---->"+ actualTxt);
	
	Assert.assertEquals(actualTxt, expectedTxt,"text is not match");
	
}

//@AfterMethod//  exeucute after test		
//public void  tearDown() { 		
//		//quit browser
//		driver.quit();
//		
//}
//		

	}


