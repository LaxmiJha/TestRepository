package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory:- OR
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//button[contains(),'Sign Up']")
	WebElement SignUp;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement Logo;
	
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return Logo.isDisplayed();
	}
	
	public HomePage login(String un, String Passwd) {
		username.sendKeys(un);
		password.sendKeys(Passwd);
		LoginBtn.click();
		return new HomePage();
	}
}
