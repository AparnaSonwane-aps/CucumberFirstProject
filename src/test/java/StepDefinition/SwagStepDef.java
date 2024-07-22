package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import PageOM.Swag_POM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.SwagLogin_PF;

public class SwagStepDef {
	WebDriver driver;
	SwagLogin_PF login;
	@Before
	@Given("User is on login page")
	public void user_is_on_login_page() throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:/Users/defaultuser0/eclipse-workspace/FirstProject/src/test/resources/Drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}

	@When("User enters (.*) and (.*)$")
	public void user_enters_credentials(String username,String password) throws Exception {
	    //driver.findElement(By.id("user-name")).sendKeys(username);
		login=new SwagLogin_PF(driver);
	    login.enterUsername(username);
		Thread.sleep(2000);
	    //driver.findElement(By.id("password")).sendKeys(password);
		login.enterPassword(password);
	}

	@And("User click on login button")
	public void user_click_on_login_button() throws Exception {
		Thread.sleep(2000);
		//driver.findElement(By.id("login-button")).click();
		login.clickOnLoginBtn();
		Thread.sleep(2000);
	}
    @After
	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage(Scenario scenario) throws Exception {
	    System.out.println("login successful user is on home page");
        driver.getPageSource().contains("Products");
        Thread.sleep(2000);
//    	String scenarioName=scenario.getName();
//    	
//        if(scenario.isFailed()){
//         TakesScreenshot ts=(TakesScreenshot)driver;
//         byte[] source      =ts.getScreenshotAs(OutputType.BYTES);
//         scenario.attach(source, "image/png", scenarioName);
//        }
//	    //# for full screenshot (workable)
	     TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(source,new File("./ScreenshotTaken/firstscreenshot.png"));
		 System.out.println("screenshot taken");
		
	    //for portion screenshot
//	    WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
//	    File source1=ele.getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(source1, new File ("./ScreenshotTaken/pageSection.png"));
//	    System.out.println("screenshot taken");
//	    Thread.sleep(2000);
        
       
    	   
       
        driver.close();
	}
}
