package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.StudentPage;
import Pages.UserPage;
import Util.TestUTil;

public class StudentTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	StudentPage studentpage;
	public StudentTest()
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
	  studentpage=new StudentPage();
	   homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   userpage=homePage.User();
	    }
	@Test(priority=1)
	public void validateStuname() throws InterruptedException
	{
	userpage.enter(prop.getProperty("StuName"));
	}
	     @Test(priority=2)
	     public void validatexbutton() throws InterruptedException
	     {
	userpage.crossbutton(prop.getProperty("StuName"));
	   }
	     @Test(priority=3)
	     public void validateselectClass() throws InterruptedException
	    {
	    studentpage.SelectClass(prop.getProperty("StuFName"), prop.getProperty("StuDOB"), prop.getProperty("Stuemail"), prop.getProperty("StuPhoneNO"), prop.getProperty("StuFatName"), prop.getProperty("StuFatOCc"), prop.getProperty("StuMothName"), prop.getProperty("StuMotOcc"), prop.getProperty("StuGarEmail"), prop.getProperty("StuGarPhNo"), prop.getProperty("StuFamIncome"), prop.getProperty("StuHouseNo"), prop.getProperty("StuCity"), prop.getProperty("StuState"), prop.getProperty("StuPincode"),prop.getProperty("StuEmgName"),prop.getProperty("StuEmgNo"));

	     }
	     @Test(priority=4)
	     public void ValidateCancelButton() throws InterruptedException
	{
	    studentpage.Cancelbutton();
	}
	     @Test(priority=5)
	     public void VaidateStuReq() throws InterruptedException
	     {
	    studentpage.StuRegReq();
	     }
	     @Test(priority=6)
	    public void ValidateCrossicon() throws InterruptedException
	     {
	    studentpage.StureqCrossicon();
	     }
	     @Test(priority=7)
	     public void ValidateBackArrow() throws InterruptedException
	     {
	    studentpage.BackArrClick();
	     }
	     @Test(priority=8)
	     public void ValidateMenuicon() throws InterruptedException
	     {
	    studentpage.Menuicon();
	     }
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}


}
