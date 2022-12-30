package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutUsingChrome                 // 1 all fine
{
	public static WebDriver browse=null;                
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
		   System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
		   browse=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void navigate()
	{
		try
		{
			browse.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			browse.findElement(By.id("username")).sendKeys("admin");
			browse.findElement(By.name("pwd")).sendKeys("manager");
			browse.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
			browse.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();      //users
			Thread.sleep(3000);
			browse.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();              // add user
			Thread.sleep(3000);
			browse.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("xyz");               //firstname
			browse.findElement(By.name("lastName")).sendKeys("abc");                                    //ln
			browse.findElement(By.name("email")).sendKeys("xyz@gmail.com");                            //email
			browse.findElement(By.name("username")).sendKeys("XYZ");                                  //username
			browse.findElement(By.name("password")).sendKeys("xyz@123");
			browse.findElement(By.name("passwordCopy")).sendKeys("xyz@123");                          
			browse.findElement(By.xpath("//span[text()='Create User']")).click();	                 //create user
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
			browse.findElement(By.xpath("//span[text()='abc, xyz']")).click();
			Thread.sleep(2000);
			browse.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
            Alert obj=browse.switchTo().alert();
			Thread.sleep(2000);
            obj.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
    
	
	private static void logout()
	{
		try
		{
			browse.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
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
              Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
