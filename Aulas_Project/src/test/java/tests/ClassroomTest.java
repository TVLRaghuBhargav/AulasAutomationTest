package tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.ClassroomPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUTil;

public class ClassroomTest extends TestBase
{

	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	ClassroomPage classroompage;
	
	public ClassroomTest()
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
	   	classroompage=homePage.classes();
	}
	@Test(priority=1)
	public void ClassroomText()
	{
		String text = classroompage.validateClassroomtext();
		Assert.assertEquals(text, "Classrooms");
	}
	@Test(priority=2)
	public void CreateaClass() throws InterruptedException
	{
		classroompage.validateCreateaClass(prop.getProperty("ClassName"),prop.getProperty("Section"),prop.getProperty("Stream"));
		
	}
	@Test(priority=3)
	public void ClickClass() throws InterruptedException
	{
		classroompage.validateClass();
		
	}
	@Test(priority=4)
	public void editCurriculum() throws InterruptedException
	{
		classroompage.validateClass();
		classroompage.validateEditcurriculum();
		
	}
	@Test(priority=5)
	public void deleteSubject() throws InterruptedException
	{
		classroompage.validateClass();
		classroompage.validateEditcurriculum();
		classroompage.validateDeleteSubject();
	}
	@Test(priority=6)
	public void addStudent() throws InterruptedException
	{
		classroompage.validateAddStudent();
	}
	@Test(priority=7)
	public void editIcon() throws InterruptedException
	{
		classroompage.validateEdit();
	}
	@Test(priority=8)
	public void Addbutton() throws InterruptedException
	{
		classroompage.validateAddbuttonClasses();
	}
	@Test(priority=9)
	public void Editchapters() throws InterruptedException
	{
		classroompage.validateClass();
		classroompage.validateEditcurriculum();
		classroompage.validateEditChapters();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
