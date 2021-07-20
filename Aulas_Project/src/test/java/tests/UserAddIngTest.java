package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserAddInfPage;
import Pages.UserPage;
import Util.TestUTil;

public class UserAddIngTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	UserAddInfPage useraddinfpage;


	public UserAddIngTest()
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
	     userpage=homePage.User();
	    useraddinfpage=userpage.operdropdown();
	   
	     }
	@Test(priority=1)
	public void ValidateAddInfoPage() throws InterruptedException
	{
	
		useraddinfpage.AddInfoPage(prop.getProperty("FirstName"),prop.getProperty("email"),prop.getProperty("PhoneNO"),prop.getProperty("HouseNo"),prop.getProperty("City"),prop.getProperty("State"),prop.getProperty("Pincode"),prop.getProperty("DOB"));
	}
	@Test(priority=2)
	public void ValidateCancelButton() throws InterruptedException
	{
	useraddinfpage.Cancelbutton();
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}


}
