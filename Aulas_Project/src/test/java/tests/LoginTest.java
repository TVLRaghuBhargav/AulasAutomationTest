package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MobilePage;
import Pages.PasswordPage;


public class LoginTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	PasswordPage passwordPage;
	MobilePage mobilepage;
	public LoginTest()
	{
	super();
	}
	      @BeforeMethod
	      public void setUp() throws InterruptedException
	      {
	     initilization();
	     loginpage=new LoginPage();
	     
	      }
	      @Test(priority=1)
	      public void loginPageTitleTest()
	      {
	     String title=loginpage.validateLoginPageTitle();
	     Assert.assertEquals(title, "aulas");
	      }
	      @Test(priority=2)
	      public void aulaslogoImageTest()
	      {
	     boolean flag=loginpage.validateAulasImage();
	     Assert.assertTrue(flag);
	      }
	      @Test(priority=3)
	      public void privacypolicyTest()
	     {
	   loginpage.validatePrivacyPage();
	      }
	      @Test(priority=4)
	      public void termsandconditionsTest()
	      {
	     loginpage.validateTermsadnConditions();
	      }
	      @Test(priority=5)
	      public void SigninYourAccText()
	      {
	     String text=loginpage.validateSigninyouraccount();
	     Assert.assertEquals(text, "Sign in to your account");
	     }
	      @Test(priority=6)
	      public void loginTest()
	      {
	     homePage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	      }
	      @Test(priority=7)
	   public void PhoneButton()
	     {
	     mobilepage=loginpage.validatePhoneButton();
	          }

	    @Test(priority=8)
	     public void ProjectLinkTest()
	     {
	    loginpage.validateLink();
	     }
	    @Test(priority=9)
	    public void ValidateAndroidApp()
	    {
	    loginpage.ClickApp();
	    }
	    @Test(priority=10)
	    public void ValidateIOSApp()
	    {
	    loginpage.IOSApp();
	    }
	      @AfterMethod
	      public void tearDown()
	      {
	     driver.quit();
	      }

}
