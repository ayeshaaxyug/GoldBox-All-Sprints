package Sprint_6_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.Events_EventsRequestsPage;
import objectRepository.Events_EventsRequests_EventDetailsPage;

public class g_EventsAllActions extends FMS_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	
	@Test
	public void eventsAllActions_Test() throws Exception
	{
		String SearchValue = eUtility.readDataFromExcel("Sprint-6 Negative", 14, 1);
		
		//1 Search Feild
		
		Thread.sleep(4000);
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getEventsLnk().click();
		Events_EventsRequestsPage eerPage = new Events_EventsRequestsPage(driver);
		eerPage.getSearchEdt().sendKeys(SearchValue);
		Thread.sleep(2000);
		String EventNotFound = driver.findElement(By.xpath("//h5[.='No matching records found']")).getText();
		wUtility.takeScreenShot(driver, EventNotFound);
		Thread.sleep(2000)
		
		//2 Next -- Prev Button
		
		Thread.sleep(4000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
		eerPage.getNextPageBtn().click();
		Thread.sleep(2000);
		//eerPage.getPreviousPageBtn().click();
		//Thread.sleep(2000);
		
		//3 Info 
		
		Thread.sleep(4000);		
		driver.navigate().refresh();		
		Thread.sleep(2000);
		eerPage.getActionInfoBtn().click();
		Thread.sleep(2000);
		Events_EventsRequests_EventDetailsPage evfPage = new Events_EventsRequests_EventDetailsPage(driver);
		evfPage.getSearchEdt().sendKeys(SearchValue);
		Thread.sleep(2000);
	    WebElement EmptyEvent = driver.findElement(By.xpath("//div[@class='table-responsive']"));
	    String a = EmptyEvent.getText(); 
		Thread.sleep(2000); 
		System.out.println(a);
		if (a.isEmpty()) 
		{
			System.out.println("Event is EmptyEvent");
			wUtility.takeScreenShot(driver, a);
			
		}
		else {
			System.out.println("Event is not Empty");
		}
		
		//4 
		
		Thread.sleep(4000);		
		driver.navigate().back();		
		Thread.sleep(2000);
		eerPage.getStatusUpdateDrpDwn().click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Cancelled']")).click();
	}
	
	
}
