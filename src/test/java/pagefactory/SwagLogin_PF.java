package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin_PF {
	@FindBy(id="user-name")
	WebElement textUsername;

	@FindBy(id="password")
	WebElement textPassword;

	@FindBy(id="login-button")
	WebElement loginBtn;
	
	WebDriver driver;
	public SwagLogin_PF(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		textUsername.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		textPassword.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	

}
