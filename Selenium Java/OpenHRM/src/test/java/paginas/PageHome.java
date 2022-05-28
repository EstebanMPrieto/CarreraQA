package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHome {
	@FindBy(css = "#txtUsername")
	WebElement userName;
	
	@FindBy(css="#txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	public PageHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void datosUser() {
		userName.sendKeys("Admin");
	}
	
	public void txtPassword() {
		txtPassword.sendKeys("admin123");
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	
}
