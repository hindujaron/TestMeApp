package MyDemoPath.CaseStudy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Scenario1 {
	public static WebDriver getDriver(String browser)

	{	
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\jackie\\drivers\\chromedriver.exe");
			return new ChromeDriver();

		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\jackie\\drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}

		else
		{
			System.out.println("Not a valid detail ");
			return null;

		}

	}
}
