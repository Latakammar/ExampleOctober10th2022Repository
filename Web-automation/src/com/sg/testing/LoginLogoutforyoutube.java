package com.sg.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutforyoutube {
    public static WebDriver browse=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigateURL();
		searchFor();
		closeapp();
	}
	
	private static void launchBrowser()
	{
		try
		{
		    System.setProperty("Webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe" );
		    browse=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
		    browse.get("http://www.youtube.com");
		    Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void searchFor()
	{
		try
		{
			browse.findElement(By.xpath("//*[@id=\'search-form\']")).sendKeys("Singara siriye");
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
			browse.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

}
