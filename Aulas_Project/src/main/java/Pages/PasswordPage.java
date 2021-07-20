package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class PasswordPage extends TestBase
{

	
	@FindBy(xpath="//div[@class='m-t-5']/input")
	WebElement EmailID;
	@FindBy(xpath="//button[contains(@class,'ant-btn')]/span[text()='Send']")
	WebElement SendButton;
	@FindBy(xpath="//div[text()='Go Back']")
	WebElement BackLogin;
	public PasswordPage()
	{
	  PageFactory.initElements(driver, this);
	}
	public HomePage login(String email)
	{
		EmailID.sendKeys(email);
		SendButton.click();
		return new HomePage();
	}
	public void Gobacklogin()
	{
		BackLogin.click();
	}
	
	

}
