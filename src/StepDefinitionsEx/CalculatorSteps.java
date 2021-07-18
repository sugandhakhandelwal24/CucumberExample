package StepDefinitionsEx;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {

	int result;
	int multiplyResult;
	
	  @Given("^Calculator application is already open$")
	    public void calculator_application_is_open() throws Throwable {
	        
		  System.out.println("Calculator application is opened");
	    }

	  @When("^I add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_add_two_numbers_something_and_something(int num1, int num2) throws Throwable {
	    	result = num1+num2;
	       
	    }

	    @Then("^I should get the result as \"([^\"]*)\"$")
	    public void i_should_get_the_result_as_something(int expResult) throws Throwable {
	 
	    	/*if(result == expResult)
	    	{
	    		System.out.println("Test Passed");
	    	}
	    	else {
	    		System.out.println("Test Failed");
	    	}*/
	    	
	    	Assert.assertEquals(expResult, result);
	    }
	    
	    @When("^I multiply two number \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_multiply_two_number_something_and_something(int num3, int num4) throws Throwable {
	    	multiplyResult = num3*num4;
	    }

	    @Then("^I should get the result \"([^\"]*)\"$")
	    public void i_should_get_the_result_something(int expectedResult) throws Throwable {
	    	Assert.assertEquals(expectedResult, multiplyResult);
	    }
}
