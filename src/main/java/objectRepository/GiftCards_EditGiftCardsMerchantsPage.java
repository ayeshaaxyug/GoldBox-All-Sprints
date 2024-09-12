package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCards_EditGiftCardsMerchantsPage 
{

	//Finding WebElements by using @FindBy Annotation
	
	@FindBy(xpath="//h1[.='Update Merchant']/../following-sibling::div//input[@placeholder='Enter Merchant Name']")private WebElement MerchantsEditMerchantsNameEdt;
	
	@FindBy(xpath ="//h1[.='Update Merchant']/../following-sibling::div//input[@formcontrolname='joinedon']") private WebElement MerchantEditJoinedDateEdt;
	
	@FindBy(xpath="//h1[.='Update Merchant']/../following-sibling::div//input[@placeholder='Enter Email']")private WebElement MerchantEditEmailEdt;
	
	@FindBy(xpath ="//h1[.='Update Merchant']/../following-sibling::div//input[@placeholder='Enter Address']") private WebElement MerchantEditAddressEdt;

	@FindBy(xpath="//h1[.='Update Merchant']/../following-sibling::div//input[@placeholder='Enter GC Expiry Time']")private WebElement MerchantEditGcExpiryTimeEdt;
	
	@FindBy(xpath="//h1[.='Update Merchant']/../following-sibling::div//input[@placeholder='Enter phone number']")private WebElement MerchantEditPhoneNumberEdt;
	
	@FindBy(xpath ="//button[.='Update']") private WebElement MerchantEditUpdateBtn;
	
	@FindBy(xpath="//h1[.='Update Merchant']/..//button[@aria-label='Close']")private WebElement MerchantEditCloseBtn;
	
	//Create a constructor to initilise these elements
	
	public GiftCards_EditGiftCardsMerchantsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Provide getters to access these variables

	public WebElement getMerchantsEditMerchantsNameEdt() {
		return MerchantsEditMerchantsNameEdt;
	}

	public WebElement getMerchantEditJoinedDateEdt() {
		return MerchantEditJoinedDateEdt;
	}

	public WebElement getMerchantEditEmailEdt() {
		return MerchantEditEmailEdt;
	}

	public WebElement getMerchantEditAddressEdt() {
		return MerchantEditAddressEdt;
	}

	public WebElement getMerchantEditGcExpiryTimeEdt() {
		return MerchantEditGcExpiryTimeEdt;
	}

	public WebElement getMerchantEditPhoneNumberEdt() {
		return MerchantEditPhoneNumberEdt;
	}

	public WebElement getMerchantEditUpdateBtn() {
		return MerchantEditUpdateBtn;
	}

	public WebElement getMerchantEditCloseBtn() {
		return MerchantEditCloseBtn;
	}

	//Business Libraries

	public void GiftCards_EditGiftCardsMerchantsPage(WebDriver driver) throws InterruptedException
	{

		Thread.sleep(2000);
		MerchantsEditMerchantsNameEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditJoinedDateEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditEmailEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditAddressEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditGcExpiryTimeEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditPhoneNumberEdt.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditUpdateBtn.sendKeys(null);
		Thread.sleep(2000);
		MerchantEditCloseBtn.sendKeys(null);
	
	}
	
}