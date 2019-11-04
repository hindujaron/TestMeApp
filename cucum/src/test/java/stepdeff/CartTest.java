package stepdeff;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdeff.CartObjects;
import stepdeff.Pageobjects;
import stepdeff.registration;

 

public class CartTest {
    WebDriver driver;
    Pageobjects obj3;
    CartObjects c;

 

    
    @Given("login on testmeapp")
    public void login_on_testmeapp() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.setProperty("webdriver.chrome.driver","C:\\jackie\\Drivers\\chromedriver.exe");
       
        driver=new ChromeDriver();
        driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     obj3=new Pageobjects(driver);
     c=new CartObjects(driver);
     obj3.SignIn();
     obj3.userName();
     obj3.password();
     obj3.Login();
    }

 

    @When("Search a product and find details")
    public void search_a_product_and_find_details() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        c.search();
        //c.sea();
        c.find();
    
    }

 

    @Then("Search for cart")
    public void search_for_cart() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        c.cart();
    }

 

    @Then("proceed with payment for empty cart")
    public void proceed_with_payment_for_empty_cart() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}