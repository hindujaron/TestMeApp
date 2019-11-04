package stepdeff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	Pageobjects obj;

	@Given("larry has registered in the testme app")
	public void larry_has_registered_in_the_testme_app() {

		System.setProperty("webdriver.ie.driver", "C:\\jackie\\drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize(); 
		obj=new Pageobjects(driver);
		// Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.linkText("SignIn")).click();
		obj.SignIn();
		//throw new io.cucumber.java.PendingException();
	}

	@When("larry logged in with below {string} and {string}")
	public void larry_logged_in_with_below_username_and_password(String username,String password) {
		// Write code here that turns the phrase above into concrete actions
		obj.userName(username);
		obj.password(password);
		//		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		//		 driver.findElement(By.name("password")).sendKeys("Password123");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("larry login successful in testme app")
	public void larry_login_successful_in_testme_app() {

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
