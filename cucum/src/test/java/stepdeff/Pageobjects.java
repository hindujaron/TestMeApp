package stepdeff;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobjects {

	WebDriver driver;
	
	 public Pageobjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="SignIn")
	public static WebElement signin;

	@FindBy(name="userName")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement password;

	@FindBy(name="Login")
	public static WebElement Login;
	
	

	public  void SignIn() {
	signin.click();
	}

	public  void userName() {
		userName.sendKeys("Lalitha");
	}

	public  void password() {
	password.sendKeys("Password123");
	}

	public void Login() {
		Login.click();
	}


}
