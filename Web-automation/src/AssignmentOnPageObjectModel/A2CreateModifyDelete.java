package AssignmentOnPageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2CreateModifyDelete {
    public static WebDriver browse=null;
    public static ActitimeWebElements opage=null;
	public static void main(String[] args) 
	{ 
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApp();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			browse=new ChromeDriver();
			browse.manage().window().maximize();
			opage=new ActitimeWebElements(browse);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	private static void navigate()
	{
		try
		{
			browse.navigate().to("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			opage.getUsername().sendKeys("admin");
			opage.getPwd().sendKeys("manager");
			opage.getLoginButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getAddUser().click();
			Thread.sleep(2000);
            opage.getFirstName().sendKeys("abc");
            opage.getLastName().sendKeys("abc");
            opage.getEmail().sendKeys("abc@gmail.com");
            opage.getun().sendKeys("ABC");
            opage.getpassword().sendKeys("abc@123");
            opage.getPasswordCopy().sendKeys("abc@123");
            opage.getcreateUser().click();
            Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getclickOnabc().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys("abc@1234");
            opage.getPasswordCopy().sendKeys("abc@1234");
			opage.getsaveChanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	private static void deleteUser()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getclickOnabc().click();
			Thread.sleep(2000);
			opage.getdeleteUser().click();
			Thread.sleep(2000);
			Alert obj=browse.switchTo().alert();
			obj.accept();
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			opage.getLogoutButton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
	{
		try
		{
			browse.close();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
