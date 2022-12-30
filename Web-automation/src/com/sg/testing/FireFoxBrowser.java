package com.sg.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser 
{
	
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		lanchBrowser();
          navigate();
		login();
		logout();
		
		closeapp();

	}
	
	private static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyoutWindow()
	{
		try
		{
			//oBrowser.findElements(By.;

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void closeapp()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
