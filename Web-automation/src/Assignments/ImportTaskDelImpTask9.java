package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTaskDelImpTask9 {
    public static WebDriver browse=null;

	public static void main(String[] args)
	{
		launchBrowse();
		navigate();
	    login("admin","manager");
	    //importTask();
	    //deleteImportedTask();
	    // logout();
	    //closeApp();

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
	
	private static void login(String username,String passward)
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
	

}
