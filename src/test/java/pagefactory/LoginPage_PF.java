package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(xpath="//a[@class='login']")
	WebElement sign_in;
	
	@FindBy(id="user_email")
	WebElement text_username;
	
	@FindBy(id="user_password")
	WebElement text_password;
	
	@FindBy(xpath="//button[text()='Login']")
    WebElement login_button;
	
	WebDriver driver;
	public LoginPage_PF(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver,this);
		
	}
	public void signIn() {
		sign_in.click();
	}
	public void enterUsername(String username) {
		text_username.sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		text_password.sendKeys(pass);
	}
	public void loginClick() {
		login_button.click();
	}
	}


