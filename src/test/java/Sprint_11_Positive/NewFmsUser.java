package Sprint_11_Positive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFmsUser {
	
	
	WebDriverUtility wUtil = new WebDriverUtility(); 
	JavaUtility jUtil = new JavaUtility();
	
	
    @Test
    public void NewUser() throws InterruptedException
    {
    	
    	WebDriverUtility wu=new WebDriverUtility(); 
    	
	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        Thread.sleep(2000);
        driver.get("http://automation-testing.goldbox.gold/signin");
        Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Enter your email address']")).sendKeys("ayeshashaik@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("ayesha@123");
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//button[.=' Sign In ']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[.='Dashboard']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[.='Ecommerce']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[.='Category']")).click();
        Thread.sleep(8000);
    	driver.quit();
    	Thread.sleep(2000);
    	
    	
    }
    
    
}