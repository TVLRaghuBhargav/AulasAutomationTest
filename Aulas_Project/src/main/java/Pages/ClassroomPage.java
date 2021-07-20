package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class ClassroomPage extends TestBase
{
	//Actions ac;
	@FindBy(xpath="//div[text()='Classrooms']")
	WebElement PageText;
	@FindBy(xpath="//span[text()='Create New Class']")
	WebElement CreateClassButton;
	@FindBy(xpath="(//div[contains(@class,'m')]/input)[1]")
	WebElement ClassNameField;
	@FindBy(xpath="(//div[contains(@class,'m')]/input)[2]")
	WebElement SectionField;
	@FindBy(xpath="(//input[contains(@class,'ant-input')])[3]")
	WebElement StreamField;
	@FindBy(xpath="//button[@type='button']/span[text()='Create']")
	WebElement Createbutton;
	@FindBy(xpath="//span[text()='Add Now']")
	WebElement AddNowbutton;
	@FindBy(xpath="//span[text()='Create']")
	WebElement CreateSubjectbutton;
	@FindBy(xpath="//input[contains(@class,'ant')]")
	WebElement AddSubject;
	@FindBy(xpath="//div[text()='+ Add Another Subject']")
	WebElement AddanotherSubjectClick;
	@FindBy(xpath="//input[contains(@class,'ant')][2]")
	WebElement AddSubjectName;
	@FindBy(xpath="(//span[text()='Create'])[2]")
	WebElement Create1;
	@FindBy(xpath="((//div[contains(@class,'flex')])[57]/div/following::div[1])[1]")
	WebElement Clickanyclass;
	@FindBy(xpath="//span[text()='Browse']")
	WebElement ClickBrowser;
	@FindBy(xpath="(//div[contains(@class,'flex')])[3]/div[2]")
	WebElement ClickClass;
	@FindBy(xpath="//span[text()='Add to Section']")
	WebElement AddSectionButton;
	@FindBy(xpath="//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath="//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath="//span[text()='Edit Curriculum']")
	WebElement EditCurriculum;
	@FindBy(xpath="(//div[contains(@class,'content')])[2]/div/div")
	WebElement ClickSubject;
	@FindBy(xpath="//div[@class='text-mdl']")
	WebElement EditIcon;
	@FindBy(xpath="//div[@class='text-mdl m-l-20']")
	WebElement DeleteICon;
	@FindBy(xpath="//input[contains(@class,'ant-input')]")
	WebElement Edittextfield;
	@FindBy(xpath="//span[text()='Save']")
	WebElement Savebutton;
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement ConfirmButton;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbutton;
	@FindBy(xpath="(//div[contains(@class,'cursor')])[2]")
	WebElement LeftArrowbutton;
	@FindBy(xpath="(//span[text()='Add Students'])[2]")
	WebElement AddStudentsbutton;
	@FindBy(xpath="(//div[contains(@class,'m-t-30')]/child::div[contains(@class,'icon-round-bg__grey')])[1]")
	WebElement Editicon;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper']")
	WebElement SearchName;
	@FindBy(xpath="(//div[contains(@class,'holder')])[2]/div/div[text()='fhgfhhfg']")
	WebElement SelStudentName;
	@FindBy(xpath="//div[text()='View Details']")
	WebElement ViewDetailslink;
	@FindBy(xpath="//span[contains(@class,'ant-input-affix-wrapper-lg')]")
	WebElement SearchStuName;
	@FindBy(xpath="//span[text()='Add']")
	WebElement Addbutton;
	
	@FindBy(xpath="(//input[contains(@class,'input-text-grey')])[2]")
	WebElement EditSecField;
	@FindBy(xpath="//div[contains(@class,'icon-square-bg__yellow')]")
	WebElement Transferbtn;
	@FindBy(xpath="//div[contains(@class,'icon-square-bg__red')]")
	WebElement Deletebtn;
	@FindBy(xpath="//input[@class='ant-select-selection-search-input']")
	WebElement SelectClassDrpDwn;
	@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']/div[4]")
	WebElement SelClass;
	@FindBy(xpath="//input[@type='text']")
	WebElement Sectionname;
	@FindBy(xpath="//span[text()='Transfer']")
	WebElement Transferbutton;
	@FindBy(xpath="//span[text()='Delete']")
	WebElement Deletebttn;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[1]")
	WebElement StandardClass;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[2]")
	WebElement SelSectionClass;
	@FindBy(xpath="//div[text()='6-A3']")
	WebElement SelectSection;
	
	@FindBy(xpath="(//div[contains(@class,'sequare__batch')]/child::div[contains(@class,'icon-round-bg__grey')])[2]")
	WebElement plusicon;
	@FindBy(xpath="//input[contains(@class,'input-text-grey')]")
	WebElement NewSecName;
	@FindBy(xpath="//span[text()='Clone']")
	WebElement CloneButton;
	@FindBy(xpath="//span[text()='Edit Chapters']")
	WebElement EditChapters;
	@FindBy(xpath="//div[text()='+ Add Chapter']")
	WebElement AddChapter;
	@FindBy(xpath="(//input[contains(@class,'input-text-grey')])[53]")
	WebElement AddChapterName;
	@FindBy(xpath="//span[text()='Done']")
	WebElement DoneButton;
	@FindBy(xpath="//span[text()='Delete']")
	WebElement Deletebutton;
	@FindBy(xpath="//span[text()='Transfer']")
	WebElement Transferbttn;
	
	public ClassroomPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateClassroomtext()
	{
		return PageText.getText();
	}
	
	public void validateCreateaClass(String className,String section,String stream) throws InterruptedException
	{
		Thread.sleep(5000);
		CreateClassButton.click();
		ClassNameField.sendKeys(className);
		SectionField.sendKeys(section);
		StreamField.sendKeys(stream);
		Createbutton.click();
		Thread.sleep(3000);
		AddNowbutton.click();
		Thread.sleep(3000);
		CreateSubjectbutton.click();
		Thread.sleep(2000);
		AddSubject.sendKeys("Maths");
		Thread.sleep(2000);
		AddanotherSubjectClick.click();
		AddSubjectName.sendKeys("Physics");
		Thread.sleep(2000);
		Create1.click();
	}
	
	public void validateClass() throws InterruptedException
	{
		Clickanyclass.click();
		Thread.sleep(3000);
		ClickBrowser.click();
		Thread.sleep(3000);
		ClickClass.click();
		AddSectionButton.click();
		Thread.sleep(3000);
		List<WebElement> li =driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int size = li.size();
		System.out.println(li);
		for(int i=0;i<size;i++)
		{
			li.get(i).click();
		}
		YesButton.click();
		//NoButton.click();
	}
	
	public void validateEditcurriculum() throws InterruptedException
	{
		Thread.sleep(5000);
		EditCurriculum.click();
		ClickSubject.click();
//		EditIcon.click();
//		Thread.sleep(3000);
//		Edittextfield.clear();
//		Edittextfield.sendKeys("maths");
//		Savebutton.click();	
	}
	
	public void validateEditChapters() throws InterruptedException
	{
		Thread.sleep(5000);
		EditChapters.click();
		Thread.sleep(2000);
		AddChapter.click();
		Thread.sleep(4000);
		AddChapterName.sendKeys("Testing");
		Thread.sleep(4000);
		List<WebElement> e = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int s = e.size();
		System.out.println(e);
		for(int i=0;i<s;i++)
		{
			e.get(i).click();
		}
		DoneButton.click();
		//Deletebutton.click();
		LeftArrowbutton.click();
	}
	public void validateDeleteSubject() throws InterruptedException
	{
		Thread.sleep(5000);
		DeleteICon.click();
		ConfirmButton.click();
		LeftArrowbutton.click();
	}
	
	public void validateAddStudent() throws InterruptedException
	{
		Thread.sleep(5000);
		Clickanyclass.click();
		Thread.sleep(2000);
		AddStudentsbutton.click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper']"));
		Actions ac =  new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("fhgfhhfg").build().perform();
		//ele.sendKeys("f");
		//Thread.sleep(5000);
    	SelStudentName.click();
//		Thread.sleep(2000);
		Addbutton.click();
		Thread.sleep(2000);
		ViewDetailslink.click();
//		//SearchStuName.sendKeys("");
//		Thread.sleep(4000);
//		List<WebElement> e = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
//		int s = e.size();
//		System.out.println(e);
//		for(int i=0;i<s;i++)
//		{
//			e.get(i).click();
//		}
		Transferbtn.click();
		Thread.sleep(2000);
		StandardClass.click();
		Thread.sleep(2000);
		SelClass.click();
		Thread.sleep(2000);
		SelSectionClass.click();
		Thread.sleep(2000);
		SelectSection.click();
		Thread.sleep(2000);
		Transferbutton.click();
		//LeftArrowbutton.click();
		//Cancelbutton.click();
		//Deletebttn.click();
		//Deletebtn.click();
		//Transferbttn.click();
	}
	public void validateEdit() throws InterruptedException
	{
		Thread.sleep(5000);
		Editicon.click();
		EditSecField.sendKeys("A3");
		Savebutton.click();
		Thread.sleep(3000);
		Editicon.click();
		Thread.sleep(3000);
		Transferbtn.click();
		SelectClassDrpDwn.click();
		Thread.sleep(2000);
		SelClass.click();
		Sectionname.sendKeys("A");
		Transferbutton.click();

	}
	public void validateAddbuttonClasses() throws InterruptedException
	{
		Thread.sleep(4000);
		plusicon.click();
		Thread.sleep(4000);
		List<WebElement>ele =driver.findElements(By.xpath("//div[@class='ant-row']/div/div/label/span/input"));
		int sel= ele.size();
		System.out.println(sel);
		for(int i=0;i<sel;i++)
		{
			ele.get(i).click();
		}
		NewSecName.sendKeys("7-D");
		//   CloneButton.click();
		//Cancelbutton.click();
	}
	

}
