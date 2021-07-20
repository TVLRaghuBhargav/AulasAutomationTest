package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Aulas_Base.TestBase;

public class DigitalLibraryPage extends TestBase
{
	Actions ac;
	Robot r;
	@FindBy(xpath="//h3[text()='Digital Library']")
	WebElement DigitalLibraryText;
	@FindBy(xpath="(//span[contains(@class,'selection')])[1]/input")
	WebElement ClickStanderddrpdwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list']/div/div/div/div[3])[1]")
	WebElement SelStandardClass;
	@FindBy(xpath="(//span[contains(@class,'selection')])[3]/input")
	WebElement SelSubjectDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div[1]")
	WebElement SelSubject;
	@FindBy(xpath="//div[@class='rc-virtual-list']/div/div/div/div[7]")
	WebElement SeleSubject;
	@FindBy(xpath="(//span[contains(@class,'selection')])[5]")
	WebElement SelChapterDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list']/div/div/div/div[6])[3]")
	WebElement SelChapter;
	@FindBy(xpath="//span[text()=' ADD']")
	WebElement Addbtn;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper']")
	WebElement SubjectField;
	@FindBy(xpath="(//div[@class='rc-virtual-list']/div/div/div/div[2])[2]")
	WebElement SeleTeacher;
	@FindBy(xpath="(//div[@class='rc-virtual-list']/div/div/div/div[2])")
	WebElement manTeacher;
	@FindBy(xpath="(//span[@class='ant-select-selection-search'])[5]/input")
	WebElement SelClassesdrpdwn;
	@FindBy(xpath="((//div[@class='rc-virtual-list'])[2]/div/div/div/div/following::div)[9]")
	WebElement SelClasses;
	@FindBy(xpath="(//span[@class='ant-select-selection-search'])[6]/span/span/span/input")
	WebElement SearchChapter;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[4]")
	WebElement SeleChapter;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement EnterTopic;
	@FindBy(xpath="(//div[contains(@class,'upload')])[1]/span/button")
	WebElement AddPDFBtn;
	@FindBy(xpath="//div[@class='ant-tabs-extra-content']")
	WebElement Settingsicon;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper']/input")
	WebElement Search;
	@FindBy(xpath="//button[contains(@class,'search-button')]")
	WebElement SearchIcon;
	@FindBy(xpath="(//span[contains(@class,'cursor-pointer')])[3]")
	WebElement EditICon;
	@FindBy(xpath="(//span[contains(@class,'ant-input-clear-icon')])[2]")
	WebElement Clearicon;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement ViewManagementClasses;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[7]")
	WebElement ViewManagementSubjects;
	@FindBy(xpath="(//div[@class='ant-select-selection-overflow'])[2]")
	WebElement ManagementSubjectField;
	@FindBy(xpath="//span[text()='Done']")
	WebElement DoneBtn;
	@FindBy(xpath="(//span[contains(@class,'delete')])[23]")
	WebElement DeleteICon;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbtn;
	@FindBy(xpath="//span[text()='OK']")
	WebElement OKBtn;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[2]")
	WebElement SearchTeacherName;
	@FindBy(xpath="//span[contains(@class,'anticon-arrow-left')]")
	WebElement LeftArrow;
	
	@FindBy(xpath="//div[text()='Videos']")
	WebElement VideoButton;
	@FindBy(xpath="(//span[text()=' ADD'])[2]")
	WebElement Addbtn2;
	@FindBy(xpath="(//input[@class='ant-select-selection-search-input'])[7]")
	WebElement VideoClassdrpdwn;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[2]")
	WebElement VideoSearchChapter;
	@FindBy(xpath="(//input[@class='ant-input'])[4]")
	WebElement Link;
	@FindBy(xpath="//span[text()='Close']")
	WebElement Close;
	@FindBy(xpath="//span[text()='Add']")
	WebElement Addvideo;
	@FindBy(xpath="(//span[contains(@class,'anticon-edit m-r-10')])[3]")
	WebElement editvideo;
	@FindBy(xpath="//a[text()='View Video']")
	WebElement viewvideo;
	@FindBy(xpath="(//span[contains(@class,'anticon-upload m-r-10')])[3]")
	WebElement publishIcon;
	
	@FindBy(xpath="//div[text()='Question Bank']")
	WebElement Qustionbank;
	@FindBy(xpath="(//span[contains(@class,'anticon-edit m-r-10')])[2]")
	WebElement Eyeicon;
	@FindBy(xpath="//a[text()='View PDF']")
	WebElement ViewPDF;
	
