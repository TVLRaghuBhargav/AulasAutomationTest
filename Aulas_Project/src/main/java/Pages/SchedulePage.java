package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class SchedulePage extends TestBase
{
	Actions ac;
	@FindBy(xpath="//h3[text()='Time Table']")
	WebElement TimeTableText;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement SearchName;
	@FindBy(xpath="(//div[text()='anni teacher'])[1]")
	WebElement SelectTeacherName;
	@FindBy(xpath="//span[text()='All Classes']")
	WebElement AllClassesDropdown;
	@FindBy(xpath="(//div[contains(@class,'virtual')]/div)[7]")
	WebElement SelectOneclass;
	@FindBy(xpath="//div[contains(@class,'ant')]/span[contains(@class,'ellipsis')]")
	WebElement SelectMenu;
	@FindBy(xpath="(//div[contains(@class,'bottomLeft')])/ul/li[1]")
	WebElement EditButton;
	@FindBy(xpath="(//div[contains(@class,'bottomLeft')])[2]/ul/li[2]")
	WebElement DeleteButton;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbutton;
	////AddSchedule/////
	@FindBy(xpath="//span[text()='Add Schedule']")
	WebElement AddScheduleButton;
	@FindBy(xpath="(//div[contains(@class,'borderLessSelect')])[2]/div")
	WebElement PickDays;
	@FindBy(xpath="(//input[contains(@class,'selection')])[3]")
	WebElement Modebutton;
	@FindBy(xpath="(//div[contains(@class,'rc-virtual-list-holder-inner')])[2]/div[2]")
	WebElement SelectMode;
	@FindBy(xpath="(//input[@type='search'])[5]")
	WebElement Searchnametext;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder-inner'])[2]/div[2]")
	WebElement SelTeacher;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[1]")
	WebElement StartTime;
	@FindBy(xpath="(//div[@class='ant-picker-panel-container'])[1]/child::div/div/div/child::ul[1]/li/div[text()='02']")
	WebElement Startmin;
	@FindBy(xpath="(//div[@class='ant-picker-panel-container'])[1]/child::div/div/div/child::ul[2]/li/div[text()='40']")
	WebElement EndMin;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[2]")
	WebElement EndTime;
	@FindBy(xpath="(//div[@class='ant-picker-panel-container'])[2]/child::div/div/div/child::ul[1]/li/div[text()='03']")
	WebElement SEmin;
	@FindBy(xpath="(//div[@class='ant-picker-panel-container'])[2]/child::div/div/div/child::ul[2]/li/div[text()='30']")
	WebElement ESTime;
	@FindBy(xpath="(//span[text()='Ok'])[1]")
	WebElement OK;
	@FindBy(xpath="(//span[text()='Ok'])[2]")
	WebElement OAK;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement Subname;
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[2]")
	WebElement ClassName;
	@FindBy(xpath="(//div[text()='Maths'])[2]")
    WebElement ClickSubName;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder-inner'])[5]/div/div")
	WebElement SelClassName;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbtn;
	@FindBy(xpath="//span[text()='Add to Schedule']")
	WebElement AddSchedulebtn;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder-inner'])[2]/div[2]")
	WebElement AddClassbtn;
	
	public SchedulePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateClassroomtext()
	{
		return TimeTableText.getText();
	}
	public void ValidateSearchname(String Searchname) throws InterruptedException
	{
		SearchName.sendKeys(Searchname);
		Thread.sleep(5000);
		SelectTeacherName.click();
	}
	public void validateClassesDrodpdown() throws InterruptedException
	{
		Thread.sleep(5000);
		AllClassesDropdown.click();
		Thread.sleep(2000);
		SelectOneclass.click();
		Thread.sleep(2000);
		SelectMenu.click();
		EditButton.click();
		Thread.sleep(2000);
		PickDays.click();
		driver.findElement(By.xpath("//div[text()='Monday']")).click();
		AddSchedulebtn.click();
		//AddClassbtn.click();
		//Cancelbutton.click();
		//DeleteButton.click();
        
	}
	public void validateAddSchedule() throws InterruptedException
	{
		Thread.sleep(3000);
		AddScheduleButton.click();	
		Thread.sleep(1000);
		PickDays.click();
		driver.findElement(By.xpath("//div[text()='Monday']")).click();
		Modebutton.click();
		Thread.sleep(4000);
		SelectMode.click();
		Searchnametext.sendKeys("Sumesh Teacher");
		//SelTeacher.sendKeys("Sumesh Teacher");
		Thread.sleep(4000);
		StartTime.click();
		Startmin.click();
		ac=new Actions(driver);
		ac.moveToElement(EndMin).click().build().perform();
		Thread.sleep(4000);
		OK.click();
		EndTime.click();
		Thread.sleep(4000);
		SEmin.click();
		//Thread.sleep(2000);
		ac=new Actions(driver);
		ac.moveToElement(ESTime).click().build().perform();
		Thread.sleep(4000);
		OAK.click();
		Subname.sendKeys("Maths");
		Thread.sleep(4000);
		ClickSubName.click();
		Thread.sleep(3000);
		ClassName.click();
		Thread.sleep(2000);
		SelClassName.click();
		AddSchedulebtn.click();
		//Cancelbtn.click();
	}
	

}
