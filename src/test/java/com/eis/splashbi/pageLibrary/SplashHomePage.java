package com.eis.splashbi.pageLibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SplashHomePage {

	WebDriver driver;
	static Logger log = Logger.getLogger(SplashHomePage.class.getName());
	
	By SlideOutAndInNavBar = By.id("openNavbar");
	By DashboardsPage = By.id("dashboardLink");
	By ReportsPage = By.id("reportLink");
	By AdminPage = By.id("userLink");
	By HomePageHelp = By.id("clientAdminLink");
	By UserInformation = By.xpath(".//*[@id='userinfo']/div/div[1]/img");
	By ExitFromApplication = By.xpath(".//*[@id='userinfo']/div/div[2]/div[2]");
	
	/**
	 * This method creates WebDriver reference in current class
	 * @param driver
	 */
	public SplashHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * This method clicks on Slide in / Slide out navigation bar
	 */
	public void SlideOutAndInNavBar(){
		driver.findElement(SlideOutAndInNavBar).click();
	}
	
	/**
	 * This method will click on dashboards
	 */
	public void DashboardsPage(){
		driver.findElement(DashboardsPage).click();
	}
	
	/**
	 * This method will click on reports
	 */
	public void reportsPage(){
		driver.findElement(ReportsPage).click();
	}
	
	/**
	 * This method will click on User icon to navigate admin page
	 */
	public void adminPage(){
		driver.findElement(AdminPage).click();
	}
	
	/**
	 * This method will open help in home page
	 */
	public void homePageHelp(){
		driver.findElement(HomePageHelp).click();
	}
	
	
	public void userInformation(){
		driver.findElement(UserInformation).click();
	}
	
	
	public void exitFromApplication(){
		driver.findElement(ExitFromApplication).click();
	}
}
