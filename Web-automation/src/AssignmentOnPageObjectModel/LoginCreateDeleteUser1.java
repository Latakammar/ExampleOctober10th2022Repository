package AssignmentOnPageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCreateDeleteUser1              //delete user is not working
{
    public static WebDriver browse=null;
    public static ActitimeWebElements oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		logout();
		closeApp();
		
	}
	
	private static void launchBrowser()
	{
		try
		{
		   System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe" );
		   browse=new ChromeDriver();
		   //browse.manage().deleteAllCookies();
		   browse.manage().window().maximize();
		   oPage=new ActitimeWebElements(browse);
		   Thread.sleep(3000);
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
		   Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{ 
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		   
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void createUser()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(3000);

			oPage.getAddUser().click();
			Thread.sleep(3000);

			oPage.getFirstName().sendKeys("abc");
			oPage.getLastName().sendKeys("abc");
			oPage.getEmail().sendKeys("abc@gmail.com");
			oPage.getun().sendKeys("ABC");
			oPage.getpassword().sendKeys("Abc@123");
			oPage.getPasswordCopy().sendKeys("Abc@123");
			oPage.getcreateUser().click();
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);	
			oPage.getclickOnabc().click();
			Thread.sleep(2000);	
			oPage.getdeleteUser().click();                                                         
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
			oPage.getLogoutButton().click();
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
