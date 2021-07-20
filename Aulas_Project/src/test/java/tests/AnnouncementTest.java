package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.AnnouncementPage;
import Pages.HomePage;
import Pages.LoginPage;

import Util.TestUTil;

public class AnnouncementTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	TestUTil testUtil;
	AnnouncementPage announcementpage;
	
	public AnnouncementTest()
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
	   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   	announcementpage=homePage.Announcement();
	}
	@Test(priority=1)
	public void AnnouncementText()
	{
		String expText = "Announcements";
		String text = announcementpage.validateAnnounveText();
		if(expText.equalsIgnoreCase(text))
			System.out.println("The Excepted Test is ----" + expText);
		else
			System.out.println("This is not Excepted Test ----" + expText);
		//String text = announcementpage.validateAnnounveText();
		//Assert.assertEquals(text, "Announcements");
	}
	@Test(priority=2)
	public void ClickAnyoneAnnouncement()
	{
		announcementpage.validateAnyOneAnnouncement();
	}
	@Test(priority=3)
	public void Tableindex() throws InterruptedException
	{
		announcementpage.validateTableIndex();
	}
	@Test(priority=4)
	public void newAnnouncement() throws InterruptedException 
	{
		announcementpage.validateNewAnnouncementButton();
	}
	@Test(priority=5)
	public void newHeader() throws InterruptedException
	{
		announcementpage.validateAnnouncementDescription();
	}
	@Test(priority=6)
	public void NavigationPage() throws InterruptedException
	{
		announcementpage.naviagationPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
