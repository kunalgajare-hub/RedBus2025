package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass {
	
	protected static WebDriver driver;
	
	public static void Initialization(String browsername, String url)
	{
		if(browsername.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.contains("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browsername.contains("incognito"))
		{
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		}
		else 
		{
			System.out.println("Please Enter a Valid BrowserName");
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
	}
	
	public static void Close()
	{
		driver.quit();
	}

}
