package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.FeeManagementPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUTil;

public class FeeManagementTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	FeeManagementPage feemanagenmentpage;

	public FeeManagementTest()
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
	  feemanagenmentpage=new FeeManagementPage();
	   homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  feemanagenmentpage=homePage.Feemanagement();
	}

	 @Test(priority=1)
	 public void validatelogo()
	 {
	 String expText = "Fee Management";
	 String text = feemanagenmentpage.Logo();
	 if(expText.equalsIgnoreCase(text))
	 System.out.println("The Expected Test is---"+ expText);
	 else
	 System.out.println("This is not Expected Test---"+ expText);
	 }
	 @Test(priority=2)
	 public void validateAllMoney()
	 {
	
	 String expAllAmoney = "₹ 3,549";
	 String text = feemanagenmentpage.AllMoney();
	 if(expAllAmoney.equalsIgnoreCase(text))
	 System.out.println("The Expected money is same as actual Money---"+text);
	 else
	 System.out.println("The Expected money doen not same as actual Money---"+text);
	 //Assert.assertEquals(text, "₹ 3,548");
	 }

	 @Test(priority=3)
	 public void validateViewDetailLinkGenerater() throws InterruptedException
	 {
	 feemanagenmentpage.ViewDetailLinkGenerater();
	 String expText = "Fee Management";
	 String text = feemanagenmentpage.Logo();
	 if(expText.equalsIgnoreCase(text))
	 System.out.println("The Expected Test is---"+ expText);
	 else
	 System.out.println("This is not Expected Test---"+ expText);
	 }
	 @Test(priority=4)
	 public void validateFilterIcon() throws InterruptedException
	 {
	 feemanagenmentpage.ViewDetailLinkGenerater();
	 feemanagenmentpage.filterICon();
	
	 }

	 @Test(priority=5)
	 public void validateSearchName() throws InterruptedException
	 {
	 feemanagenmentpage.ViewDetailLinkGenerater();
	 feemanagenmentpage.Searchname();
	
	 }
	 @Test(priority=6)
	 public void validatelinkFilter() throws InterruptedException
	 {
	 feemanagenmentpage.ViewDetailLinkGenerater();
	 feemanagenmentpage.Searchname();
	 feemanagenmentpage.LinkFilter();
	 }

	@Test(priority=7)
	public void validateGenerateLink() throws InterruptedException
	{
	feemanagenmentpage.Generaelinks();

	}
	
	 @Test(priority=8)
	 public void validatePaidDetails() throws InterruptedException
	 {
	 feemanagenmentpage.paidDetails();
	 }
	 @Test(priority=9)
	
	 public void validatePendingDetails() throws InterruptedException
	 {
	 feemanagenmentpage.pendingDetails();
	 }
	 @Test(priority=10)
	 public void validateViewAllStudents() throws InterruptedException
	 {
	 feemanagenmentpage.viewAllStudents();
	
	 }
	 @Test(priority=11)
	 public void validateClassDetails() throws InterruptedException
	 {
	 feemanagenmentpage.classDetails();
	 }
	
	 @Test(priority=12)
	 public void validateMultiCheck() throws InterruptedException
	 {
	 feemanagenmentpage.MultipleCheckBox();
	 }
	
	 @Test(priority=13)
	 public void validateStudentdropdwon() throws InterruptedException
	 {
	 feemanagenmentpage.StudentDropDown();
	 }
	
	
	 @AfterTest
	 public void tearDown()
	 {
	 driver.quit();
	 }

}
