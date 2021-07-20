package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class StudentPage extends TestBase
{
	 @FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	  WebElement Operdropdown;
	  @FindBy(xpath="//div[contains(@class,'rc-virtual')]//child::div[contains(@class,'holder-inner')]/div[4]")
	  WebElement OperDropClick;
	  @FindBy(xpath="(//span[contains(@class,'input')]/span)[1]/span[1]/input")
	  WebElement Searchname;
	  @FindBy(xpath="//span[contains(@class,'input')]/button")
	  WebElement Searchbutton;
	  @FindBy(xpath="//span[@class='ant-input-suffix']/span")
	  WebElement xbutton;
	  @FindBy(xpath="(//button[contains(@class,'btn')])[4]/span")
	  WebElement AddButton;
	  @FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	  WebElement SelClassDropDown;
	  @FindBy(xpath="(//div[@class='rc-virtual-list'])[2]//child::div[7]")
	  WebElement SelClass;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[1]")
	  WebElement EnterFname;
	  @FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	  WebElement GenderDropdown;
	  @FindBy(xpath="//div[contains(@class,'ant-select')]/div[text()='Male']")
	  WebElement selectGender;
	  @FindBy(xpath="(//div[@class='ant-select-selector'])[4]")
	  WebElement bloodDropdown;
	  @FindBy(xpath="//div[contains(@class,'ant-select')]/div[text()='O+']")
	  WebElement SelectBloodgrp;
	  @FindBy(xpath="//div[@class='ant-picker']/div/input")
	  WebElement DateOfBirth;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[2]")
	  WebElement EnterEmail;
	  @FindBy(xpath="(//input[@class='PhoneInputInput'])[1]")
	  WebElement EnterPhNo;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[3]")
	  WebElement EnterFatheName;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[4]")
	  WebElement EnterFatherOcc;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[5]")
	  WebElement EnterMotherName;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[6]")
	  WebElement EnterMotherOcc;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[7]")
	  WebElement EnterGarEmail;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[8]")
	  WebElement EnterFamIncome;
	  @FindBy(xpath="(//input[@class='PhoneInputInput'])[2]")
	  WebElement EnterGarPhNO;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[9]")
	  WebElement EnterHouseNo;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[10]")
	  WebElement EnterCity;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[11]")
	  WebElement EnterState;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[12]")
	  WebElement EnterPincode;
	  @FindBy(xpath="//input[@type='checkbox']")
	  WebElement ClickCheck;
	  @FindBy(xpath="(//div[@class='r-c-sb']/input)[17]")
	  WebElement EmeConName;
	  @FindBy(xpath="(//input[@class='PhoneInputInput'])[3]")
	  WebElement EmePNO;
	  @FindBy(xpath="//div[@class='ant-collapse-item']/div[1]")
	  WebElement Assign;
	  @FindBy(xpath="(//div[@class='ant-select-selector'])[5]")
	  WebElement AssigntoClassDpDn;
	  @FindBy(xpath="//div[contains(@class,'ant-select')]/div[text()='4 - d']")
	  WebElement SelAssinClass;
	  @FindBy(xpath="(//div[contains(@class,'r-c-c')])[2]/button[1]")
	  WebElement AddStuButton;
	  @FindBy(xpath="//button[contains(@class,'cancel-btn')]")
	  WebElement AddCanButton;
	  @FindBy(xpath="//button[contains(@class,'ant-btn-link')]")
	  WebElement StuRegReq;
	  @FindBy(xpath="//input[@class='ant-input']")
	  WebElement SearchName;
	  @FindBy(xpath="//button[contains(@class,'search-button')]")
	  WebElement Searchicon;
	  @FindBy(xpath="//span[@class='ant-input-suffix']")
	  WebElement searchXIcon;
	  @FindBy(xpath="//div[contains(@class,'ant-select-single')]")
	  WebElement pendingdpdn;
	  @FindBy(xpath="//div[contains(@class,'ant-select-item')]/div[text()='Pending']")
	  WebElement PEnClick;
	  @FindBy(xpath="(//button[@class='ant-btn m-r-5'])[1]/child::span[1]")
	  WebElement AppClick;
	  @FindBy(xpath="//div[contains(@class,'heading-left')]/div")
	  WebElement BackArrow;
	 
	  @FindBy(xpath="//div[@class='r-ac']/span[2]")
	  WebElement Menuicon;
	  //Edit Button
	  @FindBy(xpath="((//div[@class='ant-row'])[2]//child::div/div/div//following::div[9]/span[contains(@class,'anticon')])[1]")
	  //Delete Button
	  //@FindBy(xpath="((//div[@class='ant-row'])[2]//child::div/div/div//following::div[9]/span[contains(@class,'anticon')])[24]")
	  WebElement EditIcon;
	  //pagenavigation
	  @FindBy(xpath="//li[@class='ant-pagination-next']")
	  WebElement NavigationClick;
	 
	 
	  public StudentPage()
	  {
	  PageFactory.initElements(driver, this);
	  }
	  public void Menuicon() throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(10000);
	  OperDropClick.click();
	  NavigationClick.click();
	 // Menuicon.click();
	 // EditIcon.click();
	  }
	 
	  public StudentPage enter(String Stuname) throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(10000);
	  OperDropClick.click();
	  Thread.sleep(10000);
	  Searchname.sendKeys(Stuname);
	  Searchbutton.click();
	  return new StudentPage();
	  }
	  public void crossbutton(String Stuname) throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(10000);
	  OperDropClick.click();
	  Thread.sleep(10000);
	  Searchname.sendKeys(Stuname);
	  Searchbutton.click();
	  xbutton.click();
	  }
	  public void SelectClass(String Fname,String Dob,String Email,String Pno,String FatName,String FatOCc,String MotName,String MotOcc,String GarEmail,String GartPhNO,String FamIncome,String Hno,String City,String State,String Pin,String EmgContact,String EmgPhno) throws InterruptedException
	  {
	  Thread.sleep(5000);
	  Operdropdown.click();
	  Thread.sleep(8000);
	  OperDropClick.click();
	  Thread.sleep(8000);
	  SelClassDropDown.click();
	  Thread.sleep(8000);
	  SelClass.click();
	  Thread.sleep(8000);
	  AddButton.click();
	  Thread.sleep(5000);
	  EnterFname.sendKeys(Fname);
	  GenderDropdown.click();
	  selectGender.click();
	  bloodDropdown.click();
	  Thread.sleep(5000);
	  SelectBloodgrp.click();
	  DateOfBirth.sendKeys(Dob);
	  EnterEmail.sendKeys(Email);
	  EnterPhNo.sendKeys(Pno);
	  EnterFatheName.sendKeys(FatName);
	  EnterFatherOcc.sendKeys(FatOCc);
	  EnterMotherName.sendKeys(MotName);
	  EnterMotherOcc.sendKeys(MotOcc);
	  EnterGarEmail.sendKeys(GarEmail);
	  EnterFamIncome.sendKeys(FamIncome);
	  EnterGarPhNO.sendKeys(GartPhNO);
	  EnterHouseNo.sendKeys(Hno);
	  EnterCity.sendKeys(City);
	  EnterState.sendKeys(State);
	  EnterPincode.sendKeys(Pin);
	  ClickCheck.click();
	  EmeConName.sendKeys(EmgContact);
	  EmePNO.sendKeys(EmgPhno);
	  Thread.sleep(8000);
	  Assign.click();
	  AssigntoClassDpDn.click();
	  Thread.sleep(5000);
	  SelAssinClass.click();
	  AddStuButton.click();
	  }
	  public void Cancelbutton() throws InterruptedException
	  {

	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(5000);
	  OperDropClick.click();
	  Thread.sleep(5000);
	  AddButton.click();
	  Thread.sleep(5000);
	  AddCanButton.click();
	  }
	  public void StuRegReq() throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(5000);
	  OperDropClick.click();
	  StuRegReq.click();
	  SearchName.sendKeys("Fahd 4");
	  }
	  public void StureqCrossicon() throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(5000);
	  OperDropClick.click();
	  StuRegReq.click();
	  SearchName.sendKeys("Fahd 4");
	  searchXIcon.click();
	  pendingdpdn.click();
	  PEnClick.click();
	 
	  }
	  public void BackArrClick() throws InterruptedException
	  {
	  Thread.sleep(8000);
	  Operdropdown.click();
	  Thread.sleep(5000);
	  OperDropClick.click();
	  StuRegReq.click();
	  BackArrow.click();
	 
	  }

}
