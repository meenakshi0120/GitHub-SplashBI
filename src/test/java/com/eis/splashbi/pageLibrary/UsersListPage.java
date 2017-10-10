package com.eis.splashbi.pageLibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersListPage {

	WebDriver driver;
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	By MassEditIcon = By.xpath("html/body/section/section[2]/section/section/section/section/div/div[1]/section/section[1]/div/div/div[1]/div[1]");
	By SearchUserSearchBox = By.xpath(".//*[@id='sbi-ad-js-us-user-search-field']");
	By ClickOnSearchIcon = By.xpath("html/body/section/section[2]/section/section/section/section/div/div[1]/section/section[1]/div/div/div[2]/div/span[2]");
	By AdvanceSearchDropDown = By.xpath("html/body/section/section[2]/section/section/section/section/div/div[1]/section/section[1]/div/div/div[2]/div/span[3]");
	By SelectAllInMassEdit = By.xpath("html/body/section/section[2]/section/section/section/section/div/div[1]/section/section[1]/div/div/div[1]/div[2]/div[1]/label/span");
	By MassEditDelete = By.xpath("html/body/section/section[2]/section/section/section/section/div/div[1]/section/section[1]/div/div/div[1]/div[2]/div[2]/span[1]");
	By GridViewIconInUsersPage = By.xpath(".//*[@id='sbi-ad-js-us-user-gridview-icon']");
	By ListViewIconInUsersPage = By.xpath(".//*[@id='sbi-ad-js-us-user-listview-icon']");
	By BackPaginationIcon = By.xpath(".//*[@id='sbi-ad-js-us-user-pagenation']/a[2]");
	By forwardPaginationIcon = By.xpath(".//*[@id='sbi-ad-js-us-user-pagenation']/a[3]");
	By Currentpage = By.xpath(".//*[@id='sbi-ad-js-us-user-pagenation']/span[1]/input");
	By MoreActionsInUsersPage = By.xpath("html/body/section/section[2]/div/div[1]/div[1]");
	By ExportUserTempleteInMoreActions = By.xpath(".//*[@id='sbi-ad-js-us-user-template-top-icon']");
	By ExportUserTempleteWithDataInMoreActions = By.xpath(".//*[@id='sbi-ad-js-us-user-export-top-icon']");
	By CreateUserIcon = By.xpath(".//*[@id='sbi-ad-js-us-user-add-top-icon']");
	By ImportUser = By.xpath(".//*[@id='sbi-ad-js-us-user-import-top-icon']");
	By UserGridVies = By.xpath(".//*[@id='sbi-ad-js-us-user-gridview']");
	By UserListVies = By.xpath(".//*[@id='adminnavigationMenu']");
	
	
}
