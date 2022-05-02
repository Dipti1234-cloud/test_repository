package com.eg.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eg.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page Factory - object repository
	 @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	 WebElement hello_sign;
	//span[@id='nav-link-accountList-nav-line-1']
	
	 @FindBy(xpath="//*[@id=\"nav-signin-tooltip\"]/a/span")
     WebElement signin;
	
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_btn;
    
	@FindBy(xpath="//input[@id='ap_password']")
    WebElement password;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	WebElement sign_btn;

	// initilise page element
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	//Action
		
	public void clickonhellosignup() {
		
		 hello_sign.click();
	}
	
	public void clickonsignup() throws InterruptedException {
		Thread.sleep(5000);
		//Actions action= new Actions(driver);
		//action.moveToElement(hello_sign).build().perform();
		signin.click();
		
	}
		
	public HomePage login(String un, String pwd) {
         email.sendKeys(un);
         continue_btn.click();
        
         password.sendKeys(pwd);
         sign_btn.click();
         return new HomePage();
	}
}
