package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class UserPage extends TestBase
{
   @FindBy(xpath="(//span[contains(@class,'input')]/span)[1]/span[1]/input")
   WebElement Searchname;
   @FindBy(xpath="//span[contains(@class,'input')]/button")
   WebElement Searchbutton;
   @FindBy(xpath="//span[@class='ant-input-suffix']/span")
   WebElement xbutton;
   @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
   WebElement Operdropdown;
   @FindBy(xpath="//div[contains(@class,'rc-virtual')]//child::div[@class='rc-virtual-list-holder-inner']/div[2]")
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
   @FindBy(xpath="//button[@type='button']/span[text()='Add Teacher']")
   WebElement AddEleButton;
   
   public UserPage()
   {
	   PageFactory.initElements(driver, this);
   }
   public UserPage enter(String name) throws InterruptedException 
   {
	   Thread.sleep(8000);
	   Searchname.sendKeys(name);
	   Searchbutton.click();
	   return new UserPage();
   }
   public void crossbutton(String na) throws InterruptedException
   {
	   Thread.sleep(8000);
	   Searchname.sendKeys(na);
	   Searchbutton.click();
	   xbutton.click();
   }
   public void EditScreenbutton()
   {
	   editscreen.click();
	   WebElement edittextfield=driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[3]"));
	   edittextfield.clear();
	   edittextfield.sendKeys("mnjsfn");
   }
   public void Xiconbutton()
   {
	   xicon.click();
	   cancel.click();
	   
   }
   public void Addbuttono() throws InterruptedException
   {
	   Thread.sleep(8000);
	   AddButton.click();
	   EnterFname.sendKeys("Raghu");
	   GenderDropdown.click();
	   selectGender.click();
	   bloodDropdown.click();
	   SelectBloodgrp.click();
	   EnterEmail.sendKeys("abcdef@mailinator.com");
	   EnterPhNo.sendKeys("9877898547");
	   EnterHouseNo.sendKeys("22-10-4");
	   EnterCity.sendKeys("Tenali");
	   EnterState.sendKeys("AP");
	   EnterPincode.sendKeys("522201");
	   ClickCheck.click();
	   EmeConName.sendKeys("Dileep");
	   EmeConNumber.sendKeys("7777445522");
	   SelPer.click();
	   SelDropdown.click();
	   AllowAccess.click();
	   AddEleButton.click();
	
   }
   
   public UserAddInfPage operdropdown()
   {
	   Operdropdown.click();
	   return new UserAddInfPage();
   }
}