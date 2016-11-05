/**
 *   File Name: EbayTest.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 2, 2016
 *
 */

package com.sqa.lg.multi;

import org.testng.annotations.*;

import com.sqa.lg.*;

/**
 * EbayTest //ADDD (description of class)
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
public class EbayTest extends BasicAutoTest {

	/**
	 * @param baseURL
	 */
	public EbayTest() {
		super("http://ebay.com");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testWatchedItem() throws InterruptedException {
		getLog().info("Sleep at Ebay for 5 Seconds");
		Thread.sleep(5000);
		takeScreenshot("Watching Pictures");

	}

}
