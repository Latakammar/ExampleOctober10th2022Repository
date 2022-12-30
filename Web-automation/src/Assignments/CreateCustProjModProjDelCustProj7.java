package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustProjModProjDelCustProj7        //7 all fine
{
    public static WebDriver browse=null;

	public static void main(String[] args)
	{
		launchBrowse();
		navigate();
	    login("admin","manager");
	    createCustomer();
	    createProject();
	    modifyProject();         
	   // deleteProject();        
	   deleteCustomer();
	   logout();
	   closeApp();
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();  //tasks
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='Add New']")).click();   //add new
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='+ New Customer']")).click();    //new customer
			Thread.sleep(3000);
			browse.findElement(By.id("customerLightBox_nameField")).sendKeys("IRCTC");
			browse.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Indian railway app for pre-booking");
			Thread.sleep(3000);
			browse.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	private static void createProject()
	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();  //tasks
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='Add New']")).click();   //add new
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(2000);

			browse.findElement(By.id("projectPopup_projectNameField")).sendKeys("IRCTC app project");
			Thread.sleep(1000);

			//browse.findElement(By.id("ext-gen328")).click();
			//Thread.sleep(2000);

			//browse.findElement(By.linkText("IRCTC")).click();
			//Thread.sleep(2000);

			browse.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void modifyProject()
	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();  //tasks
			Thread.sleep(2000);
            browse.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();   //setting for project
			Thread.sleep(2000);
           
            browse.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("IRCTC project description");  //edit projectdescription
			Thread.sleep(2000);     
            browse.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();  //close window option
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void deleteProject()
	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();  //tasks
			Thread.sleep(3000);
			browse.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
            browse.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			browse.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			browse.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	
	private static void deleteCustomer()

	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(3000);
			browse.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();   // customer settings
			Thread.sleep(3000);
			browse.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();     //action
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			browse.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
              Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
}
