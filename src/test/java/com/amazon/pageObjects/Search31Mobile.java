package com.amazon.pageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search31Mobile {


WebDriver localDriver;

public  Search31Mobile(WebDriver remoteDriver)
{
	localDriver = remoteDriver;
	
	PageFactory.initElements(remoteDriver, this);


}



@FindBy(xpath = "//*[@id='nav-xshop']/a[contains(text(),'Mobiles')]")
WebElement clickMobile;

@FindBy(xpath="//*[@id='twotabsearchtextbox']")
WebElement searchMobile;


@FindBy(xpath="//*[@id='nav-search-submit-text']/input")
WebElement clickSearch;

@FindBy(xpath="//img[@data-image-index='2']")
WebElement getMobile;

@FindBy(xpath="//span[@id='productTitle']")
WebElement getProductName;

@FindBy(xpath="//*[@id='priceblock_ourprice']")
WebElement getPrice;



public void clickMobiletab()
{
	System.out.println(localDriver.getTitle());
	clickMobile.click();
	
}

public void searchMobilePhone(String mobile)
{
	searchMobile.sendKeys(mobile);
}

public void clickSearchButton()
{
	clickSearch.click();
}
public void getMobileDetails()
{
	getMobile.click();
	System.out.println(localDriver.getTitle());


}

public void switchwindow() throws Exception 
{
	//Samsung Galaxy M31 Prime Edition (Ocean Blue, 6GB RAM, 128GB Storage): Amazon.in: Electronics

Set<String> wins = localDriver.getWindowHandles();

String childwin = null;

for(String win:wins)
{
	

if(childwin=="parentwin")
{
	localDriver.switchTo().window(win);
	break;
}
if(childwin==null)
{
	childwin="parentwin";
}


}

	System.out.println(localDriver.getTitle());
	
	System.out.println(getProductName.getText());
	
	System.out.println(getPrice.getText());
}


}
