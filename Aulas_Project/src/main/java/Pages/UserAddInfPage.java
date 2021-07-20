package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class UserAddInfPage extends TestBase 
{
	   @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	   WebElement Operdropdown;
	   @FindBy(xpath="//div[contains(@class,'rc-virtual')]//child::div[@class='rc-virtual-list-holder-inner']/div[3]")
	   WebElement OperDropClick;
	   @FindBy(xpath="(//button[contains(@class,'btn')])[4]/span")
	   WebElement AddButton;
	   @FindBy(xpath="(//div[@class='ant-row'])[2]/div[5]/div")
	   WebElement editscreen;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[3]")
	   WebElement edittextfield;
	   @FindBy(xpath="(//div[contains(@class,'ant')]/div/span[2])[8]")
	   WebElement xicon;
	   Alert Ac;
	   @FindBy(xpath="//button[@class='ant-btn']")
	   WebElement cancel;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[1]")
	   WebElement EnterFname;
	   @FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	   WebElement GenderDropdown;
	   @FindBy(xpath="(//div[text()='Female'])[1]")
	   WebElement selectGender;
	   @FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	   WebElement bloodDropdown;
	   @FindBy(xpath="(//div[text()='A-'])[1]")
	   WebElement SelectBloodgrp;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[2]")
	   WebElement EnterEmail;
	   @FindBy(xpath="(//input[@class='PhoneInputInput'])[1]")
	   WebElement EnterPhNo;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[3]")
	   WebElement EnterHouseNo;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[4]")
	   WebElement EnterCity;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[5]")
	   WebElement EnterState;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[6]")
	   WebElement EnterPincode;
	   @FindBy(xpath="//input[@type='checkbox']")
	   WebElement ClickCheck;
	   @FindBy(xpath="(//div[@class='r-c-sb']/input)[11]")
	   WebElement EmeConName;
	   @FindBy(xpath="(//input[@class='PhoneInputInput'])[2]")
	   WebElement EmeConNumber;
	   @FindBy(xpath="(//div[@class='ant-select-selector'])[4]")
	   WebElement SelPer;
	   @FindBy(xpath="(//div[text()='None'])[2]")
	   WebElement SelDropdown;
	   @FindBy(xpath="//button[@class='ant-switch']")
	   WebElement AllowAccess;
	   @FindBy(xpath="(//div[contains(@class,'r-c-c')])[2]/button[1]")
	   WebElement AddEleButton;
	   @FindBy(xpath="//button[contains(@class,'cancel-btn')]")
	   WebElement AddCanButton;
	   @FindBy(xpath="//div[@class='ant-picker']/div/input")
	   WebElement dateofbirth;
	   
	   
	   public UserAddInfPage()
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void AddInfoPage(String Fname,String Email,String Pno,String Hno,String City,String State,String Pin,String Dob) throws InterruptedException
	   {
	   Thread.sleep(8000);
	   Operdropdown.click();
	   Thread.sleep(5000);
	   OperDropClick.click();
	   Thread.sleep(5000);
	   AddButton.click();
	   Thread.sleep(8000);
	   EnterFname.sendKeys(Fname);
	   GenderDropdown.click();
	   selectGender.click();
	   bloodDropdown.click();
	   SelectBloodgrp.click();
	   dateofbirth.sendKeys(Dob);
	   EnterEmail.sendKeys(Email);
	   EnterPhNo.sendKeys(Pno);
	   EnterHouseNo.sendKeys(Hno);
	   EnterCity.sendKeys(City);
	   EnterState.sendKeys(State);
	   EnterPincode.sendKeys(Pin);
	   ClickCheck.click();
	   EmeConName.sendKeys("Dileep");
	   EmeConNumber.sendKeys("7777445522");
	   SelPer.click();
	   SelDropdown.click();
	   AllowAccess.click();
	   AddEleButton.click();
	   }
	  
	   public void Cancelbutton() throws InterruptedException
	   {

	   Thread.sleep(8000);
	   Operdropdown.click();
	   Thread.sleep(5000);
	   OperDropClick.click();
	   Thread.sleep(5000);
	   AddButton.click();
	   AddCanButton.click();
	   }
}
