package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement UserNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement Deals;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement Tasks;
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserLabel() {
		return UserNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContacts() {
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		Deals.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasks() {
		Tasks.click();
		return new TasksPage();
	}
	}

