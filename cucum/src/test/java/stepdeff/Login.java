package stepdeff;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	Pageobjects obj;
	
	@Given("I want to login to the app")
	public void i_want_to_login_to_the_app() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jackie\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		 driver.manage().window().maximize(); 
		 obj=new Pageobjects(driver);
	    // Write code here that turns the phrase above into concrete actions
		 //driver.findElement(By.linkText("SignIn")).click();
		obj.SignIn();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		obj.userName();
		obj.password();
//		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
//		 driver.findElement(By.name("password")).sendKeys("Password123");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I should be redirected to the home page")
	public void i_should_be_redirected_to_the_home_page() {
		 
	    // Write code here that turns the phrase above into concrete actions
		obj.Login();
		//driver.findElement(By.name("Login")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I am logged in successfully by clicking the login button")
	public void i_am_logged_in_successfully_by_clicking_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		 
		//throw new io.cucumber.java.PendingException();
	    
	    
	    
	}



}
