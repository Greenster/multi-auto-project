package com.sqa.lg.multi;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BasicTest {

	private static String baseURL;
	private static WebDriver driver;

	/**
	 * @return the baseURL
	 */
	public static String getBaseURL() {
		return baseURL;
	}

	/**
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}

	public BasicTest(String baseURL) {
		this.driver = driver;
		this.baseURL = baseURL;
	}

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

}
