package com.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeal {
 
	WebDriver localDriver;
	
	public TodaysDeal(WebDriver remoteDriver)
	{
		
		localDriver=remoteDriver;
		PageFactory.initElements(remoteDriver, this);
		
	
	}


	@FindBy(xpath="//div[@id='nav-xshop']/a[contains(text(),'Today')]")
	WebElement todaysDeal;
	


	public void clickTodaysDeals() {

		todaysDeal.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
