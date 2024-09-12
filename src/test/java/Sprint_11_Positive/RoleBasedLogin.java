package Sprint_11_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.DashboardPage;
import objectRepository.SettingsPage;
import objectRepository.Settings_AddFmsUserPage;
import objectRepository.Settings_EditFmsUsersPage;
import objectRepository.Settings_FmsUsersPage;
import objectRepository.Settings_Roles_AddRolePage;
import objectRepository.Settings_Roles_RolesListPage;
import objectRepository.Settings_Roles_UpdateRolePage;

@Listeners(genericUtility.ListnersImplementationClass.class)


public class RoleBasedLogin extends FMS_BaseClass
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

  @Test
  public void RoleBasedLogin() throws Exception 
  {
	
		// Roles
		
	    String SearchInputFeild = eUtil.readDataFromExcel("Sprint 11", 2, 1);
		String RoleTitle = eUtil.readDataFromExcel("Sprint 11",3, 1);
		String RoleTitleEdit = eUtil.readDataFromExcel("Sprint 11", 4, 1);
		
		// Add FMS Users
		
	    String FmsSearchFeild = eUtil.readDataFromExcel("Sprint 11", 9, 1);
	    String AddFullName = eUtil.readDataFromExcel("Sprint 11", 10, 1);
	    String AddPhonenUmber = eUtil.readDataFromExcel("Sprint 11", 11, 1);
		String AddEmail = eUtil.readDataFromExcel("Sprint 11", 12, 1);
		String AddPassword = eUtil.readDataFromExcel("Sprint 11", 13, 1);
	    //String Role = eUtil.readDataFromExcel("Sprint 8", 14, 1);
		
		// Edit FMS Users
		
	    String EditFullName = eUtil.readDataFromExcel("Sprint 11", 17, 1);
		String EditPhonenUmber = eUtil.readDataFromExcel("Sprint 11", 18, 1);
		String EditEmail = eUtil.readDataFromExcel("Sprint 11", 19, 1);
		String EditPassword = eUtil.readDataFromExcel("Sprint 11", 20, 1);
		
		
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getSettingsDrpDwn().click();
		SettingsPage SPage = new SettingsPage(driver);
		Thread.sleep(2000);
		
		SPage.getRolesLnk().click();
		Thread.sleep(4000);
		SPage.getRolesLnk().click();
		Thread.sleep(2000);
		Settings_Roles_RolesListPage SRLPage = new Settings_Roles_RolesListPage(driver);
		SRLPage.getSearchEdt().sendKeys(SearchInputFeild);
		Thread.sleep(2000);
		SRLPage.getSearchEdt().clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
/*
		
		SRLPage.getAddRoleBtn().click();
		Thread.sleep(2000);
		Settings_Roles_AddRolePage SARPage = new Settings_Roles_AddRolePage(driver);
		Thread.sleep(2000);
		SARPage.getTitleEdt().sendKeys(RoleTitle);
		Thread.sleep(5000);
		SARPage.getAddBtn().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		SRLPage.getNextPageBtn().click();
		Thread.sleep(5000);
		
	    SRLPage.getEditBtn().click();
		Thread.sleep(2000);
		Settings_Roles_UpdateRolePage SERPage = new Settings_Roles_UpdateRolePage(driver);
		Thread.sleep(2000);
		SERPage.getTitleEdt().clear();
		Thread.sleep(2000);
		SERPage.getTitleEdt().sendKeys(RoleTitleEdit);
		Thread.sleep(2000);
		SERPage.getUpdateBtn().click();
		Thread.sleep(2000);
*/
		
		// FMS Users
		
		Thread.sleep(5000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(5);
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(4000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		Settings_FmsUsersPage SFUPage = new Settings_FmsUsersPage(driver);
		Thread.sleep(2000);
		SFUPage.getSearchEdt().sendKeys(FmsSearchFeild);
		Thread.sleep(2000);
		SFUPage.getSearchEdt().clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		Thread.sleep(2000);
		Settings_AddFmsUserPage SAFUPage = new Settings_AddFmsUserPage(driver);
		Thread.sleep(2000);
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(2000);
		SAFUPage.getMailEdt().sendKeys(AddEmail);
		Thread.sleep(2000);
		SAFUPage.getPasswordEdt().sendKeys(AddPassword);
		Thread.sleep(3000);
		SAFUPage.Select(driver);
		Thread.sleep(2000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		Thread.sleep(2000);		
		Settings_EditFmsUsersPage SEFUPage = new Settings_EditFmsUsersPage(driver);
		SEFUPage.getEnterFullNameEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getEnterFullNameEdt().sendKeys(EditFullName);
		Thread.sleep(2000);
		SEFUPage.getMobileNumberEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getMobileNumberEdt().sendKeys(EditPhonenUmber);
		Thread.sleep(2000);
		SEFUPage.getEmailEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getEmailEdt().sendKeys(EditEmail);
		Thread.sleep(2000);
		SEFUPage.getPasswordEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getPasswordEdt().sendKeys(EditPassword);
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
			
	  
  }

	
}