package com.eis.splashbi.pageLibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorPage {

	WebDriver driver;
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	By Connection = By.xpath(".//*[@id='sbi-js-ad-screen-connection']/div/div");
	By Users = By.xpath(".//*[@id='sbi-js-ad-screen-users']/div");
	By Settings = By.xpath(".//*[@id='sbi-js-ad-screen-settings']/div");
	By Setup = By.xpath(".//*[@id='sbi-js-ad-screen-settings']/div");
	
	
	/**
	 * Creates WebDriver for this method
	 * @param driver
	 */
	public AdministratorPage(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * This method will click on connections icon in Administrator page.
	 */
	public void ClickOnConnectionToNavigateConnectionsPage(){
		if(driver.findElement(Connection).isDisplayed()){
			driver.findElement(Connection).click();
		}	
	}
	
	/**
	 * This method will click on users icon in Administrator page.
	 */
	public void ClickOnUsersToNavigateUsersPage(){
		driver.findElement(Users).click();
	}
	
	/**
	 * This method will click on Settings icon in Administrator page.
	 */
	public void ClickOnSettingsToNavigateSettingsPage(){
		driver.findElement(Settings).click();
	}
	
	/**
	 * This method will click on Setup icon in Administrator page.
	 */
	public void ClickOnSetupToNavigateSetupPage(){
		driver.findElement(Setup).click();
	}
	
	
}
