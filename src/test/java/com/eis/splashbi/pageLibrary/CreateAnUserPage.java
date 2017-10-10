package com.eis.splashbi.pageLibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnUserPage {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	By userNameTextBox = By.xpath(".//*[@id='adminuser_name']");
	By basicDetailsCreateUser = By.xpath(".//*[@id='adminuseradd-bg']/div/div/div[2]/div/div[1]/div/div[1]/a");
	By setingsCreateUser = By.xpath(".//*[@id='adminuseradd-bg']/div/div/div[2]/div/div[1]/div/div[2]/a");
	By AssignUserGroup = By.xpath(".//*[@id='adminuseradd-bg']/div/div/div[2]/div/div[1]/div/div[3]/a");
	
	By autyhenticationMethodDropdown = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[2]/div/span/span/span[1]");
	By passwordInCreateUserPage = By.xpath(".//*[@id='addUserPassword']");
	By CameraIcon = By.xpath(".//*[@id='openChooseFileForCreate']");
	
	By generatePasswordCheckBox = By.xpath(".//*[@id='sbi-js-us-email-login-check']/label[2]/span");
	By sendEmailCheckBox = By.xpath(".//*[@id='sbi-js-us-email-login-check']/label[3]/span");
	By resetPasswordUponLoginCheckBox = By.xpath(".//*[@id='sbi-js-us-email-login-check']/label[4]/span");
	
	By firstName = By.xpath(".//*[@id='adminUserFirstname']");
	By lastName = By.xpath(".//*[@id='adminUserLastname']");
	By emailAddress = By.xpath(".//*[@id='adminUserEmail']");
	By languageDropDown = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[11]/span/span/span[1]");
	By countryDropDown = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[12]/span/span/span[1]");
	By workPhone = By.xpath(".//*[@id='adminuserworkphone']");
	By mobileNumber = By.xpath(".//*[@id='adminusermobilenumber']");
	
	By accessAdminCheckbox = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[1]/span");
	By accessDomainCheckbox = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[2]/span");
	By accessReportsCheckbox = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[3]/span");
	By accessDashboardsCheckbox = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[4]/span");
	By accessTabletMobileCheckBox = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[5]/span");
	By accessExcelConnect = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[6]/span[1]");
	By accessIntegration = By.xpath(".//*[@id='step-1']/div[1]/div[1]/div[15]/div/label[7]/span[1]");
	
	By cancelButtonBasicDetails = By.xpath(".//*[@id='step-1']/div[2]/input[1]"); 
	By saveAndNextButton = By.xpath(".//*[@id='step-1']/div[2]/input[2]");
	
	By userSavedSuccessfully = By.xpath(".//*[@id='sbi2-common-tempates']/div[1]/div/div[2]");
	
	By permissionCreateDomain = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[1]/span[1]");
	By permissionCreateReport = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[2]/span[1]");
	By permissionCreateDashboard = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[3]/span[1]");
	By permissionCreateChart = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[4]/span[1]");
	By permissionCreateIntegration = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[5]/span[1]");
	By permissionCreateReportSet = By.xpath(".//*[@id='step-2']/div[1]/div[1]/div[1]/div/label[6]/span[1]");
	
	By permissionCopyReport = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[2]/div/label[1]/span[1]");
	By permissionCopyDashboard = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[2]/div/label[2]/span[1]");
	
	By spreadsheetApplicationDropDown = By.xpath(".//*[@id='setting_id_19']");
	By DateFormatDropDown = By.xpath(".//*[@id='setting_id_16']");
	By languageDD = By.xpath(".//*[@id='setting_id_4']");
	By CountryDD = By.xpath(".//*[@id='setting_id_6']");
	By DefaultViewTypeDD = By.xpath(".//*[@id='setting_id_14']");
	By previewChartDD = By.xpath(".//*[@id='setting_id_17']");
	By showSQLDD = By.xpath(".//*[@id='setting_id_15']");
	By debugFlagDD = By.xpath(".//*[@id='setting_id_2']");
	By ApplySecurityToAdminUserDD = By.xpath(".//*[@id='setting_id_20']");
	By restrictDmlManupulationsDD = By.xpath(".//*[@id='setting_id_23']");
	By restrictSelectInCalculationColumn = By.xpath(".//*[@id='setting_id_24']");
	
	By shareReport = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[14]/div/label[1]/span[1]");
	By shareDomain = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[14]/div/label[2]/span[1]");
	By shareDashboard = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[14]/div/label[3]/span[1]");
	By shareChart = By.xpath(".//*[@id='stepEdit-2']/div[1]/div[1]/div[14]/div/label[4]/span[1]");
	
	By disableAutoOuterJoin = By.xpath(".//*[@id='setting_id_31']");
	By modifyReportAtRunTime = By.xpath(".//*[@id='setting_id_29']");
	By restrictTablesToDomainInPasteSQL = By.xpath(".//*[@id='setting_id_50']");
	By drilldownAllowed = By.xpath(".//*[@id='setting_id_32']");
	By disableFanTrapDetection = By.xpath(".//*[@id='setting_id_44']");
	By defaultParametrWhenElementHaveSingleValues = By.xpath(".//*[@id='setting_id_49']");
	By pasteSqlAllowed = By.xpath(".//*[@id='setting_id_33']");
	
	By seededReportModification = By.xpath(".//*[@id='setting_id_43']");
	By oracleSqlFormationStandard = By.xpath(".//*[@id='setting_id_55']");
	By distinctFlag= By.xpath(".//*[@id='setting_id_60']");
	By logOnNavigation = By.xpath(".//*[@id='setting_id_61']");
	By whenDashboardRun = By.xpath(".//*[@id='setting_id_62']");
	
	By cancelUserSettingsCreateUser = By.xpath(".//*[@id='stepEdit-2']/div[2]/input[1]");
	By saveUserSettingCreateUser = By.xpath(".//*[@id='stepEdit-2']/div[2]/input[2]");
	By nextUserSettingCreateUser = By.xpath(".//*[@id='stepEdit-2']/div[2]/input[3]");
	
	By assignUserGroupsscreen = By.xpath(".//*[@id='adminUserSetting-bg']/div/div/div[2]/div/div[1]/div/div[3]/a");
	
	By cancelassignUserGroupss = By.xpath(".//*[@id='stepEdit-3']/div/div[1]/div[4]/input[1]");
	By saveassignUserGroupss = By.xpath(".//*[@id='stepEdit-3']/div/div[1]/div[4]/input[2]");
	
	
	/**
	 * Creates WebDriver for this method
	 * @param driver
	 */
	public CreateAnUserPage(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * 
	 */
	public void userNameTextBox(){
		
	}

	
	
}
