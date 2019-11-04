package stepdeff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

 
public class CartObjects {
    WebDriver driver;
     public CartObjects(WebDriver driver) {
         PageFactory.initElements(driver,this);
         
}
     @FindBy(name="products")
     public static WebElement search;
     public void search() {
         search.sendKeys("Headphone");
                
     }
    
     @FindBy(xpath="/html/body/div[1]/form/input")
     public static WebElement find;
     public void find() {
         find.click();
        
     }
     @FindBy(linkText="Cart")
     public static WebElement cart;
     public void cart() {
         try {
             
         
    String a=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).getText();
        if (a.equals("Cart")) {
            driver.switchTo().alert().sendKeys("Procced to pay");
            
        }
        else {
            driver.switchTo().alert().sendKeys("Cannot Procced to pay");
        }
         }
         catch(Exception e) {
             System.out.println("Do NOT procced to payment page");
         }
     }
     
}
 