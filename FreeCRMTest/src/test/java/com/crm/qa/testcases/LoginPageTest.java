package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String Title= loginPage.validatePageTitle();
		Assert.assertEquals(Title,"Free CRM software in the cloud powers sales and customer service");
	}
	
	@Test
	public void CRMLogoImageTest() {
		boolean flag=loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest(){
		homePage= loginPage.login(Config.getProperty("username"), Config.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
