package Aulas_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.TestUTil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream ("C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initilization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUTil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUTil.IMPLICT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get(prop.getProperty("url"));
		
	}
	
	public void failed(String testMethodName)
	{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try
	{
	FileUtils.copyFile(scrFile, new File("C:\\Users\\Bhargav\\eclipse-workspace\\Aulas_Project\\screenshots"+testMethodName+"_"+".jpg"));
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}

	}

}
