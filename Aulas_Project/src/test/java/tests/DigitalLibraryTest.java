package tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;

import Pages.DigitalLibraryPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUTil;

public class DigitalLibraryTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	DigitalLibraryPage digitallibraryPage;
	
	public DigitalLibraryTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 initilization();
	   	  testUtil = new TestUTil();
	   	  loginpage=new LoginPage();
	   	  homePage=new HomePage();
	   	  userpage=new UserPage();
	   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   	digitallibraryPage=homePage.Digital();
	}
	@Test(priority=1)
	public void DigitalText()
	{
		String text = digitallibraryPage.validateText();
		Assert.assertEquals(text, "Digital Library");
	}
	@Test(priority=2)
	public void SearchNotes() throws InterruptedException
	{
		digitallibraryPage.validSearchnotes();
	}
	@Test(priority=3)
	public void Add() throws InterruptedException, AWTException
	{
		digitallibraryPage.validateAddbtn(prop.getProperty("PDF"));
	}
	@Test(priority=4)
	public void manageview() throws InterruptedException
	{
		digitallibraryPage.validManageview(prop.getProperty("Name"));
		
	}
    @Test(priority=5)
    public void editManageview() throws InterruptedException
    {
    	digitallibraryPage.validateeditmanageview();
    }
	@Test(priority=6)
	public void AddManagemetn() throws InterruptedException
	{
		digitallibraryPage.validateAddmanagement();
	}
	@Test(priority=7)
	public void Video() throws InterruptedException
	{
		digitallibraryPage.validateVideos(prop.getProperty("Topic"), prop.getProperty("LINK"));
	}
	@Test(priority=8)
	public void videoedit() throws InterruptedException
	{
		digitallibraryPage.validatevideoedit();
	}
	@Test(priority=9)
	public void Questionbank() throws InterruptedException, AWTException
	{
		digitallibraryPage.validateQuestionbank(prop.getProperty("Topic"));
	}
    
}
