package StepDefinitionsEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.simplilearn.com/");
	}
	
//	@After("@NegativeLogin") // only for negative login this test will be executed
	@After
	public void teardown()
	{
		driver.quit();
	}

}
