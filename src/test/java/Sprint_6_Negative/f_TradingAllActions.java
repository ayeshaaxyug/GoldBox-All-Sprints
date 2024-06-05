package Sprint_6_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.TradingPage;

public class f_TradingAllActions extends FMS_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
//	PropertyFileUtility pUtility = new PropertyFileUtility();
	
	@Test
	public void Trading()throws Exception
	{
		
		String SearchValue = eUtility.readDataFromExcel("Sprint-6 Negative", 14, 1);
		
		//1 SearchFeild
		
		Thread.sleep(4000);
		DashboardPage dPage = new DashboardPage(driver);
		dPage.getTradingLnk().click();
		Thread.sleep(2000);
		TradingPage trdPage = new TradingPage(driver);
		trdPage.getSearchEdt().sendKeys(SearchValue);
		Thread.sleep(2000);
		String TradingNotFound = driver.findElement(By.xpath("//h5[.='No records found']")).getText();
		wUtility.takeScreenShot(driver, TradingNotFound);
		Thread.sleep(2000);
		
		//2 Export To Excel
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		trdPage.getExportToExcelBtn().click();
		Thread.sleep(2000);
		String TradExportToExcel = driver.findElement(By.xpath("//div[@aria-label='Excel sheet downloaded']")).getText();
		wUtility.takeScreenShot(driver, TradExportToExcel);
		Thread.sleep(2000);
		
		//3 Next -- Prev Buttons
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		trdPage.getNextlnk().click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		trdPage.getPrevLnk().click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		trdPage.getCheckBoxBtn().click();
				
	}
	
}
