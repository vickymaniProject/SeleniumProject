package com.amazon.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

	
	
public String baseURL="https://www.amazon.in/";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		logger = Logger.getLogger("Amazon");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

