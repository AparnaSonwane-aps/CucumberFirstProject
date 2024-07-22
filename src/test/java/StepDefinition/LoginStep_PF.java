package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage_PF;

public class LoginStep_PF {
	WebDriver driver;
	LoginPage_PF login;
	
	@Given("user is on login page")
	public void verifyLoginPage() throws Exception {
	  System.out.println("inside 1st step & ====In Practice login step class===");
	  System.setProperty("webdriver.gecko.driver", "C:/Users/defaultuser0/eclipse-workspace/FirstProject/src/test/resources/Drivers/geckodriver.exe");
      driver=new FirefoxDriver();
      driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get("https://orangehrm.zendesk.com/auth/v2/login/signin");
	  Thread.sleep(3000);
	  //login.signIn();
	}

	@When("user enters user1 and pass1(.*) and (.*)$")
	public void user_enters_user1_and_pass1(String username,String password) throws InterruptedException {
		 System.out.println("inside 2nd step");
		 login=new LoginPage_PF(driver); 
		 login.enterPassword(username);
		 Thread.sleep(2000);
		 login.enterPassword(password);
		 Thread.sleep(2000);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("inside 3rd step");
		login.loginClick();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("inside 4th last step");
		driver.getPageSource().contains("You logged into");
		Thread.sleep(2000);
		driver.close();
	}
}



