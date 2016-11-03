package com.sqa.lg.multi;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

public class AmazonTC101 {

	private static String baseURL = "http://www.amazon.com";
	private static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Set WebDriver static instance using FireFox
		driver = new FirefoxDriver();
		// Maximize Window
		driver.manage().window().maximize();
		// Allow fullscreen
		// driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// go to base URL
		driver.get(baseURL);
	}

	@AfterMethod
	public void tearDown() {
		// Close driver and exit all windows
		driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException {
		String actualPageTitle;
		String expectedPageTitle = "AdactIn.com - Search Hotel";
		AmazonLogin homePage = new AmazonLogin(driver);
		// Locate elements based on id's
		homePage.login("Greening", "Coritha");
		// Set actual Page Title
		actualPageTitle = driver.getTitle();
		// Assert that I am on the current page
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

	}

}
