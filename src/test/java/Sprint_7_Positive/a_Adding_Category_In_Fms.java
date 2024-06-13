package Sprint_7_Positive;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;
import objectRepository.Ecommerce_BrandsPage;
import objectRepository.Ecommerce_Brands_AddBrandPage;
import objectRepository.Ecommerce_Brands_UpdateBrandPage;
import objectRepository.Ecommerce_CategoryPage;
import objectRepository.Ecommerce_Category_AddCategoryPage;
import objectRepository.Ecommerce_Category_EditCategoryPage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;
import objectRepository.LoginPage;

public class a_Adding_Category_In_Fms extends FMS_BaseClass {

	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	@Test
	public void a_addingCategorySubCategoryAndProductTest() throws Exception, IOException
	{
		String USERNAME = pUtility.readDataFromPropertyFile("username");
	    String PASSWORD = pUtility.readDataFromPropertyFile("password");
		String CategoryName = "Chains"+jUtil.getRandomNum();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		String EditCategoryName = "EditChains"+jUtil.getRandomNum();
		String SubCategoryName = "Chains"+jUtil.getSingleRandomnumber();
		String EditSubCategoryName = "Chains"+jUtil.getRandomNum();
		String BrandName = "BrandName"+jUtil.getRandomNum();
		String EditBrandName = "BrandName"+jUtil.getRandomNum();
		String EImagePath = eUtil.readDataFromExcel("ImagePath", 1, 1);
		String ProductName = "Ring", VaPercent = "10", Price = "35000", Size = "8", Weight = "6", Description = "Good Product", AddSize = "9", AddWeight = "4", EditSize = "5", EditWeight = "3";
		String PEditProductName = "Bangles", PEditVaPercent = "12", PEditPrice = "36000", PEditSize = "10", PEditWeight = "10", PEditDescription = "Excellent Product";
		
//	    Thread.sleep(2000);
//	    LoginPage lPage = new LoginPage(driver);
//	    Thread.sleep(1000);
//	    lPage.loginToApplication(USERNAME, PASSWORD);
//	    Thread.sleep(6000);
//		System.out.println("---Login successfully---");
		
        Thread.sleep(3000);
        
        DashboardPage dbPage = new DashboardPage(driver);
        dbPage.getEcommerceDrpDwn().click();
        Thread.sleep(2000);
        EcommercePage ecPage = new EcommercePage(driver);
        ecPage.getCategoryLnk().click();
        Thread.sleep(2000);
        Ecommerce_CategoryPage eccPage = new Ecommerce_CategoryPage(driver);
        eccPage.getAddCategoryBtn().click();
        Thread.sleep(3000);
        Ecommerce_Category_AddCategoryPage eccacPage = new Ecommerce_Category_AddCategoryPage(driver);
        eccacPage.addCategory(driver, CategoryName,ImagePath);
        Thread.sleep(2000);
        eccPage.clickOnParticularCategoryEditBtn(driver, CategoryName);
        Thread.sleep(2000);
        Ecommerce_Category_EditCategoryPage eccecPage = new Ecommerce_Category_EditCategoryPage(driver);
        eccecPage.editCategory(driver, EditCategoryName, ImagePath);
        Thread.sleep(2000);
        eccPage.clickOnParticularCategoryBootStrapBtn(driver, EditCategoryName);
        Thread.sleep(2000);
        eccPage.clickOnParticularCategoryBootStrapBtn(driver, EditCategoryName);
        Thread.sleep(2000);
        ecPage.getSubCategoryLnk().click();
        Thread.sleep(2000);
        Ecommerce_SubCategoryPage ecscPage = new Ecommerce_SubCategoryPage(driver);
        ecscPage.getAddSubCategoryBtn().click();
        Thread.sleep(2000);
        Ecommerce_SubCategory_AddSubcategoryPage ecscascPage = new Ecommerce_SubCategory_AddSubcategoryPage(driver);
        ecscascPage.addSubCategory(driver, EditCategoryName, SubCategoryName, ImagePath);
        Thread.sleep(2000);
        ecscPage.clickOnParticularEditBtn(driver, SubCategoryName);
        Thread.sleep(2000);
        Ecommerce_SubCategory_EditSubcategoryPage esesPage = new Ecommerce_SubCategory_EditSubcategoryPage(driver);
        esesPage.editingSubCategory(driver, EditCategoryName, EditSubCategoryName, ImagePath);
        Thread.sleep(2000);
	    Ecommerce_SubCategoryPage escPage = new Ecommerce_SubCategoryPage(driver);
	    escPage.clickOnParticularCategoryBootstrapBtn(driver, EditSubCategoryName);
		Thread.sleep(2000);
	    escPage.clickOnParticularCategoryBootstrapBtn(driver, EditSubCategoryName);
	    Thread.sleep(2000);
        ecPage.getBrandsLnk().click();
        Thread.sleep(2000);
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        Thread.sleep(2000);
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName, ImagePath);
        Thread.sleep(2000);
        driver.navigate().refresh();
//        Thread.sleep(2000);
//        
//       // Upto here Done But Added Brand is Not Displaying
//       
//        ebPage.clickOnParticularBrandEditBtn(driver, BrandName);
//        
//        Ecommerce_Brands_UpdateBrandPage ecesPage = new Ecommerce_Brands_UpdateBrandPage(driver);
//        ecesPage.updatingBrand(driver, EditBrandName,ImagePath);
//        
//        Thread.sleep(2000);
//        
//        ebPage.clickOnParticularBrandBootStrapBtn(driver, EditBrandName);
//        
//        Thread.sleep(2000);
//	    
//        ebPage.clickOnParticularBrandBootStrapBtn(driver, EditBrandName);
        
        ecPage.getProductsLnk().click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        
        
	}
	
}