	public DigitalLibraryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateText()
	{
		return DigitalLibraryText.getText();
		 
	}
	public void validSearchnotes() throws InterruptedException
	{
		Thread.sleep(4000);
		ClickStanderddrpdwn.click();
		SelStandardClass.click();
		Thread.sleep(2000);
		SelSubjectDrpDwn.click();
		SelSubject.click();
		Thread.sleep(2000);
		SelChapterDrpDwn.click();
		SelChapter.click();
		
	}
	public void validateAddbtn(String pdf) throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		Addbtn.click();
		Thread.sleep(2000);
		WebElement ele = SubjectField;
		ac =  new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("m").build().perform();
		//SubjectField.click();
		Thread.sleep(3000);
		SeleSubject.click();
		Thread.sleep(2000);
		SelClassesdrpdwn.click();
		Thread.sleep(2000);
		SelClasses.click();
		WebElement el = SearchChapter;
		ac = new Actions(driver);
		ac.moveToElement(el).click().sendKeys("C").build().perform();
		Thread.sleep(2000);
		SeleChapter.click();
		EnterTopic.sendKeys("Testing");
		JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,200)"); 
	    Thread.sleep(2000);
	    WebElement browse = AddPDFBtn;
	    browse.click();
		Thread.sleep(2000);
		r = new Robot();
		StringSelection str = new StringSelection(pdf);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    Addvideo.click();
	
	}
	public void validManageview(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		Settingsicon.click();
		Thread.sleep(5000);
		Search.sendKeys(name);
		SearchIcon.click();
	}
	public void validateeditmanageview() throws InterruptedException
	{
		Thread.sleep(2000);
		Settingsicon.click();
		EditICon.click();
		//DeleteICon.click();
		//Cancelbtn.click();
		//OKBtn.click();
		Thread.sleep(4000);
		new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'ant-input-clear-icon')])[2]"))).click();
		//Clearicon.clear();
		Thread.sleep(2000);
		manTeacher.click();
		ViewManagementClasses.click();
		Thread.sleep(2000);
		SelClasses.click();
		driver.findElement(By.xpath("//div[@class='ant-modal-body']")).click();
		ManagementSubjectField.click();
		Thread.sleep(2000);
		ViewManagementSubjects.click();
		DoneBtn.click();
	}
	public void validateAddmanagement() throws InterruptedException
	{
		Thread.sleep(2000);
		Settingsicon.click();
		Addbtn.click();
		Thread.sleep(2000);
		ViewManagementClasses.click();
		Thread.sleep(2000);
		List<WebElement>li = driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		int size = li.size();
		System.out.println(size);
		for(int i=0;i<2;i++)
		{
			Thread.sleep(3000);
			li.get(i).click();
		}
		driver.findElement(By.xpath("//div[@class='ant-modal-body']")).click();
		Thread.sleep(2000);
		WebElement elee=SearchTeacherName;
		ac = new Actions(driver);
		ac.moveToElement(elee).click().sendKeys("S").build().perform();
		Thread.sleep(3000);
		SeleTeacher.click();
		Thread.sleep(2000);
		ManagementSubjectField.click();
		Thread.sleep(4000);
		List<WebElement>W = driver.findElements(By.xpath("(//div[@class='rc-virtual-list'])[3]/div/div/div/div"));
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			W.get(i).click();
		}
		DoneBtn.click();
		Thread.sleep(2000);
		LeftArrow.click();
	}
	public void validateVideos(String topic,String link) throws InterruptedException
	{
		Thread.sleep(3000);
		VideoButton.click();
		Thread.sleep(2000);
		Addbtn2.click();
		Thread.sleep(2000);
		WebElement ele = SubjectField;
		ac =  new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("S").build().perform();
		Thread.sleep(2000);
		SeleSubject.click();
		Thread.sleep(2000);
		VideoClassdrpdwn.click();
		Thread.sleep(2000);
		SelClasses.click();
		WebElement el=VideoSearchChapter;
		ac = new Actions(driver);
		ac.moveToElement(el).click().sendKeys("F").build().perform();
		Thread.sleep(2000);
		SeleChapter.click();
		EnterTopic.sendKeys(topic);
		Thread.sleep(2000);
		Link.sendKeys(link);
		Addvideo.click();
		//Close.click();
	}
	public void validatevideoedit() throws InterruptedException
	{
		Thread.sleep(2000);
		VideoButton.click();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", editvideo);
		Thread.sleep(2000);
		viewvideo.click();
		//publishIcon.click();
		//DeleteICon.click();
	}
	public void validateQuestionbank(String topic) throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		Qustionbank.click();
		Thread.sleep(2000);
		Addbtn2.click();
		Thread.sleep(2000);
		WebElement ele = SubjectField;
		ac =  new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("S").build().perform();
		Thread.sleep(2000);
		SeleSubject.click();
		Thread.sleep(2000);
		VideoClassdrpdwn.click();
		Thread.sleep(2000);
		SelClasses.click();
		WebElement el=VideoSearchChapter;
		ac = new Actions(driver);
		ac.moveToElement(el).click().sendKeys("F").build().perform();
		Thread.sleep(2000);
		SeleChapter.click();
		EnterTopic.sendKeys(topic);
		JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("window.scrollBy(0,200)"); 
	    Thread.sleep(2000);
	    WebElement browse = AddPDFBtn;
	    browse.click();
		Thread.sleep(2000);
		r = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\Bhargav\\Desktop\\bgv.PDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    Addvideo.click();
	   // Close.click();
	    //(//span[contains(@class,'anticon-edit m-r-10')])[2]
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",Eyeicon);
		Thread.sleep(2000);
		ViewPDF.click();
	    
	}
	
	
	
	
	

}
