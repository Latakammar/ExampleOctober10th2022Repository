package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeUsersOperation                               // 3 all fine
{
    public static WebDriver browse=null;
	public static void main(String[] args)      
	{
		launchBrowse();
		navigate();
		//---------------------login as admin, create 3 users ,logout---------------------------------------------------------------
		login();
		createUser("user1","u1","user1@gmail.com","USER1","user1@123","user1@123");
		createUser("user2","u2","user2@gmail.com","USER2","user2@123","user2@123");
		createUser("user3","u3","user3@gmail.com","USER3","user3@123","user3@123");
		logout();
		//----------------------login and logout for all 3 users------------------------------------------------------
		login1("user1","user1@123");
		logout();
		login1("user2","user2@123");
		logout();
		login1("user3","user3@123");
		logout();
		//----------------------login as individual, modify their password and logout----------------------------------------------
		login2("user1","user1@123");
		modifyUser("u1","user1","user1@1234");
		logout();
		login2("user2","user2@123");
		modifyUser("u2","user2","user2@1234");
		logout();
		login2("user3","user3@123");
		modifyUser("u3","user3","user3@1234");
		logout();
	//-----------------------login as individual by using new password and logout--------------------------------------
		login2("user1","user1@1234");
		logout();
		login2("user2","user2@1234");
		logout();
		login2("user3","user3@1234");
		logout();
		//------------------------login as admin to modify all users password then logout,login and logout for all 3 user by using new passward------------------------
		login();
		modifyUser("u1","user1","user1@12345");
		modifyUser("u2","user2","user2@12345");
		modifyUser("u3","user3","user3@12345");
		logout();
		
		login2("user1","user1@12345");
		logout();
		login2("user2","user2@12345");
		logout();
		login2("user3","user3@12345");
		logout();
		//-----------------------login as admin to delete all 3 users and logout-----------------------------------
		login();
		deleteUser("u1","user1");
		deleteUser("u2","user2");
		deleteUser("u3","user3");

		logout();

	}
	
	private static void launchBrowse()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
		browse=new ChromeDriver();
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
		browse.get("http://localhost:81/login.do");
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
			browse.findElement(By.id("username")).sendKeys("admin");
			browse.findElement(By.name("pwd")).sendKeys("manager");
			browse.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login1(String username,String passward)
	{
		try 
		{ 
			browse.findElement(By.id("username")).sendKeys(username);
			browse.findElement(By.name("pwd")).sendKeys(passward);
			Thread.sleep(2000);
			browse.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
            browse.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login2(String username,String passward)
	{
		try 
		{ 
			browse.findElement(By.id("username")).sendKeys(username);
			browse.findElement(By.name("pwd")).sendKeys(passward);
			Thread.sleep(2000);
			browse.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);            
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void createUser(String fn,String ln,String email,String un,String pwd,String pwdc)
	{
		try
		{
		   
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			browse.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
            browse.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(fn);
            browse.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(ln);
            browse.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
            browse.findElement(By.id("userDataLightBox_usernameField")).sendKeys(un);
            browse.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pwd);
            browse.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(pwdc);
			Thread.sleep(2000);
			browse.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
    private static void modifyUser(String ln,String fn,String pwd)
	{
		try
		{
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
            browse.findElement(By.xpath("//span[text()='"+ln+", "+fn+"']")).click();
			Thread.sleep(3000);
			browse.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pwd);
			Thread.sleep(3000);

			browse.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(pwd);
			Thread.sleep(3000);

			browse.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);


			
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
		    Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void deleteUser(String ln,String fn)
	{
		try
		{
			browse.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();   //users
			Thread.sleep(3000);

            browse.findElement(By.xpath("//span[text()='"+ln+", "+fn+"']")).click();
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
	
	
	
	
	

}
