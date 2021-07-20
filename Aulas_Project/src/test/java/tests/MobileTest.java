package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MobilePage;
import Pages.PasswordPage;

public class MobileTest extends TestBase
{

	LoginPage loginpage;
	HomePage homePage;
	PasswordPage passwordPage;
	MobilePage mobilepage;
	
	public MobileTest()
	{
		super();
	}
	@BeforeMethod
    public void setUp() throws InterruptedException
    {
  	  initilization();
  	  loginpage=new LoginPage();
      mobilepage=loginpage.validatePhoneButton();
    }
	@Test
	public void mobilebuttonTest()
	{
		mobilepage.login(prop.getProperty("phonenumber"));
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

