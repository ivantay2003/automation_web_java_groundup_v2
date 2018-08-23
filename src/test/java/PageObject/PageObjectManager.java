/*
 * 	Copyright (c) 2018 Ivan Tay 
 *  Page Object Manager. Controls all the pages 
 *  
 */

package PageObject;



import Control.Configuration; //Project config
import Control.Common; // Common modules

public class PageObjectManager {

	
	//Page objects
	public static HomePage homePage ;
	public static CreateAccountPage createaccountPage;
	public static MyAccountPage myaccountPage;
	
	private static Configuration config ; //Configuration object
	private static Common common ; // Common extension selenium module
	
	public static void setInitializePageObjects (Configuration inputConfig){
		/*
		 * Create an instance of page objects , 
		 * Initialize all pages with configuration 
		 * Get the web drivers for common
		 */
		
		config = inputConfig;
		common = new Common (config.getWebDriver());
		homePage = new HomePage(config);
		createaccountPage = new CreateAccountPage (config);
		myaccountPage = new MyAccountPage (config);
		

	}
	
	public void launchLandingPage(){
		/*
		 * Landing page URL
		 */
		
		common.getLaunchURL(config.getWebDriver(), config.getURL());
	}
	
	public void scrollDown () {
		/*
		 * Scroll down the page
		 */
		
		common.scrollDown();
	}
	
	public void maximizeWindow (){
		/*
		 * Maximize browser size
		 */
		
		config.getWebDriver().manage().window().maximize();
	}
}
