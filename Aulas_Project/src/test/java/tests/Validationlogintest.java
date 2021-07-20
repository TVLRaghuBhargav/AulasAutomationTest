package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Validationlogintest 
{
	static WebDriver driver;
	@Test
	public static void captureScreenMethod() throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://test.theclassroom.biz/login");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys("developer@vectorseducation.com");
	driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys("classroom7@brigoshadgg");
	driver.findElement(By.xpath("//button[contains(@class,'primary')]/span[text()='Login']")).click();
	Thread.sleep(5000);
	Actions ac = new Actions(driver);
	WebElement link=driver.findElement(By.xpath("//div[@class='side-menu']//following::span[text()='Users']"));
	ac.moveToElement(link).click().build().perform();
	}
	@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result)
	{
	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	if(ITestResult.FAILURE==result.getStatus()){
	try{
	// To create reference of TakesScreenshot
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	// Call method to capture screenshot
	File src=screenshot.getScreenshotAs(OutputType.FILE);
	// Copy files to specific location
	// result.getName() will return name of test case so that screenshot name will be same as test case name
	FileUtils.copyFile(src, new File("C:\\Users\\Brigosha_Guest\\eclipse-workspace"+result.getName()+".png"));
	System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
	driver.quit();
	}


}
