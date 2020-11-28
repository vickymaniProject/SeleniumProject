package com.amazon.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.amazon.pageObjects.Search31Mobile;

public class TC_SearchM31_002 extends BaseClass {

	public String mobile = "Samsung m31 mobile";

	@Test
	public void searchMobile() throws Exception {

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Amazon url opened");
		Search31Mobile sam = new Search31Mobile(driver);

		sam.clickMobiletab();
		logger.info("Clicked mobile link");

		sam.searchMobilePhone(mobile);
		logger.info("Typing product name");

		sam.clickSearchButton();
		logger.info("clicked search");

		sam.getMobileDetails();
		logger.info("selected product");

		sam.switchwindow();
		logger.info("getting product name and price");

	}

}
