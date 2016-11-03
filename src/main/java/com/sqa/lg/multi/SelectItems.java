/**
 *   File Name: SelectItems.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Oct 29, 2016
 *
 */

package com.sqa.lg.multi;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * SelectItems //ADDD (description of class)
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
public class SelectItems {
	private WebDriver driver;

	/**
	 * @param driver
	 */
	public SelectItems(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
