package Sprint_7_Positive_Negative;

import org.testng.annotations.Test;

import genericUtility.FMS_BaseClass;
import objectRepository.DashboardPage;
import objectRepository.EcommercePage;

public class c_Deleting_Category_In_Fms extends FMS_BaseClass {

	@Test
	public void deletingCategorySubCategoryProductInFmsTest() throws Exception
	{
		Thread.sleep(2000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEcommerceDrpDwn().click();
		Thread.sleep(2000);
		EcommercePage ecPage = new EcommercePage(driver);
		ecPage.getCategoryLnk();
		
	}
	
}
