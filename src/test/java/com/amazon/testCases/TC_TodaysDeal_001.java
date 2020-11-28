package com.amazon.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.amazon.pageObjects.TodaysDeal;

public class TC_TodaysDeal_001 extends BaseClass{

	
	@Test
	public void clickToTodaysDeal()
	{
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TodaysDeal td = new TodaysDeal(driver);
		
		System.out.println(driver.getTitle());
		
		td.clickTodaysDeals();
		
		System.out.println(driver.getTitle());

	}

}
