package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class searchVegStepDefinations {
	 WebDriver driver;

    @Given("^user is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
        driver = BaseDriver.driverInitialization();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
     }

    @When("^user searches for \"([^\"]*)\" vegetable$")
    public void user_searches_for_something_vegetable(String strArg1) throws Throwable {
    	 driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	 //driver.findElement(By.xpath("//button[@type='submit']")).click(); 
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Thread.sleep(2000);
       Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='product-name']")).getText().contains(strArg1));
    }
    
    @And("^user clicks on plus sign$")
    public void user_clicks_on_plus_sign() throws Throwable {
    	driver.findElement(By.cssSelector(".increment")).click();
    }

    @And("^user clicks on Add to cart button$")
    public void user_clicks_on_add_to_cart_button() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[@class='product-action']")).click();
    }

    @And("^user click on cart and proceed to checkout$")
    public void user_click_on_cart_and_proceed_to_checkout() throws Throwable {
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector(".cart-icon")).click();
    	driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
    }

    @And("^user verifies \"([^\"]*)\" has been added in cart$")
    public void user_verifies_something_has_been_added_in_cart(String strArg1) throws Throwable {
    	Thread.sleep(2000);
    	Assert.assertTrue(driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains(strArg1));
    }

}