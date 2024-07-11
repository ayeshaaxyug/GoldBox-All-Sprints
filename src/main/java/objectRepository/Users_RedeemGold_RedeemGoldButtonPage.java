package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users_RedeemGold_RedeemGoldButtonPage {

	//Finding WebElements Using @FindBy Annotations
	
	  @FindBy(xpath ="//button[@aria-label='Close']") private WebElement CloseBtn;
	  
	  @FindBy(xpath ="//input[@placeholder='Enter Payment Id']") private WebElement PaymentIdEdt;
	  
	  @FindBy(xpath ="//input[@placeholder='Enter GST']") private WebElement GstEdt;
	  
	  @FindBy(xpath ="//h1[.='Upload Required Documents']/../following-sibling::div//input[@type='file']") private WebElement AddImageLnk;
	  
	  @FindBy(xpath ="(//input[@type='file'])[1]") private WebElement AddImageLnk1;
	  
	  @FindBy(xpath ="(//input[@type='file'])[2]") private WebElement AddImageLnk2;

      @FindBy(xpath ="//button[.='Upload']") private WebElement UploadBtn;
	  
	//Create a constructor to initilise these elements
	    
		public Users_RedeemGold_RedeemGoldButtonPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
	//Provide getters to access these variables
	  
		public WebElement getCloseBtn() {
			return CloseBtn;
		}

		public WebElement getPaymentIdEdt() {
			return PaymentIdEdt;
		}

		public WebElement getGstEdt() {
			return GstEdt;
		}

		public WebElement getAddImageLnk() {
			return AddImageLnk;
		}
		
	    public WebElement getAddImageLnk1() {
				return AddImageLnk1;
			}

	    public WebElement getAddImageLnk2() {
				return AddImageLnk2;
			}

		public WebElement getUploadBtn() {
			return UploadBtn;
		}

	//Business Libraries
		
	    public void Users_RedeemGoldUsersPage_m(WebDriver driver)throws InterruptedException
			{
				Thread.sleep(2000);
				CloseBtn.click();
				Thread.sleep(2000);
				PaymentIdEdt.click();
				Thread.sleep(2000);
				GstEdt.click();
				Thread.sleep(2000);
				AddImageLnk.click();
				Thread.sleep(2000);
				AddImageLnk1.click();
				Thread.sleep(2000);
				AddImageLnk2.click();
				Thread.sleep(2000);
				UploadBtn.click();
				
			} 
}