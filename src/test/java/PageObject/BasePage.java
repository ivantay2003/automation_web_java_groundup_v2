/*
 * 	Copyright (c) 2018 Ivan Tay 
 * 
 * Base Page inheritance 
 * 
 */

package PageObject;

import Control.Common;//Common webdriver shared modules


import org.testng.Assert;



public class BasePage extends Common {
	

	public void validateCompareString(String expectedResult , String actualResult) {
		/*
		 * Compare strings and assert for result
		 */
		
		Assert.assertEquals(expectedResult, actualResult); //Compare actual and expected. Assert if false
		

	}
}
