package com.eis.splashbi.pageLibrary;

import java.util.logging.Logger;




//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import org.testng.Reporter;

import com.google.common.base.Verify;

public class SignIn {
	WebDriver driver;
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	By userNameLogin = By.id("userName");
	By passwordLogin = By.id("password");
	By languageLogin = By.id("localeCode");
	By submitButtom = By.id("submitButton");
	By ssoLogin = By.id("samlLogin");
	By forgotPassword = By.id("forgotPwd");
	By InvalidUserNameOrPassword = By.xpath(".//*[@id='warning_Box']/div[1]/div[1]/span"); 
	By OkButtonInErroPopup = By.xpath(".//*[@id='warning_Box']/div[2]/a/button");
	
	
	/**
	 * Creates WebDriver for this method
	 * @param driver
	 */
	public SignIn(WebDriver driver)
	{
		this.driver = driver;
	}

	/**
	 * This method will enter the user name and password in text boxes 
	 */
	public void LoginPage(String userName, String password)
	{
		Reporter.log("enter username and password", true);
		driver.findElement(userNameLogin).sendKeys(userName);
		driver.findElement(passwordLogin).sendKeys(password);
	}
	
	
	/**
	 * This method will select the language 
	 */
	public void languagrSelection(String LanguageSelect)
	{
		log.info("Selecting the language from language drop down");
		WebElement language = driver.findElement(languageLogin);
		Select selectLanguage = new Select(language);
		selectLanguage.selectByVisibleText(LanguageSelect);
	}
	
	/**
	 * This method will click on SignIn button 
	 */
	public void submitButtonInLoginPage()
	{
		log.info("Click on SignIn button to signin the application");
		driver.findElement(submitButtom).click();
	}
	
	/**
	 * This method user to perform sso login 
	 */
	public void ssoLogin()
	{
		
	}
	
	/**
	 * This method is used to reset the password. 
	 * Need user name and email details.
	 */
	public void forgotPasswordLoginPage()
	{
		log.info("Click on forgor password to recover account");
		driver.findElement(forgotPassword).click();
	}

	
	public void verifyLoginApplication(){
		String actualTitle = driver.getTitle();
		Boolean value = actualTitle.equals("Dashboard - Splash Business Intelligence");
		Verify.verify(value);
		//Assert.assertEquals("Dashboard - Splash Business Intelligence", actualTitle);
		if(value){
			driver.findElement(OkButtonInErroPopup).click();
		}
		else{
			System.out.println("Ok button not found in error popup");
		}
		
	}
	
	/**
	 * This method will verify the page title on successful login
	 * If login fails it will verify the error popup and Click's on OK button to close popup
	 * @return
	 */
	public void verifyLoginSuccessfullOrFailed(){
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Dashboard - Splash Business Intelligence")){
			System.out.println("Login success");
		}
		else{
			System.out.println("Login failed");
			String message = driver.findElement(InvalidUserNameOrPassword).getText();
			if(message.contains("Invalid Username or Password")){
				driver.findElement(OkButtonInErroPopup).click();
			}
		}
		
		//Assert.assertEquals("Dashboard - Splash Business Intelligence", actualTitle);
		//return actualTitle;
	}
	
	
	//public void loginToApplication(String){
	//	LoginPage("admin", "sp!@SH@");
	//	submitButtonInLoginPage();
	//}
	
}
