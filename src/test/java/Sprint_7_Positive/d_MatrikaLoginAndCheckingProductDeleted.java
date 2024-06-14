package Sprint_7_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import genericUtility.BaseClass_Matrika;

public class d_MatrikaLoginAndCheckingProductDeleted extends BaseClass_Matrika{

	@Test
	public void b_loginAndProductCheckingTest() throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700);");
		Thread.sleep(2000);
		String FirstElement = driver.findElement(By.xpath("(//div[@class='col-6 col-md-2 mb-4 ng-star-inserted'])[1]")).getText();
		
		if(FirstElement.contains("EditChains"))
		{
			System.out.println("Product Not Deleted");
		}
		else 
		{
			System.out.println("Product Deleted Successfully");
		}
	}
	
}
