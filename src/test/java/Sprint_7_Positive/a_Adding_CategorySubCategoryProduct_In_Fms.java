package Sprint_7_Positive;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
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
import objectRepository.Ecommerce_Product_DescriptionPage;
import objectRepository.Ecommerce_ProductsListPage;
import objectRepository.Ecommerce_Products_AddProductSizesPage;
import objectRepository.Ecommerce_Products_AddProductStonePage;
import objectRepository.Ecommerce_Products_AddProductsPage;
import objectRepository.Ecommerce_Products_ProductSizesPage;
import objectRepository.Ecommerce_Products_ProductStonePage;
import objectRepository.Ecommerce_SubCategoryPage;
import objectRepository.Ecommerce_SubCategory_AddSubcategoryPage;
import objectRepository.Ecommerce_SubCategory_EditSubcategoryPage;
import objectRepository.Ecommerce_UpdateProductDetailsPage;
import objectRepository.Ecommerce_UpdateProductSizesPage;
import objectRepository.Ecommerce_UpdateProductStonePage;
import objectRepository.LoginPage;

@Listeners(genericUtility.ListnersImplementationClass.class)
public class a_Adding_CategorySubCategoryProduct_In_Fms extends FMS_BaseClass {

	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	WebDriverUtility wUtil = new WebDriverUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	
	//Fail
	
