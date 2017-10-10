package com.eis.splashbi.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static Properties Repository = new Properties();
	public File file;
	public FileInputStream FIS;
	public WebDriver driver;
	
	public void initilize() throws IOException 
	{
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
		
	}

	private void loadPropertiesFile() throws IOException 
	{
		Repository.load(new FileInputStream("D:/WorkSpace/splashBI-automation/src/test/java/com/eis/splashbi/config/config.properties"));
		System.out.println("Properties file found");
	}
	
	
	
	/**
	 * This method initialize browser object
	 * @param browser
	 * @return browser driver
	 */
	public WebDriver selectBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome driver");
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		return null;
	}
}
