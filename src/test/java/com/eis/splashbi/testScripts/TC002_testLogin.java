package com.eis.splashbi.testScripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eis.splashbi.pageLibrary.SignIn;
import com.eis.splashbi.testBase.TestBase;

public class TC002_testLogin extends TestBase{
	SignIn signIn;
	
	@BeforeClass
	public void setUP() throws IOException{
		initilize();
	}
	
	
	@Test
	public void testLogin() throws InterruptedException{
		signIn = new SignIn(driver);
		signIn.LoginPage("qa", "welcome");
		signIn.submitButtonInLoginPage();
		Thread.sleep(10000);
		signIn.verifyLoginApplication();
		//Assert.assertEquals("Dashboard - Splash Business Intelligence", signIn.verifySplashHomepage());
		//signIn.verifyLoginSuccessfullOrFailed();
	}
	
	
	@AfterClass
	public void quitBrowser(){
		driver.quit();
	}

}
