package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Events_EventRequest_StatusUpdatePage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//span[.='Initiated']")private WebElement InitiatedLnk;
    
    @FindBy(xpath="//span[.='Approved']")private WebElement ApprovedLnk;
    
    @FindBy(xpath="//span[.='Not Approved']")private WebElement NotApprovedLnk;
    
    @FindBy(xpath="//span[.='Cancelled']")private WebElement CancelledLnk;
    
    @FindBy(xpath="//span[.='Completed']")private WebElement CompletedLnk;
    
    @FindBy(xpath="//span[.='Deleted']")private WebElement DeleteLnk;
  
  
	//Rule-3:Create a constructor to initilise these elements
    
	public Events_EventRequest_StatusUpdatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables
	
	public WebElement getInitiatedLnk() {
		return InitiatedLnk;
	}


	public WebElement getApprovedLnk() {
		return ApprovedLnk;
	}


	public WebElement getNotApprovedLnk() {
		return NotApprovedLnk;
	}


	public WebElement getCancelledLnk() {
		return CancelledLnk;
	}


	public WebElement getCompletedLnk() {
		return CompletedLnk;
	}


	public WebElement getDeleteLnk() {
		return DeleteLnk;
	}
	
	//Create Business Libraries
	
}
