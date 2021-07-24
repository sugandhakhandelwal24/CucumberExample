package StepDefinitionsEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBSignUpSteps {

	WebDriver driver = BaseClass.driver;
	
  	@Given("^User has launched the FB application$")
    public void user_has_launched_the_fb_application() throws Throwable {
  		
  		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }

    @When("^User clicks on the Create New Account Link$")
    public void user_clicks_on_the_create_new_account_link() throws Throwable {
    	
    	WebElement CreateAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
    	CreateAccount.click();
        
    }
    
    @And("^User creates the new account$")
    public void user_creates_the_new_account(DataTable table) throws Throwable {
    	
    	String FirstName = table.cell(1, 1);
    	String LastName = table.cell(2, 1);
    	String MobileNum = table.cell(3, 1);
    	String Password = table.cell(4, 1);
    	
    	WebElement tbFirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
    	WebElement tbLastName = driver.findElement(By.xpath("//*[@name='lastname']"));
    	WebElement tbMobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
    	WebElement tbPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
    	
    	tbFirstName.sendKeys(FirstName);
    	tbLastName.sendKeys(LastName);
    	tbMobile.sendKeys(MobileNum);
    	tbPassword.sendKeys(Password);  	
    }
    @And("^User click on the SignUp button$")
    public void user_click_on_the_signup_button() throws Throwable {
        
    }

    @Then("^user should be able to see the success message$")
    public void user_should_be_able_to_see_the_success_message() throws Throwable {
        
    }

  

    @And("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_something_something_and_something(String firstname, String lastname, String mobilenum, String password) throws Throwable {
       
    }

    @And("^User selects \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_selects_something_something_and_something(String month, String date, String year) throws Throwable {
        
    }



	@Given("^User is on the facebook page$")
    public void user_is_on_the_facebook_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        
    }

    @When("^User clicks on Create New Account button$")
    public void user_clicks_on_create_new_account_button() throws Throwable {
    	WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		CreateAccount.click();
    	
    }

    @Then("^User should see the success message$")
    public void user_should_see_the_success_message() throws Throwable {
    	
       
    }

    @And("^User enters firstname \"([^\"]*)\"$")
    public void user_enters_firstname_something(String firstname) throws Throwable {
    	WebElement firstName = driver.findElement(By.xpath("//input[@name ='firstname']"));
    	firstName.sendKeys(firstname);
      
    }

    @And("^User enters lastname \"([^\"]*)\"$")
    public void user_enters_lastname_something(String lastname) throws Throwable {
    	WebElement lastName = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[1]"));
		lastName.sendKeys(lastname);
    }

    @And("^User enters mobile number \"([^\"]*)\"$")
    public void user_enters_mobile_number_something(String mobilenum) throws Throwable {
    	WebElement MobileNo = driver.findElement(By.xpath("//input[@name ='firstname'] //following::input[2]"));
		MobileNo.sendKeys(mobilenum);
        
    }

    @And("^User enters new password \"([^\"]*)\"$")
    public void user_enters_new_password_something(String password) throws Throwable {
    	WebElement password1 = driver.findElement(By.xpath("//input[@name ='reg_passwd__'] "));
		password1.sendKeys(password);
    }

    @And("^User selects month \"([^\"]*)\"$")
    public void user_selects_month_something(String month) throws Throwable {
    	WebElement birthmonth = driver.findElement(By.xpath("//select[@id ='month' ] "));
		Select DOBmonth = new Select(birthmonth);
		
		DOBmonth.selectByVisibleText(month);
    }

    @And("^User selects date \"([^\"]*)\"$")
    public void user_selects_date_something(String date) throws Throwable {
    	WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day' ] "));
		Select DOBbirthday = new Select(birthday);
		DOBbirthday.selectByVisibleText(date);
    }

    @And("^User selects year \"([^\"]*)\"$")
    public void user_selects_year_something(String year) throws Throwable {
    	WebElement birthyear = driver.findElement(By.xpath("//select[@name='birthday_year' ] "));
		Select DOByear = new Select(birthyear);
		DOByear.selectByValue(year);
       
    }

    @And("^User selects gender \"([^\"]*)\"$")
    public void user_selects_gender_something(String gender) throws Throwable {
    	WebElement Gender = driver.findElement(By.xpath("//input[@name='sex' ] "));
		Gender.click();
    }
        

    @And("^User click on Sign up button$")
    public void user_click_on_sign_up_button() throws Throwable {
    	WebElement SignUp= driver.findElement(By.xpath("//button[@name='websubmit' ] "));
		SignUp.click();
    }
}
