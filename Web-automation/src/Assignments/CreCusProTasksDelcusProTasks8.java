package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreCusProTasksDelcusProTasks8 {
    public static WebDriver browse=null;

	public static void main(String[] args)
	{
		launchBrowse();
		navigate();
	    login();
	    createCustomer();
	    createProject();
	    createTask();
	    // deleteTask();
	    //deleteProject();        
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
	
	private static void createTask()
	{
		try 
		{
			browse.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();  //tasks
			Thread.sleep(3000);
			browse.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
            browse.findElement(By.xpath("/html/body/div[11]/div[1]")).click();
			Thread.sleep(2000);
            browse.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("login page");
			Thread.sleep(2000);
            browse.findElement(By.id("descriptionElement")).click();
			Thread.sleep(2000);
			browse.findElement(By.id("editDescriptionPopupText")).sendKeys("login page description");
			Thread.sleep(2000);
			browse.findElement(By.id("scbutton")).click();
			Thread.sleep(2000);
          //  browse.findElement(By.id("//button[text()='set deadline']")).click();
			Thread.sleep(2000);
          //  browse.findElement(By.xpath("//span[text()='16']")).click();
			//Thread.sleep(2000);
           // browse.findElement(By.xpath("//*[@id=\"ext-gen441\"]")).click();
			//Thread.sleep(2000);
          //  browse.findElement(By.id("ext-gen776")).click();
			Thread.sleep(2000);
            browse.findElement(By.xpath("//span[text()='Create Tasks']")).click();
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
