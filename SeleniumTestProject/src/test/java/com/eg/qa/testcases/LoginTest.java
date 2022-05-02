package com.eg.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eg.qa.base.TestBase;
import com.eg.qa.pages.HomePage;
import com.eg.qa.pages.LoginPage;
import com.eg.qa.util.TestUtils;

public class LoginTest extends TestBase {
    LoginPage loginpage;
    HomePage homepage;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	
	
	@Test
	public void amazon_login() throws InterruptedException {
		loginpage.clickonhellosignup();
		//loginpage.clickonsignup();
		//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICTLY_WAIT, TimeUnit.SECONDS);
	homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 

		}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
