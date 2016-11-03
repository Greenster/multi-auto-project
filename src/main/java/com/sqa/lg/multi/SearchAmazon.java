/**
 *   File Name: SearchAmazon.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Oct 28, 2016
 *
 */

package com.sqa.lg.multi;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

/**
 * SearchAmazon //ADDD (description of class)
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
public class SearchAmazon {
	private static WebDriver driver;

	private static final String inputsearchFld = null;

	@FindBy(className = "nav-input")
	WebElement searchBtn;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchFld;

	/**
	 * @param driver
	 */
	public SearchAmazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SelectItems search(String inputItems) {

		Select itemsDesired = new Select(this.searchFld);
		itemsDesired.selectByVisibleText(this.inputsearchFld);

		this.searchBtn.click();
		return new SelectItems(driver);
	}

}
