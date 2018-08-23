/*
 * 	Copyright (c) 2018 Ivan Tay 
 * 
 * Scenario 1
 * Create account with new email
 * Fill in all mandatory field except mobile
 * Check that the new account is created
 * 
 */

package Testcase;

import org.testng.annotations.Test;

import BrowserDriver.BrowserType; //Type of browsers
import Control.Configuration; //Project configurations
import PageObject.PageObjectManager; //Page Object Manager


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Scenario1 extends PageObjectManager{


	 //Configuration object
	private Configuration config;
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  config = new Configuration();
	  
	  /*
	   * Select browser type - Firefox or Chrome
	   */
	  //config.setBrowser(BrowserType.FIREFOX);//Use Firefox driver
	  config.setBrowser(BrowserType.CHROME);//Use Chrome driver
	  
	  setInitializePageObjects (config); //Initialize all Page Objects Models with project configurations / web driver / user data
	  maximizeWindow();//Maximize Window
	  
  }
  
  	
 

  @AfterTest
  public void afterTest() {
	  /*
	   *Quit web driver  
	   */
	  config.quitDriver();//You can comment out to prevent browser from closing
	  
  }

  

  
  @Test
  private void start (){
	  
	  Scenario1();
	  
  }
  
  private void Scenario1() {
	  /*
	   * Start test case 1 
	   */

	  launchLandingPage();//Landing page URL
	  
	  /*
	   * Home Page
	   */
	  homePage.signIn(); //Sign in with new email address
	  
	  
	  /*
	   * Create Account
	   */
	  createaccountPage.genderTitle(); //Title
	  createaccountPage.customerNamePassword(); //Customer first name , last name and password
	  
	  scrollDown();//Scroll down page
	  
	  createaccountPage.birthday(); //Select dropdown for birthday - day / month / year
	  createaccountPage.address(); //Address 1 , Address 2 , city, zip and state
	  
	  scrollDown();//Scroll down page
	  
	  createaccountPage.mobileNumber();//Mobile number
	  createaccountPage.alias(); //Alias
	  createaccountPage.register(); //Register the new account
	  
	  
	  /*
	   * Check result
	   */
	  myaccountPage.validateResultAccountTitle(); //Check if account is created successfully. Passed if there is a "Welcome to your account. Here you can manage all of your personal information and orders." string
  }
  
}


