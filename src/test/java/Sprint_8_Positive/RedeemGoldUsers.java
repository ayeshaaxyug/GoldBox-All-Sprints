package Sprint_8_Positive;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.UsersPage;
import objectRepository.Users_ReddemGoldusers_FilterPage;
import objectRepository.Users_RedeemGoldUsersPage;
import objectRepository.Users_RedeemGold_RedeemGoldButtonPage;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class RedeemGoldUsers extends FMS_BaseClass {
	
	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void RedeemGoldUsers() throws Exception
	{
		
		String SearchFeild = eUtil.readDataFromExcel("Sprint 8", 1, 1);
		String EnterPaymentId = eUtil.readDataFromExcel("Sprint 8", 3, 1);
		String UploadGstNumber = eUtil.readDataFromExcel("Sprint 8", 4, 1);
		String ImagePaths = eUtil.readDataFromExcel("Sprint 8", 5, 1);
		String FromDate = eUtil.readDataFromExcel("Sprint 8", 7, 1);
		String EndDate = eUtil.readDataFromExcel("Sprint 8", 8, 1);
		String MobileNumber = eUtil.readDataFromExcel("Sprint 8", 9, 1);
		String TransactionId = eUtil.readDataFromExcel("Sprint 8", 10, 1);
		
		Thread.sleep(5000);
		WebDriverUtility wu=new WebDriverUtility(); 
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getUsersDrpDwn().click();
		Thread.sleep(2000);
		UsersPage UPage = new UsersPage(driver);
		UPage.getReedemGoldUsersLnk().click();
		Users_RedeemGoldUsersPage RGUPage = new Users_RedeemGoldUsersPage(driver);
		RGUPage.getSearchEdt().sendKeys(SearchFeild);
		Thread.sleep(2000);
		RGUPage.getSearchEdt().clear();
		Thread.sleep(2000);
		RGUPage.getExportToExcelLnk().click();
		Thread.sleep(2000);
		RGUPage.getViewBtn().click();
		Thread.sleep(2000);
		driver.navigate().back();
		RGUPage.getReedemGoldBtn().click();
		Thread.sleep(2000);
	    Users_RedeemGold_RedeemGoldButtonPage RGRGBPage = new Users_RedeemGold_RedeemGoldButtonPage(driver);
	    RGRGBPage.getCloseBtn().click();
	    Thread.sleep(2000);
	   
//	    RGRGBPage.getPaymentIdEdt().sendKeys(EnterPaymentId);
//	    Thread.sleep(2000);
//	    RGRGBPage.getGstEdt().sendKeys(UploadGstNumber);
//	    Thread.sleep(4000);
//	    RGRGBPage.getAddImageBtn().click();
//	    Thread.sleep(3000);
//	    RGRGBPage.getAddImageLnk().sendKeys(ImagePaths);
//	    Thread.sleep(4000);
//	    RGRGBPage.getUploadBtn().click();
//	    Thread.sleep(6000);
	    
	    RGUPage.getShowAllCheckBox().click();
	    Thread.sleep(4000);
	    
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageUp(3);

		Thread.sleep(4000);
	    RGUPage.getFilterBtn().click();
	    Thread.sleep(2000);
	    Users_ReddemGoldusers_FilterPage RGUFPage = new Users_ReddemGoldusers_FilterPage(driver);
	    Thread.sleep(3000);
	    RGUFPage.getFromDateEdt().sendKeys(FromDate);
	    Thread.sleep(3000);
	    RGUFPage.getEndDateEdt().sendKeys(EndDate);
	    Thread.sleep(5000);
	    RGUFPage.getMobileNumberEdt().sendKeys(MobileNumber);
	    Thread.sleep(5000);
	    RGUFPage.getTransactionIdEdt().sendKeys(TransactionId);
	    Thread.sleep(3000);
	    RGUFPage.getRefreshBtn().click();
	    Thread.sleep(3000);
	    RGUFPage.getSearchEdt().click();
	    Thread.sleep(3000);
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(3000);
	    RGUPage.getNextBtn().click();
	    Thread.sleep(3000);
	    RGUPage.getPrevBtn().click();
	    Thread.sleep(3000);
	}

}