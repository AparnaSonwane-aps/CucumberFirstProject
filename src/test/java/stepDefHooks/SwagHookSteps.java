package stepDefHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagHookSteps {
	WebDriver driver;
	
	@Before(value="@Smoke",order=1)//without order it will execute in alphabetical manner
	@When("User is on login page")
	public void user_is_on_login_page() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/defaultuser0/eclipse-workspace/FirstProject/src/test/resources/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(2000);
		//driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("I m in Before annotation");	
	}
	@Before("order=0")
	public void setup2() {
		System.out.println("I m in setup2 function");	
	}
	@After(order=0)
	public void teardown() {
		driver.close();
		driver.quit();
	System.out.println("I m in teardown after annotation");	
	}
	
	@After(order=1)
	public void teardown2() {
		System.out.println("I m in teardown2 after");	
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("I m in before steps");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("I m in after steps");
	}
	
	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {
	   
	}

	@And("clicks on login")
	public void clicks_on_login() {
	    
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	  
	}

}
