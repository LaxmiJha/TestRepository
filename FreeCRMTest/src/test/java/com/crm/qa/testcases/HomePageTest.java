package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	public HomePageTest() {
		super();
	
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		testutil=new TestUtil();
		homePage= loginPage.login(Config.getProperty("username"), Config.getProperty("password"));
	}
	
/*	@Test(priority=1)
	public void verifyHomePageTitleTest() {
	String Title=homePage.verifyHomePageTitle();	
	Assert.assertEquals(Title,"CRMPRO","Home page title is not correct");
		}*/
	
	/*@Test(priority=2)
	public void verifyCorrectUserNameTest() {
		//testutil.switchToFrame("mainpanel");
		driver.switchTo().frame("mainpanel");		
		Assert.assertTrue(homePage.verifyUserLabel());
	}*/
	
	@Test(priority=2)
	public void clickOnContactsLinkTest() {
		testutil.switchToFrame("mainpanel");
		contactsPage=homePage.clickOnContacts();
		
	}
	
	@Test(priority=3)
	public void clickOnDealsLinkTest() {
		testutil.switchToFrame("mainpanel");
		dealsPage=homePage.clickOnDeals();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
