/**
 *   File Name: AutoBasics.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 2, 2016
 *
 */

package com.sqa.lg.helpers;

import java.io.*;

import org.apache.commons.io.*;
import org.apache.log4j.*;
import org.openqa.selenium.*;

/**
 * AutoBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Green, Lorne
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AutoBasics {
	public static final String DEFAULT_SCREENSHOT_FILENAME = "screenshots/";
	public static final String DEFAULT_SCREENSHOT_SAVE_LOCATION = "screenshot/";
	public static final String FILE_EXTENSION = ".jpg";

	public static boolean takeScreenshot(WebDriver driver) {
		return takeScreenshot(driver, DEFAULT_SCREENSHOT_FILENAME, DEFAULT_SCREENSHOT_SAVE_LOCATION, null);
	}

	public static boolean takeScreenshot(WebDriver driver, String location, String filename) {
		return takeScreenshot(driver, location, filename, null);
	}

	public static boolean takeScreenshot(WebDriver driver, String location, String filename, Logger logger) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(location + filename + FILE_EXTENSION));
		} catch (IOException e) {
			if (logger != null) {
				logger.error("failed to save screenshot at " + location + filename + FILE_EXTENSION);
			}
			return false;
		}
		return true;
	}

}
