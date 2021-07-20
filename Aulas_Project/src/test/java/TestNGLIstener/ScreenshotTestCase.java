package TestNGLIstener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;

@Listeners(CustomListener.class)
	public class ScreenshotTestCase extends TestBase
	{
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
	initilization();
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}

	@Test(dataProvider="testdataset")
	public void createnewlogin(String email,String password) throws InterruptedException
	{
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brigosha_Guest\\eclipse-workspace\\Brigosha\\TestCases_Aulas\\Drivers\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
	// driver.manage().window().maximize();
	// driver.get("https://test.theclassroom.biz/login");
	//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='m-t-5']/input")).clear();
		driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys(email);
		driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).clear();
		driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'primary')]/span[text()='Login']")).click();
	Thread.sleep(5000);
	Actions ac = new Actions(driver);
	WebElement link=driver.findElement(By.xpath("//div[@class='side-menu']//following::span[text()='Users']"));
	ac.moveToElement(link).click().build().perform();
	}


	@DataProvider(name = "testdataset")
	public Object[][] getData()
	{
	Object[][] data = new Object[5][2];
	data[0][0] = "developer@vectorseducation.com";
	data[0][1] = "classroom7@brigosha";

	data[1][0] = "developer@vectorseducation.com";
	data[1][1] = "classroom7@brigoshabdjdj";

	data[2][0] = "developer@vectorseducationbddgj.com";
	data[2][1] = "classroom7@brigosha";

	data[3][0] = "developer@vectorseducationhdj.com";
	data[3][1] = "classroom7@brigoshabdjdj";

	data[4][0] = " ";
	data[4][1] = " ";

	return data;
	}

}
