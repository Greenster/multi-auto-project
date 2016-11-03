/**
 *   File Name: AmazonLogin.java<br>
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

/**
 * AmazonLogin //ADDD (description of class)
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
public class AmazonLogin {

	private static WebDriver driver;

	@FindBy(id = "ap_email")
	private WebElement signInFld;

	@FindBy(id = "nav-flyout-ya-newCust")
	private WebElement signInNav;

	@FindBy(id = "ap_password")
	private WebElement signInPasswordFld;

	@FindBy(id = "signInSubmit")
	private WebElement submitBtn;

	public AmazonLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchAmazon login(String ap_email, String ap_password) {
		this.signInFld.clear();
		this.signInFld.sendKeys(ap_email);
		this.signInPasswordFld.clear();
		this.signInPasswordFld.sendKeys(ap_password);
		this.submitBtn.click();
		return new SearchAmazon(driver);
	}

}
