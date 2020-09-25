package smartSignUpPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartAppointmentLoginPageObject {
	
	@FindBy(xpath="//div[@id='navBar']//a[@id='docsMegaMenu']//strong[@class='text-primary']'] ")
	public WebElement  Login ;
	@FindBy(name="email")
	public WebElement emailid;
	
	@FindBy(name="Next")
	public WebElement next;
	
	
	@FindBy(name="password")
	public WebElement  userpassword;
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	public WebElement submit;
	
	public void SetUserEmail(String useremail)
	{
		emailid.sendKeys("krooappptester@gmail.com");
	}
	public void ClickOnNext()
	{
		next.click();
	}
	
	

}
