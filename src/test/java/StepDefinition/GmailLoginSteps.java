//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import PageOM.GmailLoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GmailLoginSteps {
//	WebDriver driver;
//	GmailLoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() throws Exception {
//		System.setProperty("webdriver.gecko.driver", "C:/Users/defaultuser0/eclipse-workspace/FirstProject/src/test/resources/Drivers/geckodriver.exe");
//	    driver=new FirefoxDriver();
//	    driver.manage().window().maximize();
//		Thread.sleep(3000);
//	    System.out.println("User opne browser");
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws Exception {
//		driver.get("https://www.gmail.com");
//		Thread.sleep(6000);  
//		System.out.println("User is on Gmail page"); 
//	}
//
//	@When("user enter username(.*) and (.*)$")
//	public void user_enter_username_and_password(String username,String password) throws Exception {
//		login=new GmailLoginPage(driver);
//		
//		login.enterUsername(username);
//		Thread.sleep(2000);
//		login.nextBtnClick();
//		Thread.sleep(2000);
//		login.enterPassword(password);
//		Thread.sleep(2000);
//		
//	    //driver.findElement(By.id("identifierId")).sendKeys(username);
//	    //Thread.sleep(3000);
//		//driver.findElement(By.xpath("//div[@id='identifierNext')]")).click();
//		//Thread.sleep(3000); 
//		 //driver.findElement(By.id("//input[@type='password']")).sendKeys(password);
//		 //Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws Exception {
//		login.loginBtnClick();
//		Thread.sleep(2000);	
//		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		//Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws Exception {
//	    driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).isDisplayed();
//	    Thread.sleep(2000);
//	    driver.close();
//	}
//}
