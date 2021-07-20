package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class AssignmentsPage extends TestBase
{
	@FindBy(xpath="//h3[text()='Assignments']")
	WebElement Assignmenttext; 
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateButton;
	@FindBy(xpath="//div[@class='ant-tabs-tab']/div")
	WebElement DraftButton;
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement PublishedButton;
	@FindBy(xpath="//span[contains(@class,'anticon-filter')]")
	WebElement FilterIcon;
	@FindBy(xpath="(//div[contains(@class,'assignmentItem')]/div[2]/div[6]/div/span)[1]")
	WebElement MenuDots;
	@FindBy(xpath="//div[text()=' Details']/span")
	WebElement Detailsbtn;
	@FindBy(xpath="//div[text()=' Clone']")
	WebElement CloneBtn;
	@FindBy(xpath="//div[@class='ant-select-selector']/span/input")
	WebElement SelStabdardDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[1]/div/div/div/div")
	WebElement ClassStnadard;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]/span/span/span/span[@class='ant-input-affix-wrapper']")
	WebElement SubjectDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div")
	WebElement SelSubject;
	
	public AssignmentsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateText()
	{
		return Assignmenttext.getText();
	}
	public void validateFilter() throws InterruptedException
	{
		Thread.sleep(2000);
		FilterIcon.click();
		SelStabdardDrpDwn.click();
	}
	
	
	
	

}
