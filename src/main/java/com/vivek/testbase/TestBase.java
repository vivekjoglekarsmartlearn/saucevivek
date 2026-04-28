package com.vivek.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.vivek.testutil.TestUtil;

public class TestBase {  //  parent Class OR Super class OR main class
	public static  WebDriver  driver=null;
	public static  String  baseURL, username ,password,expectedTxt; 	
	@BeforeTest// execute before test	
	public void seup()  {
		baseURL="https://www.saucedemo.com/";
		username="standard_user";
		password="secret_sauce";
			expectedTxt="Products";
			// Step 1 open firefox browser
			driver= new FirefoxDriver();
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGELOADTIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICITWAITTIMEOUT));
			
	}
	@AfterTest//  execute ONCE after all test	
	public void tearDown()
	{
		
	driver.quit();
		
		
		
		
	}

	
}
