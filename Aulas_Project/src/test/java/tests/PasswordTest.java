package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PasswordPage;

public class PasswordTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	PasswordPage passwordPage;
	public PasswordTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initilization();
		loginpage=new LoginPage();
		passwordPage =loginpage.validateforgetpassword();
	}
	
	@Test(priority=1)
	public void emailText()
	{
		homePage=passwordPage.login(prop.getProperty("username"));
	}
	@Test(priority=2)
	public void Goback()
	{
		passwordPage.Gobacklogin();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
