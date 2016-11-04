/**
 *   File Name: LocatingElementsTest.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 3, 2016
 *
 */

package com.sqa.lg.locating;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

import com.sqa.lg.helpers.*;
import com.sqa.lg.multi.*;

/**
 * LocatingElementsTest //ADDD (description of class)
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
public class LocatingElementsTest extends BasicAutoTest {
	public LocatingElementsTest() {
		super("http://msn.com");
	}

	@Override
	public boolean takeScreenshot(String filename) {
		return AutoBasics.takeScreenshot(getDriver(), "msn-screenshots/", filename, getLog());
	}

	@Test(enabled = false)
	public void testLocatingOnMSNNews() {
		String location = ".news>a";
		try {
			WebElement element = getDriver().findElement(By.cssSelector(location));
		} catch (Exception e) {
			getLog().warn("Unable to locate element for news tile.");
			takeScreenshot("news-box-page-fail");
			Assert.fail();
		}
		getLog().warn("Successfully located element for news tile.");
		takeScreenshot("news-box-page-pass");
	}

	@Test(enabled = false)
	public void testLocatingOnMSNOld() {
		WebElement element = getDriver().findElement(By.cssSelector(".weatodaytile"));
		takeScreenshot("weather-box-page-pass");
	}

	@Test
	public void testLocatingOnMSNTV() {
		String location = ".title > a";
		try {
			WebElement element = getDriver().findElement(By.cssSelector(location));
		} catch (Exception e) {
			getLog().warn("Unable to locate element for TV program.");
			takeScreenshot("TV-box-page-fail");
			Assert.fail();
		}
		getLog().warn("Successfully located element for TV program.");
		takeScreenshot("TV-box-page-pass");
	}
}