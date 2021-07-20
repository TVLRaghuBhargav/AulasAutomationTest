package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class FeeManagementPage extends TestBase
{
	@FindBy(xpath="(//div[contains(@class,'ant-col')]/child::div/h1[text()='₹ 3,549'])[1]")
	WebElement AllMoney;
	@FindBy(xpath="(//div[contains(@class,'ant-col')]/child::div/div[text()='102 links generated'])")
	WebElement LinksGen;
	@FindBy(xpath="//h1[text()='Fee Management']")
	WebElement FeemanagementLogo;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[1]")
	WebElement ViewDetailLinkGenerater;
	@FindBy(xpath="(//button[contains(@class,'btn ')])[3]")
	WebElement leftArrow;
	@FindBy(xpath="//span[contains(@class,'trigger')]/span/span")
	WebElement FilterICon;
	@FindBy(xpath="//label[contains(@class,'checkbox')]")
	WebElement FilterCheckBox;
	@FindBy(xpath="//span[text()='OK']")
	WebElement FilterOk;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper']/input")
	WebElement Serachname;
	@FindBy(xpath="//button[contains(@class,'search-button')]/span")
	WebElement SearchIcon;
	@FindBy(xpath="(//tbody[@class='ant-table-tbody']/tr/td/div)[1]")
	WebElement clickStuDetail;
	@FindBy(xpath="(//div[contains(@class,'fAVkeA')])[7]/div[1]")
	WebElement GenerateLinks;
	@FindBy(xpath="(//span[contains(@class,'selection')]/input[contains(@class,'ant')])[1]")
	WebElement searchclass;
	@FindBy(xpath="//div[@class='rc-virtual-list']/div/div/div/div/div[text()='9 - A']")
	WebElement ClassDrpDwn;
	@FindBy(xpath="(//input[contains(@class,'selection')])[2]")
	WebElement Searchname;
	@FindBy(xpath="//div[@class='ant-picker-input']/input")
	WebElement SelDate;
	@FindBy(xpath="//span[contains(@class,'borderless')]/input")
	WebElement SelAmount;
	@FindBy(xpath="//textarea[contains(@class,'input')]")
	WebElement DesText;
	@FindBy(xpath="//button[contains(@class,'round ')]/span[text()='Send']")
	WebElement ClickSend;
	///////----LinksGeneratedXpaths----//////////
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[2]")
	WebElement Paidlink;
	@FindBy(xpath="((//div[@class='ant-modal-body'])[2]/div[3]//child::span)[1]")
	WebElement buttonslink;
	@FindBy(xpath="//span[text()='Download Receipt']")
	WebElement downloadReceipt;
	@FindBy(xpath="//span[@class='anticon anticon-close-circle']")
	WebElement xbutton;

	@FindBy(xpath="//div[text()='Dummy 5']")
	WebElement SelInputname;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[3]")
	WebElement PendingLink;
	@FindBy(xpath="//div[text()='View all']")
	WebElement ViewAllLink;
	//////-----Class X-Paths-----//////
	@FindBy(xpath="//span[text()='Class']")
	WebElement clickClassbutton;
	///////---------ViewAllStudents X-Paths-------///////
	@FindBy(xpath="(//div[contains(@class,'ant')])[43]")
	WebElement ViewStudents;
	@FindBy(xpath="(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement AllCheckBox;
	@FindBy(xpath="//button[@type='button']/span[text()='Generate Links']")
	WebElement GenLinksButton;
	@FindBy(xpath="//div[text()='KYC approval is pending. Please contact support.']")
	WebElement KYCPEnSupt;
	@FindBy(xpath="//label[@class='ant-checkbox-wrapper']")
	WebElement MultiCheckBox;
	@FindBy(xpath= "//h1[text()='All Students']")
	WebElement CheckStudets;
	@FindBy(xpath="//div[contains(@class,'dropdown ')]//following::li/div[text()='5-A']")
	WebElement ClassSection;



	public FeeManagementPage()
	{
	PageFactory.initElements(driver,this);
	}

	public String Logo()
	{
	return FeemanagementLogo.getText();
	}

	public String AllMoney()
	{
	return AllMoney.getText();
	//return LinksGen.getText();
	}
	public void ViewDetailLinkGenerater() throws InterruptedException
	{
	Thread.sleep(8000);
	ViewDetailLinkGenerater.click();
	// Thread.sleep(2000);
	// leftArrow.click();
	}
	public void filterICon() throws InterruptedException
	{
	Thread.sleep(5000);
	ViewDetailLinkGenerater.click();
	Thread.sleep(2000);
	FilterICon.click();
	List<WebElement>checkBoxes=driver.findElements(By.xpath("//label[contains(@class,'checkbox')]"));
	int size = checkBoxes.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
	checkBoxes.get(i).click();
	}
	FilterOk.click();
	}

	public void Searchname() throws InterruptedException
	{

	Serachname.sendKeys("Bhargav");
	Thread.sleep(2000);
	SearchIcon.click();
	Thread.sleep(2000);
	clickStuDetail.click();

	}

	public void LinkFilter() throws InterruptedException
	{
	FilterICon.click();
	List<WebElement>checkBoxes=driver.findElements(By.xpath("//label[contains(@class,'checkbox')]"));
	int size = checkBoxes.size();
	System.out.println(size);
	for(int i=2 ;i<size;i++)
	{
	checkBoxes.get(i).click();
	}
	FilterOk.click();
	}

	public void Generaelinks() throws InterruptedException
	{
	Thread.sleep(2000);
	GenerateLinks.click();
	searchclass.click();
	Thread.sleep(4000);
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("argument[0].scrollIntoView();",ClassDrpDwn);
	ClassDrpDwn.click();
	Searchname.sendKeys("Dummy 5");
	Thread.sleep(2000);
	SelInputname.click();
	SelDate.sendKeys("2021-07-13");
	SelAmount.sendKeys("10");
	DesText.sendKeys("Testing Purpose");
	ClickSend.click();
	}

	public void paidDetails() throws InterruptedException
	{
	Thread.sleep(5000);
	Paidlink.click();
	Serachname.sendKeys("Farhan");
	Thread.sleep(2000);
	SearchIcon.click();
	Thread.sleep(2000);
	clickStuDetail.click();
	buttonslink.click();
	downloadReceipt.click();

	}

	public void pendingDetails() throws InterruptedException
	{
	Thread.sleep(5000);
	PendingLink.click();
	Serachname.sendKeys("Neeti");
	Thread.sleep(2000);
	SearchIcon.click();
	Thread.sleep(2000);
	clickStuDetail.click();
	xbutton.click();
	leftArrow.click();
	Thread.sleep(5000);
	ViewAllLink.click();
	}

	public void viewAllStudents() throws InterruptedException
	{
	Thread.sleep(5000);
	ViewStudents.click();
	Thread.sleep(2000);
	AllCheckBox.click();
	GenLinksButton.click();
	SelDate.sendKeys("2021-07-11");
	SelAmount.sendKeys("1");
	DesText.sendKeys("Testing Module");
	ClickSend.click();
	Thread.sleep(5000);
	String ExtTest = "KYC approval is pending. Please contact support.";
	String ele = KYCPEnSupt .getText();
	if(ExtTest.equalsIgnoreCase(ele))
	{
	System.out.println("The expected heading is same as actual heading --- " +ele);
	}
	else
	{
	System.out.println("The expected heading doesn't match the actual heading --- " +ele);
	}
	}

	public void classDetails() throws InterruptedException
	{
	Thread.sleep(2000);
	GenerateLinks.click();
	clickClassbutton.click();
	searchclass.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	ClassDrpDwn.click();
	SelDate.sendKeys("2021-07-11");
	SelAmount.sendKeys("1");
	DesText.sendKeys("Testing Module");
	ClickSend.click();
	}

	public void MultipleCheckBox() throws InterruptedException
	{
	Thread.sleep(5000);
	ViewStudents.click();
	Thread.sleep(2000);
	//WebElement cb= driver.findElement(By.xpath("//label[@class='ant-checkbox-wrapper']"));
	//cb.click();
	List<WebElement>checkBox=driver.findElements(By.xpath("//label[@class='ant-checkbox-wrapper']"));
	int size = checkBox.size();
	System.out.println(size);
	for(int i=3 ;i<size;i++)
	{
	Thread.sleep(2000);
	checkBox.get(i).click();
	}
	}

	public void StudentDropDown() throws InterruptedException
	{
	Thread.sleep(5000);
	ViewStudents.click();
	Thread.sleep(2000);
	CheckStudets.click();
	Thread.sleep(5000);
	ClassSection.click();
	Thread.sleep(2000);
	AllCheckBox.click();
	Thread.sleep(3000);
	GenLinksButton.click();
	SelDate.sendKeys("2021-07-11");
	SelAmount.sendKeys("1");
	DesText.sendKeys("Testing Module");
	ClickSend.click();
	}


}
