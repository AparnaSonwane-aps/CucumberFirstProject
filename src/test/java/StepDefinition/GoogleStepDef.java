//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import io.cucumber.*;
//
//import io.cucumber.java.en.*;
//import pagefactory.LoginPage_PF;
//
//
//public class GoogleStepDef_PF {
//
//      WebDriver driver=null;
//      
//		@Given("browser is open")
//		public void Browser_is_open() throws Exception {
//		    System.out.println("In browser open step");
//		    System.setProperty("webdriver.gecko.driver", "C:/Users/defaultuser0/eclipse-workspace/FirstProject/src/test/resources/Drivers/geckodriver.exe");
//		    driver=new FirefoxDriver();
//		    
//		}
//		@Given("user is on google search page")
//		public void user_is_on_google_search_page() throws Exception {   
//		    driver.navigate().to("http://www.google.com");
//		    driver.manage().window().maximize();
//			Thread.sleep(3000);
//		    System.out.println("In user is on Google search page step");
//		    
//		}
//
//		@When("user enters a text in search box")
//		public void user_enters_a_text_in_search_box() throws Exception {
//			 System.out.println("In user enters text in search box step");
//			 driver.findElement(By.name("q")).sendKeys("selenium webdriver");
//			 Thread.sleep(6000);
//		}
//
//		@And("hits enter")
//		public void hits_enter() throws Exception {
//			 System.out.println("user hits enter step");
//			 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//			 Thread.sleep(6000);
//		}
//
//		@Then("user should navigate to result page")
//		public void user_should_navigate_to_result_page() {
//			 System.out.println("In user navigate to result page step");
//		     driver.getPageSource().contains("Downloads");	
//		     driver.close();
//	}
//}
//
package StepDefinition;


