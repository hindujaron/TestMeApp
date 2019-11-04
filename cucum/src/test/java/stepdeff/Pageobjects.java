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

	@FindBy(linkText="SignUp")
	public static WebElement signup;

	@FindBy(name="userName")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement password;

	@FindBy(name="Login")
	public static WebElement Login;

	@FindBy(name="firstName")
	public static WebElement firstName;

	@FindBy(name="lastName")
	public static WebElement lastName;

	@FindBy(name="confirmPassword")
	public static WebElement confirmPassword;

	@FindBy(xpath="/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")
	public static WebElement male;

	@FindBy(xpath="/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")
	public static WebElement female;

	@FindBy(name="emailAddress")
	public static WebElement emailAddress;

	@FindBy(name="mobileNumber")
	public static WebElement mobileNumber; 

	@FindBy(name="dob")
	public static WebElement dob;

	@FindBy(name="address")
	public static WebElement address;

	@FindBy(name="securityQuestion")
	public static WebElement security;

	@FindBy(name="answer")
	public static WebElement answer;

	@FindBy(name="Submit")
	public static WebElement submit;

	public  void SignIn() {
		signin.click();
	}
	public  void SignUp() {
		signup.click();
	}

	public  void userName() {
		userName.sendKeys("Lalitha");
	}

	public void firstName()
	{
		firstName.sendKeys("jackie");
	}

	public void lastName()
	{
		lastName.sendKeys("hindu");
	}

	public  void password() { 
		password.sendKeys("Password123");
	}

	public  void confimPassword() {
		confirmPassword.sendKeys("8748781");
	}
	public void male()
	{
		male.click();
	}    

	public void female()
	{
		female.click();
	}

	public void emailAddress()
	{
		emailAddress.sendKeys("jackhdfind@gmail.com");
	}

	public void date()
	{
		dob.sendKeys("10/1/22");
	}

	public void address()
	{
		address.sendKeys("india,fyfdbuhudbh");
	}

	public void security()
	{
		security.sendKeys("What is your Birth Place?");
	}

	public void answer()
	{
		answer.sendKeys("m7dc");
	}



	public void register()
	{
		submit.click();
	}
	public void Login() {
		Login.click();
	}
}
