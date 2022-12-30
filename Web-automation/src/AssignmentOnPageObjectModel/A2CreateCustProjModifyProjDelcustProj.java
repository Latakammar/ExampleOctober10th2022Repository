package AssignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2CreateCustProjModifyProjDelcustProj       /// 7 all fine 
{
    public static WebDriver browse=null;
    public static ActitimeWebElements opage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		modifyProject();
		deleteCustomer();
		//logout();
		//closeApp();

	}
	
	private static void modifyProject()
	{
		try
		{
			opage.gettasks().click();
			Thread.sleep(3000);
			opage.getprojectSettings().click();
			Thread.sleep(3000);
			opage.getprojectDescription().sendKeys("description");
			Thread.sleep(3000);
			opage.getprojectWindowClose().click();
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
			opage.gettasks().click();
			Thread.sleep(2000);
			opage.gettasksaddnew().click();
            Thread.sleep(2000);
            opage.getnewProject().click();
            Thread.sleep(3000);
            opage.getprojectPopup_projectNameField().sendKeys("IRCTC Rail");
            Thread.sleep(2000);
            opage.getprojectPopup_projectDescriptionField().sendKeys("IRCTC Rail description");
            Thread.sleep(3000);

            opage.getcreateProject().click();
            Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
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
	private static void createCustomer()
	{
		try
		{
			opage.gettasks().click();
            Thread.sleep(3000);
			opage.gettasksaddnew().click();
            Thread.sleep(2000);
			opage.getnewCustomer().click();
            Thread.sleep(2000);
			opage.getcustomerLightBox_nameField().sendKeys("IRCTC");
			opage.getcustomerLightBox_descriptionField().sendKeys("Railway app project");
			opage.getcreateCustomerButton().click();
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
			opage.gettasks().click();
            Thread.sleep(2000);
            opage.getcustomerSettings().click();
            Thread.sleep(2000);
            opage.getcustomerAction().click();
            Thread.sleep(2000);
            opage.getcustomerDelete().click();
            Thread.sleep(2000);
            opage.getcustomerPanel_deleteConfirm_submitTitle().click();
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
