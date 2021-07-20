package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.AssignmentsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUTil;


public class AssignmentsText extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	AssignmentsPage Assignmentpage;
	
	public AssignmentsText()
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
	   	Assignmentpage=homePage.Assignment();
	}
//	@Test(priority=1)
//	public void AssignmentTest()
//	{
//		String text = Assignmentpage.validateText();
//		Assert.assertEquals(text, "Assignments");
//	}
	@Test(priority=2)
	public void FilterTest() throws InterruptedException
	{
		Assignmentpage.validateFilter();
	}

}
