package AssignmentOnPageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2ThreeUserOperation {
    public static WebDriver browse=null;
    public static ActitimeWebElements opage=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		//--------------------------
	/*	login();
		createUser("user1","user1","user1@gmail.com","USER1","User1@123","User1@123");
		createUser("user2","user2","user2@gmail.com","USER2","User2@123","User2@123");
		createUser("user3","user3","user3@gmail.com","USER3","User3@123","User3@123");
		logout();
		//---------------------------
		login1("user1","User1@123");
		logout();
		login1("user2","User2@123");
		logout();
		login1("user3","User3@123");
		logout();
		//----------------------------
		login2("user1","User1@123");
        modifyUser1("User1@1234");
        logout();
        login2("user2","User2@123");
        modifyUser2("User2@1234");
        logout();
        login2("user3","User3@123");
        modifyUser3("User3@1234");
        logout();
        //---------------------------------
        login2("user1","User1@1234");
        logout();
        login2("user2","User2@1234");
        logout();
        login2("user3","User3@1234");
        logout();
		//-----------------------------------
        login();
        modifyUser1("User1@12345");
        modifyUser2("User2@12345");
        modifyUser3("User3@12345");
        logout(); 
        //----------------------------
        login2("user1","User1@12345");
        logout();
        login2("user2","User2@12345");
        logout();
        login2("user3","User3@12345");
        logout();  
        *///-------------------------------
        login();
       // deleteUser1();
        deleteUser2();
        deleteUser3();
        logout();
        
	}
	private static void launchBrowser()
	{
		try
		{
		   System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe" );
		   browse=new ChromeDriver();
		   //browse.manage().deleteAllCookies();
		   browse.manage().window().maximize();
		   opage=new ActitimeWebElements(browse);
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
			opage.getUsername().sendKeys("admin");
			opage.getPwd().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLoginButton().click();
			Thread.sleep(4000);
		   
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void login1(String user,String password)
	{ 
		try
		{
			opage.getUsername().sendKeys(user);
			opage.getPwd().sendKeys(password);
			Thread.sleep(2000);
			opage.getLoginButton().click();
			Thread.sleep(4000);
			opage.getstartExploringActiTime().click();
			Thread.sleep(4000);

	  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void createUser(String fn,String ln,String email,String un,String pwd,String pwdCopy)
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(3000);
			opage.getAddUser().click();
			Thread.sleep(3000);
			opage.getFirstName().sendKeys(fn);
			opage.getLastName().sendKeys(ln);
			opage.getEmail().sendKeys(email);
			opage.getun().sendKeys(un);
			opage.getpassword().sendKeys(pwd);
			opage.getPasswordCopy().sendKeys(pwdCopy);
			opage.getcreateUser().click();
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
			opage.getLogoutButton().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login2(String username,String password)
	{
		try
		{
			opage.getUsername().sendKeys(username);
			opage.getPwd().sendKeys(password);
			Thread.sleep(2000);
			opage.getLoginButton().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
	
	private static void modifyUser1(String pwd)
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getclickOnuser1().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys(pwd);
            opage.getPasswordCopy().sendKeys(pwd);
			opage.getsaveChanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	private static void modifyUser2(String pwd)
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getclickOnuser2().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys(pwd);
            opage.getPasswordCopy().sendKeys(pwd);
			opage.getsaveChanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}		
	private static void modifyUser3(String pwd)
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(2000);
			opage.getclickOnuser3().click();
			Thread.sleep(2000);
			opage.getpassword().sendKeys(pwd);
            opage.getPasswordCopy().sendKeys(pwd);
			opage.getsaveChanges().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(3000);
			opage.getclickOnuser1().click();
			Thread.sleep(3000);
			opage.getdeleteUser().click();
			Thread.sleep(3000);
			Alert obj=browse.switchTo().alert();
			obj.accept();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(3000);
			opage.getclickOnuser2().click();
			Thread.sleep(3000);
			opage.getdeleteUser().click();
			Thread.sleep(3000);
			Alert obj=browse.switchTo().alert();
			obj.accept();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try
		{
			opage.getUsers().click();
			Thread.sleep(3000);
			opage.getclickOnuser3().click();
			Thread.sleep(3000);
			opage.getdeleteUser().click();
			Thread.sleep(3000);
			Alert obj=browse.switchTo().alert();
			obj.accept();
			Thread.sleep(3000);

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
