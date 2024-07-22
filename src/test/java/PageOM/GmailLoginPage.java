//package PageOM;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class GmailLoginPage {
//	protected WebDriver driver;
//	
//	private By text_username=By.id("identifierId");
//	
//	private By next_button=By.xpath("//div[@id='identifierNext')]");
//	
//	private By text_password=By.xpath("//input[@type='password']");
//	
//	private By login_button=By.xpath("//span[contains(text(),'Next')]");
//    public GmailLoginPage (WebDriver driver) {
//    	this.driver=driver;
//    }
//	
//	public void enterUsername(String username) {
//		driver.findElement(text_username).sendKeys(username);
//	}
//	
//	public void nextBtnClick() {
//		driver.findElement(next_button).click();
//	}
//	
//	public void enterPassword(String password) {
//		driver.findElement(text_password).sendKeys(password);
//	}
//	
//	public void loginBtnClick() {
//		driver.findElement(login_button).click();
//	}
//
//}
