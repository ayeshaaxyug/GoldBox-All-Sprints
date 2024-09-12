package Sprint_9_Positive;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.GiftCardsPage;
import objectRepository.GiftCards_AddMerchantsPage;
import objectRepository.GiftCards_EditGiftCardsMerchantsPage;
import objectRepository.GiftCards_MerchantsPage;
import objectRepository.GoldPricesPage;
import objectRepository.UsersPage;
import objectRepository.Users_PenaltyUsers;

@Listeners(genericUtility.ListnersImplementationClass.class)

public class GoldPrices extends FMS_BaseClass 
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void GoldPrices() throws InterruptedException, IOException 
	{
		
		// Whole Script is Running
		
		Thread.sleep(10000);
		
		String SearchEdt = eUtil.readDataFromExcel("Sprint 9", 2, 1);
		String EnterDate = eUtil.readDataFromExcel("Sprint 9", 6, 1);
		String StartTime = eUtil.readDataFromExcel("Sprint 9", 7, 1);
		String EndTime = eUtil.readDataFromExcel("Sprint 9", 8, 1);
	
		// Penalty Users
		
		String PenaltyUsersSearchEdt = eUtil.readDataFromExcel("Sprint 9", 12, 1);
		
		// Merchants
		
		String MerchantsSearchEdt = eUtil.readDataFromExcel("Sprint 9", 16, 1);
		String MerchantNameEdt = eUtil.readDataFromExcel("Sprint 9", 20, 1);
		String MerchantJoinedDateEdt = eUtil.readDataFromExcel("Sprint 9", 21, 1);
		String MerchantEmailEdt = eUtil.readDataFromExcel("Sprint 9", 22, 1);
		String MerchantAddressEdt = eUtil.readDataFromExcel("Sprint 9", 23, 1);
		String MerchantsGcExpiryTimeEdt = eUtil.readDataFromExcel("Sprint 9", 24, 1);
		String MerchantsPhoneNumberEdt = eUtil.readDataFromExcel("Sprint 9", 25, 1);
		//
		String MerchantsEditMerchantsNameEdt = eUtil.readDataFromExcel("Sprint 9", 29, 1);		
		String MerchantEditJoinedDateEdt = eUtil.readDataFromExcel("Sprint 9", 30, 1);
		String MerchantEditEmailEdt = eUtil.readDataFromExcel("Sprint 9", 31, 1);
		String MerchantEditAddressEdt = eUtil.readDataFromExcel("Sprint 9", 32, 1);
		String MerchantEditGcExpiryTimeEdt = eUtil.readDataFromExcel("Sprint 9", 33, 1);
		String MerchantEditPhoneNumberEdt = eUtil.readDataFromExcel("Sprint 9", 34, 1);
		
		Thread.sleep(10000);
		
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getGoldPricesLnk().click();
		Thread.sleep(4000);
		GoldPricesPage GPPage = new GoldPricesPage(driver);
		Thread.sleep(2000);
		GPPage.getGoldPricesSearchEdt().sendKeys(SearchEdt);
		Thread.sleep(4000);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys(EnterDate);
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys(StartTime);
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys(EndTime);
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);			
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
			
		Thread.sleep(3000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys(EnterDate);
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys("10:00:00");
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys("11:00:00");
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);	

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		GPPage.getGoldPricesFilterBtn().click();
		Thread.sleep(4000);
		GPPage.getGPEnterDateEdt().sendKeys("09-08-2024");
		Thread.sleep(2000);
		GPPage.getGPStartTimeEdt().sendKeys(StartTime);
		Thread.sleep(2000);
		GPPage.getGPEndTimeEdt().sendKeys(EndTime);
		Thread.sleep(2000);
		GPPage.getGPSearchBtn().click();
		Thread.sleep(15000);
		GPPage.getGPRefreshBtn().click();
		Thread.sleep(4000);	
		
		driver.navigate().refresh();

		// Penalty Users
		
		Thread.sleep(4000);	
		DBPage.getUsersDrpDwn().click();
		Thread.sleep(4000);
		UsersPage UPage = new UsersPage(driver);
		UPage.getPenaltyUsersLnk().click();
		Thread.sleep(4000);
		Users_PenaltyUsers UPUPage = new Users_PenaltyUsers(driver);
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersSearchEdt().sendKeys(PenaltyUsersSearchEdt);
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersSearchEdt().clear();
		Thread.sleep(4000);
		UPUPage.getPenaltyUsersFilterBtn().click();
		Thread.sleep(4000);
		UPUPage.getSelectSchemeLnk().click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Gold Plus']")).click();
		Thread.sleep(4000);
		UPUPage.getFilterSearchBtn().click();
		Thread.sleep(4000);
		UPUPage.getFiltersRefreshBtn().click();
		Thread.sleep(4000);
		UPUPage.getFilterCloseBtn().click();
		Thread.sleep(4000);
		
		/*
		UPUPage.getPenaltyUsersInfoBtn().click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		*/
		
		Thread.sleep(4000);
		driver.navigate().refresh();

		// Merchants
		
		Thread.sleep(4000);
		DBPage.getGiftCardsDrpDwn().click();
		Thread.sleep(4000);
		GiftCardsPage GCPage = new GiftCardsPage(driver);
		GCPage.getMerchantsLnk().click();
		Thread.sleep(4000);
		GiftCards_MerchantsPage GCMPage = new GiftCards_MerchantsPage(driver);
		Thread.sleep(4000);
		GCMPage.getMerchantsSearchEdt().sendKeys(MerchantsSearchEdt);
		Thread.sleep(4000);
		GCMPage.getMerchantsSearchEdt().clear();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		GCMPage.getMerchantsAddMerchantsBtn().click();
		Thread.sleep(4000);
		GiftCards_AddMerchantsPage GCAMPage = new GiftCards_AddMerchantsPage(driver);
		Thread.sleep(4000);
		GCAMPage.getMerchantNameEdt().sendKeys(MerchantNameEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantJoinedDateEdt().sendKeys(MerchantJoinedDateEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantEmailEdt().sendKeys(MerchantEmailEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantAddressEdt().sendKeys(MerchantAddressEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsGcExpiryTimeEdt().sendKeys(MerchantsGcExpiryTimeEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsPhoneNumberEdt().sendKeys(MerchantsPhoneNumberEdt);
		Thread.sleep(4000);
		GCAMPage.getMerchantsAddBtn().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		GCMPage.getMerchantsEditBtn().click();
		Thread.sleep(4000);
		GiftCards_EditGiftCardsMerchantsPage GCEMPage = new GiftCards_EditGiftCardsMerchantsPage(driver);
		Thread.sleep(4000);
		GCEMPage.getMerchantsEditMerchantsNameEdt().sendKeys(MerchantsEditMerchantsNameEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditJoinedDateEdt().sendKeys(MerchantEditJoinedDateEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditEmailEdt().sendKeys(MerchantEditEmailEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditAddressEdt().sendKeys(MerchantEditAddressEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditGcExpiryTimeEdt().sendKeys(MerchantEditGcExpiryTimeEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditPhoneNumberEdt().sendKeys(MerchantEditPhoneNumberEdt);
		Thread.sleep(4000);
		GCEMPage.getMerchantEditUpdateBtn().click();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		/*
		GCAMPage.getMerchantsCloseBtn().click();
		Thread.sleep(4000);
		GCMPage.getMerchantsNextPageBtn().click();
		Thread.sleep(4000);
		GCMPage.getMerchantsPrevPageBtn().click();
		Thread.sleep(4000);
		
		*/
	}
	
	
}