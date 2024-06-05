package Sprint_6_Negative;

import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.AllUsers_ReferredUserListPage;
import objectRepository.DashboardPage;
import objectRepository.UsersPage;
import objectRepository.Users_UserList_AllUsersPage;

public class b_UsersAllActions extends FMS_BaseClass {

	WebDriverUtility wUtil = new WebDriverUtility();
	ExcelFileUtility eUtil = new ExcelFileUtility();
	JavaUtility jUtil = new JavaUtility();
	
	@Test
	public void userAllActionsTest() throws Exception
	{
		String UserListAllUserSearchValue = eUtil.readDataFromExcel("Sprint-6 Negative", 32, 1);
		String UserId = eUtil.readDataFromExcel("Sprint-6 Negative", 33, 1);
		String ReferredUserListSearchValue = eUtil.readDataFromExcel("Sprint-6 Negative", 34, 1);
		
		DashboardPage dbPage = new DashboardPage(driver);
		dbPage.getUsersDrpDwn().click();
		Thread.sleep(2000);
		UsersPage uPage = new UsersPage(driver);
		uPage.clickOnUserListLnk();
		Thread.sleep(2000);
		Users_UserList_AllUsersPage uulalPage = new Users_UserList_AllUsersPage(driver);
		uulalPage.getSearchEdt().sendKeys(UserListAllUserSearchValue);
		Thread.sleep(2000);
		uulalPage.clickOnReferredUserViewBtn(driver, UserId);
		Thread.sleep(2000);
		AllUsers_ReferredUserListPage aurulPage = new AllUsers_ReferredUserListPage(driver);
		aurulPage.getSearchEdt().sendKeys(ReferredUserListSearchValue);
		Thread.sleep(2000);
		uPage.clickOnUserListLnk();
		Thread.sleep(2000);
		uulalPage.clickOnActionsInfoBtn(driver, UserId);
		Thread.sleep(2000);
	}
	
}
