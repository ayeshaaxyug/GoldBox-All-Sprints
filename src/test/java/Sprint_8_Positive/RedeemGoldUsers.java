package Sprint_8_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.RedeemPage;
import objectRepository.UsersPage;
import objectRepository.Redeem_ReddemGoldusers_FilterPage;
import objectRepository.Redeem_RedeemGoldUsersPage;
import objectRepository.Redeem_RedeemGold_RedeemGoldButtonPage;
import objectRepository.SettingsPage;
import objectRepository.Settings_AddFmsUserPage;
import objectRepository.Settings_AddPaymentMethodPage;
import objectRepository.Settings_EditFmsUsersPage;
import objectRepository.Settings_FmsUsersPage;
import objectRepository.Settings_OtpListPage;
import objectRepository.Settings_PaymentManagementPage;
import objectRepository.Settings_Roles_AddRolePage;
import objectRepository.Settings_Roles_RolesListPage;
import objectRepository.Settings_Roles_UpdateRolePage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class RedeemGoldUsers extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void RedeemGoldUsers() throws Exception
	{
		
		// Whole Script is Running
		
		
		Thread.sleep(10000);
		
		String SearchFeild = eUtil.readDataFromExcel("Sprint 8", 1, 1);
		String EnterPaymentId = eUtil.readDataFromExcel("Sprint 8", 3, 1);
		String UploadGstNumber = eUtil.readDataFromExcel("Sprint 8", 4, 1);
		String ImagePaths = eUtil.readDataFromExcel("Sprint 8", 5, 1);
		String FromDate = eUtil.readDataFromExcel("Sprint 8", 7, 1);
		String EndDate = eUtil.readDataFromExcel("Sprint 8", 8, 1);
		String MobileNumber = eUtil.readDataFromExcel("Sprint 8", 9, 1);
		String TransactionId = eUtil.readDataFromExcel("Sprint 8", 10, 1);
		String TxnType = eUtil.readDataFromExcel("Sprint 8", 11, 1);

		// Settings
		
	    String Title = eUtil.readDataFromExcel("Sprint 8", 17, 1);
	    String SearchInputFeild = eUtil.readDataFromExcel("Sprint 8", 20, 1);
		String RoleTitle = eUtil.readDataFromExcel("Sprint 8", 21, 1);
		String RoleTitleEdit = eUtil.readDataFromExcel("Sprint 8", 22, 1);
	    String FmsSearchFeild = eUtil.readDataFromExcel("Sprint 8", 25, 1);
	    String AddFullName = eUtil.readDataFromExcel("Sprint 8", 26, 1);
	    String AddPhonenUmber = eUtil.readDataFromExcel("Sprint 8", 27, 1);
		String AddEmail = eUtil.readDataFromExcel("Sprint 8", 28, 1);
		String AddPassword = eUtil.readDataFromExcel("Sprint 8", 29, 1);
	    //String Role = eUtil.readDataFromExcel("Sprint 8", 30, 1);
	    String EditFullName = eUtil.readDataFromExcel("Sprint 8", 33, 1);
		String EditPhonenUmber = eUtil.readDataFromExcel("Sprint 8", 34, 1);
		String EditEmail = eUtil.readDataFromExcel("Sprint 8", 35, 1);
		String EditPassword = eUtil.readDataFromExcel("Sprint 8", 36, 1);

		
		Thread.sleep(10000);
		
		// REdeem Gold Users
		
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(3000);
		DashboardPage dbPage = new DashboardPage(driver);
		Thread.sleep(3000);
		dbPage.getRedeemDrpDwn().click();
		Thread.sleep(3000);
		RedeemPage RPage = new RedeemPage(driver);
		Thread.sleep(3000);
		RPage.getRedeemGoldUsersLnk().click();
		Thread.sleep(3000);
		Redeem_RedeemGoldUsersPage RGUPage = new Redeem_RedeemGoldUsersPage(driver);
		Thread.sleep(3000);
 		RGUPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(3000);
		RGUPage.getSearchEdt().clear();
		Thread.sleep(3000);
		RGUPage.getExportToExcelLnk().click();
		Thread.sleep(3000);
		
		/*
		RGUPage.getReedemGoldBtn().click();
		Thread.sleep(3000);
		Redeem_RedeemGold_RedeemGoldButtonPage RGRGBPage = new Redeem_RedeemGold_RedeemGoldButtonPage(driver);
		RGRGBPage.getCloseBtn().click();
		Thread.sleep(3000);
        */
		
		Thread.sleep(4000);
		RGUPage.getFilterBtn().click();
		Thread.sleep(3000);
		Redeem_ReddemGoldusers_FilterPage RGUFPage = new Redeem_ReddemGoldusers_FilterPage(driver);
		Thread.sleep(3000); 
		RGUFPage.getTxnTypeDrpdwn().click();
		driver.findElement(By.xpath("(//span[.='Redeemed'])[1]")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		 
		/*
		Thread.sleep(4000); 
		RGUPage.getFilterBtn().click(); 
		Thread.sleep(3000); // RGUFPage.getTxnTypeDrpdwn().click(); 
		driver.findElement(By.xpath("(//span[.='Redeem'])[2]")).click(); 
		Thread.sleep(3000); 
		driver.navigate().refresh();
	    Thread.sleep(3000);
		wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);
		
		Thread.sleep(3000);
		RGUPage.getNextBtn().click();
		Thread.sleep(3000);
		RGUPage.getPrevBtn().click();
 		Thread.sleep(3000);
		
		wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(3);

		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
         */
		
		
		// Settings
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		// OTP List
		
		Thread.sleep(3000);
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(3000);
		SettingsPage SPage = new SettingsPage(driver);
		Thread.sleep(3000);
	   	SPage.getOtpListLnk().click();
		Thread.sleep(3000);		
		Settings_OtpListPage SOLPage = new Settings_OtpListPage(driver);
		Thread.sleep(3000);
		SOLPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(3000);
		SOLPage.getSearchEdt().clear();
		Thread.sleep(1000);	
		driver.navigate().refresh();
		Thread.sleep(1000);
		/*
		SOLPage.getNextPageLnk().click();
		Thread.sleep(3000);
		SOLPage.getPreviousPageLnk().click();
		Thread.sleep(5000);
		*/
		
		// App Management
		
		Thread.sleep(4000);
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(4000);
		SPage.getAppManagementLnk().click();
		Thread.sleep(4000);
		
		// Payment Management
		
		Thread.sleep(4000);
		SPage.getPaymentManagementLnk().click();
		Thread.sleep(4000);
		Settings_PaymentManagementPage SPMPage = new Settings_PaymentManagementPage(driver);
		Thread.sleep(3000);
		SPMPage.getAddPaymentMethodBtn().click();
		Thread.sleep(3000);
		Settings_AddPaymentMethodPage SAPMPage = new Settings_AddPaymentMethodPage(driver);
		Thread.sleep(3000);
		SAPMPage.getEnterTitleEdt().sendKeys(Title);
		Thread.sleep(3000);
		SAPMPage.getBootstrapBtn().click();
		Thread.sleep(3000);
		SAPMPage.getAddBtn().click();	
		
		WebElement Exixts = driver.findElement(By.xpath("//div[@aria-label='Title is Already Existed, Please Enter Another Title']"));
		Thread.sleep(3000);
		if (Exixts.isDisplayed()) 
		{
		   System.out.println("Already Exists");
		} 
		else 
		{
            System.out.println("Add Payment Method");
		}
		Thread.sleep(3000);
		SAPMPage.getCloseBtn().click();
		Thread.sleep(3000);
		SPMPage.getPaymentStatusBootStrapBtn().click();
		Thread.sleep(4000);

		// Roles
		
		Thread.sleep(4000);
		SPage.getRolesLnk().click();
		Thread.sleep(3000);
		Settings_Roles_RolesListPage SRLPage = new Settings_Roles_RolesListPage(driver);
		SRLPage.getSearchEdt().sendKeys(SearchInputFeild);
		Thread.sleep(3000);
		SRLPage.getSearchEdt().clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		SRLPage.getAddRoleBtn().click();
		Thread.sleep(3000);
		Settings_Roles_AddRolePage SARPage = new Settings_Roles_AddRolePage(driver);
		Thread.sleep(3000);
		SARPage.getTitleEdt().sendKeys(RoleTitle);
		Thread.sleep(5000);
		SARPage.getAddBtn().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		SRLPage.getNextPageBtn().click();
		Thread.sleep(5000);
		SRLPage.getEditBtn().click();
		Thread.sleep(3000);
		Settings_Roles_UpdateRolePage SERPage = new Settings_Roles_UpdateRolePage(driver);
		Thread.sleep(3000);
		SERPage.getTitleEdt().clear();
		Thread.sleep(3000);
		SERPage.getTitleEdt().sendKeys(RoleTitleEdit);
		Thread.sleep(3000);
		SERPage.getUpdateBtn().click();
		Thread.sleep(3000);
		SRLPage.getDeleteBtn().click();
		Thread.sleep(3000);	
		SRLPage.getYesDeleteBtn().click();
		Thread.sleep(3000);	
		SRLPage.getPreviousPageBtn().click();
		Thread.sleep(5000);
		
		// Fms Users
		
		Thread.sleep(5000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(5);
		
		dbPage.getSettingsDrpDwn().click();
		Thread.sleep(4000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(3000);
		Settings_FmsUsersPage SFUPage = new Settings_FmsUsersPage(driver);
		Thread.sleep(3000);
		SFUPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(3000);
		SFUPage.getSearchEdt().clear();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		SFUPage.getAddFmsUsersBtn().click();
		Thread.sleep(3000);
		Settings_AddFmsUserPage SAFUPage = new Settings_AddFmsUserPage(driver);
		Thread.sleep(3000);
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(3000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(3000);
		SAFUPage.getMailEdt().sendKeys(AddEmail);
		Thread.sleep(3000);
		SAFUPage.getPasswordEdt().sendKeys(AddPassword);
		Thread.sleep(3000);
		SAFUPage.Select(driver);
		Thread.sleep(3000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		SFUPage.getEditBtn().click();
		Thread.sleep(3000);		
		Settings_EditFmsUsersPage SEFUPage = new Settings_EditFmsUsersPage(driver);
		SEFUPage.getEnterFullNameEdt().clear();
		Thread.sleep(3000);
		SEFUPage.getEnterFullNameEdt().sendKeys(EditFullName);
		Thread.sleep(3000);
		SEFUPage.getMobileNumberEdt().clear();
		Thread.sleep(3000);
		SEFUPage.getMobileNumberEdt().sendKeys(EditPhonenUmber);
		Thread.sleep(3000);
		SEFUPage.getEmailEdt().clear();
		Thread.sleep(3000);
		SEFUPage.getEmailEdt().sendKeys(EditEmail);
		Thread.sleep(3000);
		SEFUPage.getPasswordEdt().clear();
		Thread.sleep(3000);
		SEFUPage.getPasswordEdt().sendKeys(EditPassword);
		Thread.sleep(3000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(3000);		
		driver.navigate().refresh();		
		Thread.sleep(3000);
		SFUPage.getDeleteBtn().click();		
		Thread.sleep(3000);	
		SFUPage.getYesDeleteBtn().click();
		Thread.sleep(3000);	

			
	}


}


/*
RGUPage.getViewBtn().click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);

 
        driver.navigate().refresh();		
Thread.sleep(3000);

 
*/



	
//	    RGRGBPage.getPaymentIdEdt().sendKeys(EnterPaymentId);
//	    Thread.sleep(3000);
//	    RGRGBPage.getGstEdt().sendKeys(UploadGstNumber);
//	    Thread.sleep(4000);
//	    RGRGBPage.getAddImageBtn().click();
//	    Thread.sleep(3000);
//	    RGRGBPage.getAddImageLnk().sendKeys(ImagePaths);
//	    Thread.sleep(4000);
//	    RGRGBPage.getUploadBtn().click();
//	    Thread.sleep(6000);

//      RGUPage.getReedemGoldBtn().click();
//      Thread.sleep(3000);
//      Redeem_RedeemGold_RedeemGoldButtonPage RGRGBPage = new Redeem_RedeemGold_RedeemGoldButtonPage(driver);
//      RGRGBPage.getCloseBtn().click();
//      Thread.sleep(3000);

//      Redeem_ReddemGoldusers_FilterPage RGUFPage = new Redeem_ReddemGoldusers_FilterPage(driver);
//      Thread.sleep(3000);     
//      RGUFPage.getFromDateEdt().sendKeys(FromDate);
//      Thread.sleep(3000);
//      RGUFPage.getEndDateEdt().sendKeys(EndDate);
//      Thread.sleep(5000);
//      RGUFPage.getMobileNumberEdt().sendKeys(MobileNumber);
//      Thread.sleep(5000);
//      RGUFPage.getTransactionIdEdt().sendKeys(TransactionId);
//      Thread.sleep(3000);
//      RGUFPage.getTxnTypeDrpdwn().click();
//      Thread.sleep(4000);	    
//      RGUFPage.getSearchEdt().click();
//      Thread.sleep(3000);
//      RGUFPage.getRefreshBtn().click();
//      Thread.sleep(3000);

//      RGUPage.getShowAllCheckBox().click();
//      Thread.sleep(4000);