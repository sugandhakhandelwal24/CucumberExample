package StepDefinitionsEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsdef  {
	
	WebDriver driver = BaseClass.driver;
	 @Given("^User is on the Simplilearn application$")
	    public void user_is_on_the_simplilearn_application() throws Throwable {
		   
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
	    }

	 	@When("^User click on the login link$")
	    public void user_click_on_the_login_link() throws Throwable {
	 		WebElement loginLink = driver.findElement(By.xpath("//*[@class='login']"));
	 		loginLink.click();
	        
	    }
	 
	    @And("^User enters correct username \"([^\"]*)\"$")
	    public void user_enters_correct_username_something(String username) throws Throwable {
	    	WebElement uname = driver.findElement(By.xpath("//*[@name='user_login']"));
	    	uname.sendKeys(username);
	       
	    }

	    @Then("^User should be landed to the homepage$")
	    public void user_should_be_landed_to_the_homepage() throws Throwable {
	    	//WebElement postLoginElement = driver.findElement(By.xpath("//*[contains(text(),'Automation Testing Masters Program')]"));
	    	
	    	
	        
	    }

	    @And("^User enters correct password \"([^\"]*)\"$")
	    public void user_enters_correct_password_something(String password) throws Throwable {
	    	WebElement pass = driver.findElement(By.xpath("//*[@name='user_pwd']"));
	    	pass.sendKeys(password);
	       
	    }

	    @And("^User clicks on the login button$")
	    public void user_clicks_on_the_login_button() throws Throwable {
	    	WebElement loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
	    	loginButton.click();
	    	
	    }

	    @And("^User should see the welcome message$")
	    public void user_should_see_the_welcome_message() throws Throwable {
	        
	    }

}
