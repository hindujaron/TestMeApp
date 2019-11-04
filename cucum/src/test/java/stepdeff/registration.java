package stepdeff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration {
	WebDriver driver;

	Pageobjects obj;
	@Given("I want to register to the app")
	public void i_want_to_register_to_the_app() {
		// Write code here that turns the phrase above into concrete actions


		System.setProperty("webdriver.chrome.driver", "C:\\jackie\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize(); 
		obj=new Pageobjects(driver);
		obj.SignUp();
	}

	@When("I enter details")
	public void i_enter_details() {
		// Write code here that turns the phrase above into concrete actions
		obj.userName();
		obj.password();
		obj.firstName();
		obj.lastName();
		obj.confimPassword();
		obj.male();
		//obj.female();
		obj.emailAddress();
		obj.date();
		obj.address();
		obj.security();
		obj.answer();


	}

	@Then("I am registered successfully")
	public void i_am_registered_successfully() {
		// Write code here that turns the phrase above into concrete actions
		obj.register();
	}

	@Then("I should be redirected to the Login page")
	public void i_should_be_redirected_to_the_Login_page() {
		// Write code here that turns the phrase above into concrete actions

	}

}
