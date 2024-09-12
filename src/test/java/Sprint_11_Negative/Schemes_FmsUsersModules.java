package Sprint_11_Negative;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.SettingsPage;
import objectRepository.Settings_AddFmsUserPage;
import objectRepository.Settings_EditFmsUsersPage;
import objectRepository.Settings_FmsUsersPage;
import objectRepository.Settings_Roles_AddRolePage;
import objectRepository.Settings_Roles_RolesListPage;
import objectRepository.Settings_Roles_UpdateRolePage;
import objectRepository.ZScheme_SL_TenureInfoBtnPage;
import objectRepository.ZSchemes;
import objectRepository.ZSchemes_GoldPlusPlanUsersPage;
import objectRepository.ZSchemes_MyGoldPlanUsersPage;
import objectRepository.ZSchemes_PhysicalGoldUsersPage;
import objectRepository.ZSchemes_SL_AddSchemePage;
import objectRepository.ZSchemes_SL_EditSchemePage;
import objectRepository.ZSchemes_SchemesListPage;
import objectRepository.ZSchemes_Sl_AmountInfoBtnPage;

public class Schemes_FmsUsersModules extends FMS_BaseClass
{

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();

	@Test
	public void SchemesNegative() throws InterruptedException, IOException
	{
		
		String EnterMonths = eUtil.readDataFromExcel("Sprint 10", 15, 1);
		
		String EnterAmount = eUtil.readDataFromExcel("Sprint 10", 18, 1);
		
		String SearchEdit = eUtil.readDataFromExcel("Sprint 10", 22, 1);
		String UpiNameEdt = eUtil.readDataFromExcel("Sprint 10", 23, 1);
		
		String PhoneNumberEdt = eUtil.readDataFromExcel("Sprint 10", 24, 1);
		
		// Add Scheme
		String AddSchemeName = eUtil.readDataFromExcel("Sprint 10", 3, 1);
		String SelectCountry = eUtil.readDataFromExcel("Sprint 10", 4, 1);
		String CalculationType = eUtil.readDataFromExcel("Sprint 10", 5, 1);
		String Description = eUtil.readDataFromExcel("Sprint 10", 6, 1);
		// edit Scheme
		String EditSchemeName = eUtil.readDataFromExcel("Sprint 10", 9, 1);
		String EditSelectCountry = eUtil.readDataFromExcel("Sprint 10", 10, 1);
		String EditCalculationType = eUtil.readDataFromExcel("Sprint 10", 11, 1);
		String EditDescription = eUtil.readDataFromExcel("Sprint 10", 12, 1);
		
		// Fms Users
		
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

		
		Thread.sleep(20000);
		
		WebDriverUtility wu=new WebDriverUtility(); 
		Thread.sleep(4000);
		DashboardPage DBPage = new DashboardPage(driver);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(3000);
		ZSchemes ZSPage = new ZSchemes(driver);		
		Thread.sleep(5000);
		
		//1
		
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSchemes_SchemesListPage ZSSLPage = new ZSchemes_SchemesListPage(driver);
		Thread.sleep(3000);
		ZSSLPage.getSchemeListSearchEdt().sendKeys(SearchEdit);
		
		WebElement SearchEditFeild = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
		Thread.sleep(2000);
		if (SearchEditFeild.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enetr Calculation Type");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//2
		
		DBPage.getSchemesDrpDwn().click();
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSSLPage.getAddSchemeBtn().click();

		ZSchemes_SL_AddSchemePage ZSLADDSPage = new ZSchemes_SL_AddSchemePage(driver);
		Thread.sleep(3000);

		ZSLADDSPage.getAddBtn().click();
		
		WebElement EnterTitle = driver.findElement(By.xpath("//div[@aria-label='Please Enter title']"));
		Thread.sleep(2000);
		if (EnterTitle.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Title");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//3
		
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSSLPage.getAddSchemeBtn().click();
		Thread.sleep(3000);
		ZSLADDSPage.getSchemeNameEdt().sendKeys(AddSchemeName);
		Thread.sleep(3000);
		ZSLADDSPage.getAddBtn().click();
		Thread.sleep(3000);
				
		WebElement AddSchemesName = driver.findElement(By.xpath("//div[@aria-label='Please Enter scheme_calculation_type']"));
		Thread.sleep(2000);
		if (AddSchemesName.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enetr Calculation Type");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//4
		
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSSLPage.getAddSchemeBtn().click();
		Thread.sleep(3000);
		ZSLADDSPage.getSchemeNameEdt().sendKeys(AddSchemeName);
		Thread.sleep(3000);
		ZSLADDSPage.getCalculationDrpDwn().sendKeys(CalculationType);
		Thread.sleep(3000);
		ZSLADDSPage.getAddBtn().click();
		Thread.sleep(3000);
				
		WebElement AddDescriptions = driver.findElement(By.xpath("//div[@aria-label='please Enter description']"));
		Thread.sleep(2000);
		if (AddDescriptions.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Description");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//5
		
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSSLPage.getAddSchemeBtn().click();
		Thread.sleep(3000);
		ZSLADDSPage.getSchemeNameEdt().sendKeys(AddSchemeName);
		Thread.sleep(3000);
		ZSLADDSPage.getCalculationDrpDwn().sendKeys(CalculationType);
		Thread.sleep(3000);
		ZSLADDSPage.getDescriptionEdt().sendKeys(Description);
		Thread.sleep(3000);
		ZSLADDSPage.getAddBtn().click();
		Thread.sleep(3000);
				
		WebElement AddCountrys = driver.findElement(By.xpath("//div[@aria-label='Please Enter Country']"));
		Thread.sleep(2000);
		if (AddCountrys.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Country");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//6
	
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(3000);
		ZSSLPage.getAddSchemeBtn().click();
		Thread.sleep(3000);
		ZSLADDSPage.getCountryDrpDwn().sendKeys(SelectCountry);
		Thread.sleep(3000);
		ZSLADDSPage.getCalculationDrpDwn().sendKeys(CalculationType);
		Thread.sleep(3000);
		ZSLADDSPage.getDescriptionEdt().sendKeys(Description);
		Thread.sleep(3000);
		ZSLADDSPage.getAddBtn().click();
		Thread.sleep(3000);
				
		WebElement SchemeName = driver.findElement(By.xpath("//div[@aria-label='Please Enter title']"));
		Thread.sleep(2000);
		if (SchemeName.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Scheme Name");
		} 
		else 
		{
            System.out.println("Scheme Added Successfully");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//7
		
		Thread.sleep(3000);
		ZSSLPage.getTenureListInfoBtn().click();
		ZScheme_SL_TenureInfoBtnPage ZSSLTIBPage = new ZScheme_SL_TenureInfoBtnPage(driver);
		Thread.sleep(3000);
		ZSSLTIBPage.getAddBtn().click();
		Thread.sleep(3000);
		
		WebElement TenureMonth = driver.findElement(By.xpath("//div[@aria-label='Please Enter Tenure']"));
		Thread.sleep(2000);
		if (TenureMonth.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Tenure Months");
		} 
		else 
		{
            System.out.println("Tenure Month Added Successfully");
		}

		Thread.sleep(8000);
		
		//8
		
		ZSSLTIBPage.getEnterMonthsEdt().sendKeys(EnterMonths);
		Thread.sleep(3000);
		ZSSLTIBPage.getAddBtn().click();
		Thread.sleep(3000);

		WebElement TenureMonthExists = driver.findElement(By.xpath("//div[@aria-label='Tenure Already Existed With This Scheme ']"));
		Thread.sleep(2000);
		if (TenureMonthExists.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Tenure Already Exists");
		} 
		else 
		{
            System.out.println("Tenure Month Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//9
		
		Thread.sleep(2000);
		ZSSLPage.getAmountListInfoBtn().click();
		Thread.sleep(3000);
		ZSchemes_Sl_AmountInfoBtnPage ZSSLAIBPage = new ZSchemes_Sl_AmountInfoBtnPage(driver);
		Thread.sleep(3000);
		ZSSLAIBPage.getAddBtn().click();
		Thread.sleep(3000);
		
		WebElement TenureAmount = driver.findElement(By.xpath("//div[@aria-label='Please Enter Amount']"));
		Thread.sleep(2000);
		if (TenureAmount.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Tenure Amount");
		} 
		else 
		{
            System.out.println("Tenure Amount Added Successfully");
		}

		Thread.sleep(8000);	

		//10
		
		Thread.sleep(2000);
		ZSSLAIBPage.getEnterAmountEdt().sendKeys(EnterAmount);
		Thread.sleep(2000);
		ZSSLAIBPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement TenureAmountExists = driver.findElement(By.xpath("//div[@aria-label='Amount Already Existed With This Scheme ']"));
		Thread.sleep(2000);
		if (TenureAmountExists.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Tenure Already Exists");
		} 
		else 
		{
            System.out.println("Tenure Month Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//11
		
		Thread.sleep(2000);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSSLPage.getSchemeListEditBtn().click();
		Thread.sleep(3000);
		ZSchemes_SL_EditSchemePage ZSSLESPage = new ZSchemes_SL_EditSchemePage(driver);
		Thread.sleep(3000);
		ZSSLESPage.getEditSchemeNameEdt().clear();
		Thread.sleep(3000);
		ZSSLESPage.getUpdateBtn().click();
		Thread.sleep(2000);
		
		WebElement SchemeNameEdit = driver.findElement(By.xpath("//div[@aria-label='Scheme Updated Successfully']"));
		Thread.sleep(2000);
		if (SchemeNameEdit.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enetr Title");
		} 
		else 
		{
            System.out.println("Scheme Updated Successfully");
		}
		
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		
		//14

		Thread.sleep(2000);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(2000);
		ZSSLPage.getSchemeListEditBtn().click();
		Thread.sleep(2000);
		ZSSLESPage.getEditDescriptionEdt().clear();
		Thread.sleep(3000);
		ZSSLESPage.getUpdateBtn().click();
		Thread.sleep(3000);
		
		WebElement EditDescriptionn = driver.findElement(By.xpath("//div[@aria-label='Scheme Updated Successfully']"));
		Thread.sleep(2000);
		if (EditDescriptionn.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enetr Description");
		} 
		else 
		{
            System.out.println("Scheme Updated Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
       //16
	
		Thread.sleep(2000);
	    DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getGoldPlusPlanUsersLnk().click();
		Thread.sleep(2000);
		ZSchemes_GoldPlusPlanUsersPage ZSGPPUsersPage = new ZSchemes_GoldPlusPlanUsersPage(driver);
		Thread.sleep(3000);
		ZSGPPUsersPage.getGPPUSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		
		WebElement NoRecordFound = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (NoRecordFound.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "No Records Found ");
		} 
		else 
		{
            System.out.println("Searched Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//17
		
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(3000);
		ZSPage.getMyGoldPlanUsersLnk().click();
		Thread.sleep(3000);
		ZSchemes_MyGoldPlanUsersPage ZSMGPUsersPage = new ZSchemes_MyGoldPlanUsersPage(driver);
		Thread.sleep(3000);
		ZSMGPUsersPage.getMyGoldPlanSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		
		WebElement NoRecordFoundMy = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (NoRecordFoundMy.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Found");
		} 
		else 
		{
            System.out.println("Searched Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//18
		
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(3000);
		ZSPage.getPhysicalGoldUsersLnk().click();
		Thread.sleep(3000);
		ZSchemes_PhysicalGoldUsersPage ZSPGUsersPage = new ZSchemes_PhysicalGoldUsersPage(driver);
		Thread.sleep(3000);
		ZSPGUsersPage.getPhysicalGoldUsersSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		
		WebElement NoRecordFoundPG = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (NoRecordFoundPG.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "No Records Found ");
		} 
		else 
		{
            System.out.println("Searched Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//19
		
		DBPage.getSettingsDrpDwn().click();
		SettingsPage SPage = new SettingsPage(driver);
		Thread.sleep(2000);
		SPage.getRolesLnk().click();
		Thread.sleep(2000);
		Settings_Roles_RolesListPage SRLPage = new Settings_Roles_RolesListPage(driver);
		Thread.sleep(2000);
		SRLPage.getSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);
		
		WebElement Roles = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (Roles.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "No Records Found ");
		} 
		else 
		{
            System.out.println("Searched Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//20
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getRolesLnk().click();
		Thread.sleep(2000);
		SRLPage.getAddRoleBtn().click();
		Thread.sleep(2000);		
		Settings_Roles_AddRolePage SARPage = new Settings_Roles_AddRolePage(driver);
		Thread.sleep(2000);
		SARPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement AddRoles = driver.findElement(By.xpath("//div[@aria-label='please enter title']"));
		Thread.sleep(2000);
		if (AddRoles.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter Title");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//21
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getRolesLnk().click();
		Thread.sleep(2000);
		SRLPage.getEditBtn().click();
		Thread.sleep(2000);
		Settings_Roles_UpdateRolePage SERPage = new Settings_Roles_UpdateRolePage(driver);
		Thread.sleep(2000);
		SERPage.getTitleEdt().clear();
		Thread.sleep(2000);
		SERPage.getUpdateBtn().click();
		Thread.sleep(2000);
		
		WebElement EditRoles = driver.findElement(By.xpath("//div[@aria-label='Role updated successfully']"));
		Thread.sleep(2000);
		if (EditRoles.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enter title");
		} 
		else 
		{
            System.out.println("Updated Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//22
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		Settings_FmsUsersPage SFUPage = new Settings_FmsUsersPage(driver);
		Thread.sleep(2000);
		SFUPage.getSearchEdt().sendKeys(SearchEdit);
		Thread.sleep(2000);

		WebElement FmsUsers = driver.findElement(By.xpath("//h5[.='No records found']"));
		Thread.sleep(2000);
		if (FmsUsers.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "No Records Found ");
		} 
		else 
		{
            System.out.println("Searched Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//23
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		Settings_AddFmsUserPage SAFUPage = new Settings_AddFmsUserPage(driver);
		Thread.sleep(2000);
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement FmsUsersName = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (FmsUsersName.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	    //24
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(2000);
		Thread.sleep(2000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement FmsUsersMobile = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (FmsUsersMobile.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

        //25
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(2000);
		SAFUPage.getMailEdt().sendKeys(AddEmail);
		Thread.sleep(2000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement FmsUsersEmail = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (FmsUsersEmail.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//26
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getAddFmsUsersBtn().click();
		SAFUPage.getEnterNameEdt().sendKeys(AddFullName);
		Thread.sleep(2000);
		SAFUPage.getMobilenUmberEdt().sendKeys(AddPhonenUmber);
		Thread.sleep(2000);
		SAFUPage.getMailEdt().sendKeys(AddEmail);
		Thread.sleep(2000);
		SAFUPage.getPasswordEdt().sendKeys(AddPassword);
		Thread.sleep(3000);
		SAFUPage.getAddBtn().click();
		Thread.sleep(2000);
		
		WebElement FmsUsersPassword = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (FmsUsersPassword.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//27
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		Settings_EditFmsUsersPage SEFUPage = new Settings_EditFmsUsersPage(driver);
		SEFUPage.getEnterFullNameEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		

		WebElement EditFmsUserName = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (EditFmsUserName.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//28
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		SEFUPage.getMobileNumberEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		

		WebElement EditFmsUserMN = driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (EditFmsUserMN.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//29
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		SEFUPage.getEmailEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		

		WebElement EditFmsUserEE= driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (EditFmsUserEE.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		//30
		
		DBPage.getSettingsDrpDwn().click();
		Thread.sleep(2000);
		SPage.getFmsUsersLnk().click();
		Thread.sleep(2000);
		SFUPage.getEditBtn().click();
		SEFUPage.getPasswordEdt().clear();
		Thread.sleep(2000);
		SEFUPage.getUpdateBtn().click();
		Thread.sleep(2000);		

		WebElement EditFmsUserPE= driver.findElement(By.xpath("//div[@aria-label='All fields required']"));
		Thread.sleep(2000);
		if (EditFmsUserPE.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "All Feilds Rae Required");
		} 
		else 
		{
            System.out.println("Added Successfully");
		}

		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	
}

//12
/*
Thread.sleep(2000);
ZSSLPage.getSchemeListEditBtn().click();
Thread.sleep(2000);
ZSSLESPage.getEditCountryDrpDwn().sendKeys();
Thread.sleep(3000);
ZSSLESPage.getUpdateBtn().click();
Thread.sleep(2000);

WebElement Country = driver.findElement(By.xpath("//div[@aria-label='Please Enter Country']"));
Thread.sleep(2000);
if (Country.isDisplayed()) 
{
	wUtil.takeScreenShot(driver, "Please Enetr Country Name");
} 
else 
{
    System.out.println("Scheme Updated Successfully");
}

Thread.sleep(8000);

//13

Thread.sleep(2000);
ZSSLPage.getSchemeListEditBtn().click();
Thread.sleep(2000);
ZSSLESPage.getEditCalculationDrpDwn().clear();
Thread.sleep(3000);
ZSSLESPage.getUpdateBtn().click();
Thread.sleep(2000);

WebElement Calculation = driver.findElement(By.xpath("//div[@aria-label='Please Enter Scheme Calculation Type']"));
Thread.sleep(2000);
if (Calculation.isDisplayed()) 
{
	wUtil.takeScreenShot(driver, "Please Enetr Calculation");
} 
else 
{
    System.out.println("Scheme Updated Successfully");
}

Thread.sleep(8000);

	
		//15
				
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		DBPage.getSchemesDrpDwn().click();
		Thread.sleep(2000);
		ZSPage.getSchemeListLnk().click();
		Thread.sleep(2000);
		ZSSLPage.getSchemeListEditBtn().click();
		Thread.sleep(3000);
		ZSSLESPage.getEditSchemeNameEdt().clear();
		Thread.sleep(3000);
		ZSSLESPage.getEditCountryDrpDwn().clear();
		Thread.sleep(3000);
		ZSSLESPage.getEditCalculationDrpDwn().clear();
		Thread.sleep(3000);
		ZSSLESPage.getEditDescriptionEdt().clear();
		Thread.sleep(3000);
		ZSSLESPage.getUpdateBtn().click();
		Thread.sleep(2000);
		
		WebElement Edit = driver.findElement(By.xpath("//div[@aria-label='Please Enter Title']"));
		Thread.sleep(2000);
		if (Edit.isDisplayed()) 
		{
			wUtil.takeScreenShot(driver, "Please Enetr Title");
		} 
		else 
		{
            System.out.println("Scheme Updated Successfully");
		}

		Thread.sleep(8000);
		
*/