	@Test
	public void a_addingCategorySubCategoryAndProductInFmsTest() throws Exception
	{
		String CategoryName = "Chains"+jUtil.getRandomNum();
		String ImagePath = eUtil.readDataFromExcel("ImagePath", 0, 1);
		String EditCategoryName = "EditChains"+jUtil.getRandomNum();
		String SubCategoryName = "Chains"+jUtil.getSingleRandomnumber();
		String EditSubCategoryName = "EditChains"+jUtil.getRandomNum();
		String BrandName = "BrandName"+jUtil.getRandomNum();
		String EditBrandName = "BrandName"+jUtil.getRandomNum();
		String EditImagePath = eUtil.readDataFromExcel("ImagePath", 1, 1);
		String ProductName = "Ring", VaPercent = "10", Price = "35000", Size = "8", Weight = "6", Description = "Good Product", AddSize = "9", AddWeight = "4", EditSize = "5", EditWeight = "3";
		String PEditProductName = "Bangles", PEditVaPercent = "12", PEditPrice = "40000", PEditSize = "10", PEditWeight = "10", PEditDescription = "Excellent Product";
		String StoneName = "Black Pearl", StoneColour = "Black", StonePrice = "2000", NoOfStones = "2";
		String EditStoneName = "White Pearl", EditStoneColour = "White", EditPrice = "4000", EditNoOfStones = "3";
		
		
        Thread.sleep(10000);
        
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
        eccPage.clickOnParticularCategoryBootStrapBtnToDisableParticularCategory(driver, EditCategoryName);
        Thread.sleep(2000);
        eccPage.clickOnParticularCategoryBootStrapBtnToEnableParticularCategory(driver, EditCategoryName);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        dbPage.getEcommerceDrpDwn().click();
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
	    escPage.clickOnParticularSubCategoryBootstrapBtnToDisableParticularSubCategory(driver, EditSubCategoryName);
		Thread.sleep(2000);
		escPage.clickOnParticularSubCategoryBootstrapBtnToEnableParticularSubCategory(driver, EditSubCategoryName);
		Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        dbPage.getEcommerceDrpDwn().click();
	    Thread.sleep(2000);
        ecPage.getBrandsLnk().click();
        Thread.sleep(2000);
        Ecommerce_BrandsPage ebPage = new Ecommerce_BrandsPage(driver);
        ebPage.getAddBrandBtn().click();
        Thread.sleep(2000);
        Ecommerce_Brands_AddBrandPage eabPage = new Ecommerce_Brands_AddBrandPage(driver);
        eabPage.addingBrand(driver, BrandName, ImagePath);
        Thread.sleep(2000);
        ebPage.clickOnParticularBrandEditBtn(driver, BrandName);
        Thread.sleep(2000);
        Ecommerce_Brands_UpdateBrandPage ecesPage = new Ecommerce_Brands_UpdateBrandPage(driver);
        ecesPage.updatingBrand(driver, EditBrandName,ImagePath);
        Thread.sleep(2000);
        ebPage.clickOnParticularBrandBootStrapBtnToDisable(driver, EditBrandName);
        Thread.sleep(2000);
        ebPage.clickOnParticularBrandBootStrapBtnToEnable(driver, EditBrandName);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        dbPage.getEcommerceDrpDwn().click();
        Thread.sleep(2000);
        ecPage.getProductsLnk().click();
        Thread.sleep(2000);
        Ecommerce_ProductsListPage eplPage = new Ecommerce_ProductsListPage(driver);
        eplPage.getAddProductBtn().click();
        Thread.sleep(2000);
        Ecommerce_Products_AddProductsPage epapPage = new Ecommerce_Products_AddProductsPage(driver);
        epapPage.AddingProduct1(driver, EditCategoryName, EditSubCategoryName, EditBrandName, ProductName, VaPercent, Price, Size, Weight, Description, ImagePath);
        Thread.sleep(2000);
        eplPage.clickOnParticularProductWeightInfoBtn(driver, ProductName);
        Thread.sleep(2000);
        Ecommerce_Products_ProductSizesPage eppsPage = new Ecommerce_Products_ProductSizesPage(driver);
        eppsPage.getAddProductSizesBtn().click();
        Thread.sleep(2000);
        Ecommerce_Products_AddProductSizesPage eppasizePage = new Ecommerce_Products_AddProductSizesPage(driver);
        eppasizePage.addProductSize(EditSize, EditWeight);
        Thread.sleep(2000);
        eppsPage.clickOnParticularProductEditBtn(driver, ProductName, Size, Weight);
        Thread.sleep(2000);
        Ecommerce_UpdateProductSizesPage eupsPage = new Ecommerce_UpdateProductSizesPage(driver);
        eupsPage.editProductSize(PEditSize, PEditWeight);
        Thread.sleep(2000);
        eppsPage.clickOnFrstProductBootstrapBtnInProductSizePage(driver);
        Thread.sleep(2000);
        eppsPage.clickOnFrstProductBootstrapBtnInProductSizePage(driver);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        dbPage.getEcommerceDrpDwn().click();
        Thread.sleep(2000);
        ecPage.getProductsLnk().click();
        Thread.sleep(2000);
        eplPage.clickOnParticularProductStonesViewBtn(driver, ProductName);
        Thread.sleep(2000);
        Ecommerce_Products_ProductStonePage eppstonePage = new Ecommerce_Products_ProductStonePage(driver);
        eppstonePage.getAddProductStoneBtn().click();
        Thread.sleep(2000);
        Ecommerce_Products_AddProductStonePage epapsPage = new Ecommerce_Products_AddProductStonePage(driver);
        epapsPage.addingProductStone(StoneName, StoneColour, StonePrice, NoOfStones);
        Thread.sleep(2000);
        eplPage.clickOnParticularProductActionEdtBtn(driver, PEditProductName);
        Thread.sleep(2000);
        Ecommerce_UpdateProductStonePage eupStonePage = new Ecommerce_UpdateProductStonePage(driver);
        eupStonePage.editProductStone(EditStoneName, EditStoneColour, EditPrice, EditNoOfStones);
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        dbPage.getEcommerceDrpDwn().click();
        Thread.sleep(2000);
        ecPage.getProductsLnk().click();
        Thread.sleep(2000);
        eplPage.clickOnParticularProductDescriptionViewBtn(driver, ProductName);
        Thread.sleep(2000);
        Ecommerce_Product_DescriptionPage epdPage = new Ecommerce_Product_DescriptionPage(driver);
        epdPage.getUnderstandBtn().click();
        Thread.sleep(2000);
        eplPage.clickOnParticularProductActionEdtBtn(driver, ProductName);
        Thread.sleep(2000);
        Ecommerce_UpdateProductDetailsPage eupdPage = new Ecommerce_UpdateProductDetailsPage(driver);
        eupdPage.editProductDetailsSprint7(driver, EditCategoryName, EditSubCategoryName, EditBrandName, PEditProductName, PEditVaPercent, PEditPrice, PEditSize, PEditWeight, PEditDescription, EditImagePath);
        Thread.sleep(2000);
        eplPage.clickOnParticularProductBootStrapBtn(driver, PEditProductName);
        Thread.sleep(6000);
        eplPage.clickOnParticularProductBootStrapBtn(driver, PEditProductName);
        Thread.sleep(4000);
        
	}
	
}
