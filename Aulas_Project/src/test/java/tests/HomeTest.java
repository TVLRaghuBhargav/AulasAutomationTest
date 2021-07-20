package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Util.TestUTil;

public class HomeTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	TestUTil testUtil;
	public HomeTest()
	{
	super();
	}
	      @BeforeMethod
	      public void setUp() throws InterruptedException
	      {
	     initilization();
	     testUtil = new TestUTil();
	     loginpage=new LoginPage();
	     homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	      }
	      @Test(priority=1)
	      public void UserButton()
	      {
	     homePage.User();
	      }
	      @Test(priority=2)
	      public void FeeButton()
	      {
	     homePage.Feemanagement();
	      }
	      @Test(priority=3)
	      public void scheduleButton()
	      {
	     homePage.schedule();
	      }
	      @Test(priority=4)
	      public void liveClassesButton()
	      {
	     homePage.liveClasses();
	      }
	      @Test(priority=5)
	      public void calssroomsButton()
	      {
	     homePage.classes();
	      }
	      @Test(priority=6)
	      public void AnnouncementButton()
	      {
	     homePage.Announcement();
	      }
	      @Test(priority=7)
	      public void AttenButton()
	      {
	     homePage.Attend();
	      }
	      @Test(priority=8)
	      public void DLButton()
	      {
	     homePage.Digital();
	      }
	      @Test(priority=9)
	      public void AssignmentButton()
	      {
	     homePage.Assignment();
	      }
	      @Test(priority=10)
	      public void TestButton()
	      {
	     homePage.Test();
	      }
	      @Test(priority=10)
	      public void ValidateProfileicon() throws InterruptedException
	      {
	     homePage.profileICon();
	     String ExpText = "developer";
	     String text = homePage.profileICon();
	     if(ExpText.equalsIgnoreCase(text))
	     {
	     System.out.println("This is a profie name" +text);
	     }
	     else
	     {
	     System.out.println("This is not profile name" +text);
	     }
	      }
	      @Test(priority=11)
	      public void Validatenotificationicon() throws InterruptedException
	      {
	     homePage.notificationicon();
	      }
	     
      @AfterMethod
      public void tearDown()
      {
    	  driver.quit();
      }

}
