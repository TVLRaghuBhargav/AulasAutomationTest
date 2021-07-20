package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class AnnouncementPage extends TestBase
{
	@FindBy(xpath="//h3[text()='Announcements']")
	WebElement AnnouncementText;
	@FindBy(xpath="//div[@class='ant-row']/div[7]")
	WebElement anyoneAnnouncement;
	@FindBy(xpath="//span[text()='Close']")
	WebElement CloseButton;
	@FindBy(xpath="(//span[contains(@class,'anticon')])[17]")
	WebElement NoIndex;
	@FindBy(xpath="(//span[contains(@class,'anticon')])[16]")
	WebElement TableIndex;
	@FindBy(xpath="//span[text()='+ New Announcement']")
	WebElement NewAnnouncementButton;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement EnterTitle;
	@FindBy(xpath="//div[contains(@class,'container')]/div[1]")
	WebElement EnterDescription;
	@FindBy(xpath="//input[contains(@class,'search-input')]")
	WebElement SelectTarget;
	//Taget
	@FindBy(xpath="(//div[contains(@class,'holder')])[2]/div[6]")
	WebElement Target;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Closebtn;
	@FindBy(xpath="//span[text()='Publish']")
	WebElement Publishbtn;
	@FindBy(xpath="//span[contains(@class,'ql-header')]")
	WebElement Normalbtn;
	@FindBy(xpath="//span[contains(@class,'ql-picker-options')]/span[1]")
	WebElement Selheader;
	@FindBy(xpath="(//span[contains(@class,'ql-formats')]/button[2])[1]")
	WebElement SelLetters;
	@FindBy(xpath="(//span[contains(@class,'ql-formats')]/button[1])[2]")
	WebElement SelPoints;
	@FindBy(xpath="//div[text()='New Announcement']")
	WebElement Announcementbtn;
	@FindBy(xpath="(//button[@class='ant-pagination-item-link'])[2]")
	WebElement Pagenavigation;
	
	public AnnouncementPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateAnnounveText()
	{
		return AnnouncementText.getText();
	}
	public void validateAnyOneAnnouncement()
	{
		anyoneAnnouncement.click();
		CloseButton.click();
	}
	public void validateTableIndex() throws InterruptedException
	{
		Thread.sleep(3000);
	    NoIndex.click();
		anyoneAnnouncement.click();
		Thread.sleep(2000);
		CloseButton.click();
		TableIndex.click();
	}
	public void validateNewAnnouncementButton() throws InterruptedException
	{
		Thread.sleep(3000);
	    NoIndex.click();
		NewAnnouncementButton.click();
		EnterTitle.sendKeys("Testing Department");
		EnterDescription.sendKeys("This is a Autoamtion Testing Department.");
		SelectTarget.click();
		Thread.sleep(2000);
		Target.click();
		//Closebtn.click();
		Publishbtn.click();
	}
	public void validateAnnouncementDescription() throws InterruptedException
	{
		Announcementbtn.click();
		EnterTitle.sendKeys("QA Department");
		Thread.sleep(3000);
		Normalbtn.click();
		Selheader.click();
		SelLetters.click();
		//SelPoints.click();
		EnterDescription.sendKeys("This is a Testing Department. \r\n"
				+ "This is a Testing.\r\n"
				+ "﻿This is a Aulas.");
		SelectTarget.click();
		Thread.sleep(2000);
		Target.click();
		Closebtn.click();
		//Publishbtn.click();
	}
	public void naviagationPage() throws InterruptedException
	{
		Thread.sleep(5000);
		Pagenavigation.click();
		anyoneAnnouncement.click();
		Thread.sleep(2000);
		CloseButton.click();
	}
    
}
