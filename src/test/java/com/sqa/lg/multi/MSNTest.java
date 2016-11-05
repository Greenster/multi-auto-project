/**
 *   File Name: MSNTest.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 3, 2016
 *
 */

package com.sqa.lg.multi;

import org.testng.annotations.*;

import com.sqa.lg.*;

/**
 * MSNTest //ADDD (description of class)
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
public class MSNTest extends BasicAutoTest {
	/**
	 * @param baseURL
	 */
	public MSNTest() {
		super("http://msn.com");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testWatchedItem() throws InterruptedException {
		getLog().info("Sleep at Ebay for 5 Seconds");
		Thread.sleep(5000);
		takeScreenshot("Watching Pictures");

	}
}
