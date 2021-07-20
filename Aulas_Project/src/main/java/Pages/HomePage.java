package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class HomePage extends TestBase
{Actions ac;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Users']")
WebElement UsersLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Fee Management']")
WebElement FeeManagementLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Schedule']")
WebElement ScheduleLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Live Classes']")
WebElement LiveClassLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Classrooms']")
WebElement ClassesLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Announcements']")
WebElement AnnouncementsLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Attendance']")
WebElement AttendLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Digital Library']")
WebElement digitalLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Assignments']")
WebElement AssignmentLink;
@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Test']")
WebElement TestLink;
@FindBy(xpath="//div[@class='ant-dropdown-trigger']")
WebElement ProfileIcon;
@FindBy(xpath="//div[text()=' My Profile']")
WebElement MyProfileClick;
@FindBy(xpath="//li[text()=' Logout']")
WebElement Logout;
@FindBy(xpath="//div[text()='developer']")
WebElement ProfileName;
@FindBy(xpath="//span[@class='ant-badge']/button")
WebElement Notification;
@FindBy(xpath="//button[@type='button']/span[text()='View All']")
WebElement viewAllNotification;
@FindBy(xpath="//div[@class='m-b-20']/div/div[2]")
WebElement ClickNotification;
@FindBy(xpath="//button[@type='button']/span[text()='Close']")
WebElement Closebtn;
@FindBy(xpath="//div[text()='Activity']")
WebElement Activitybtn;
@FindBy(xpath="//div[@class='ant-select-selector']")
WebElement PageDrpDn;
@FindBy(xpath="(//div[contains(@class,'virtual')])[3]/div[2]")
WebElement SelPageDrpdn;
@FindBy(xpath="(//div[contains(@class,'ant-dropdown')])[2]/child::div/div/following::div/div[5]")
WebElement NotificationClick;

public HomePage()
{
PageFactory.initElements(driver, this);
}

public UserPage User()
{
ac=new Actions(driver);
ac.moveToElement(UsersLink).click().build().perform();
return new UserPage();
}
public FeeManagementPage Feemanagement()
{
ac=new Actions(driver);
ac.moveToElement(FeeManagementLink).click().build().perform();
return new FeeManagementPage();
}
public SchedulePage schedule()
{
ac=new Actions(driver);
ac.moveToElement(ScheduleLink).click().build().perform();
return new SchedulePage();
}
public void liveClasses()
{
ac=new Actions(driver);
ac.moveToElement(LiveClassLink).click().build().perform();
}
public ClassroomPage classes()
{
ac=new Actions(driver);
ac.moveToElement(ClassesLink).click().build().perform();
return new ClassroomPage();
}
public AnnouncementPage Announcement()
{
ac=new Actions(driver);
ac.moveToElement(AnnouncementsLink).click().build().perform();
return new AnnouncementPage();
}
public void Attend()
{
ac=new Actions(driver);
ac.moveToElement(AttendLink).click().build().perform();
}
public DigitalLibraryPage Digital()
{
ac=new Actions(driver);
ac.moveToElement(digitalLink).click().build().perform();
return new DigitalLibraryPage();
}
public AssignmentsPage Assignment()
{
ac=new Actions(driver);
ac.moveToElement(AssignmentLink).click().build().perform();
return new AssignmentsPage();
}
public void Test()
{
ac=new Actions(driver);
ac.moveToElement(TestLink).click().build().perform();
}

public String profileICon() throws InterruptedException
{

Thread.sleep(5000);
ProfileIcon.click();
MyProfileClick.click();
//Thread.sleep(5000);
//Logout.click();
return ProfileName.getText();

}

public void notificationicon() throws InterruptedException
{
Thread.sleep(5000);
Notification.click();
// viewAllNotification.click();
// ClickNotification.click();
// Thread.sleep(2000);
// Closebtn.click();
// Activitybtn.click();
// PageDrpDn.click();
// SelPageDrpdn.click();
NotificationClick.click();
}
}
