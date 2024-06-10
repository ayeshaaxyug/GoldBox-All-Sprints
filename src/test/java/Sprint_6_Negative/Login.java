package Sprint_6_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://stg-fms.goldbox.gold/signin");
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("soumya@gmail.com",Keys.TAB,"goldsikka@2024",Keys.ENTER);
	}
	
}
