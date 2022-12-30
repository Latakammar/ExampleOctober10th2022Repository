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
		closeapp();
	}
	
	private static void lanchBrowser()
	{
		try
		{
			//System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
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
