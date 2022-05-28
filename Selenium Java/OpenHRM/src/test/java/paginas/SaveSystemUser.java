package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SaveSystemUser {
	
	@FindBy(id="systemUser_userType")
	WebElement systemUser_userType;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement nameEmployee;
	
	@FindBy(id="systemUser_status")
	WebElement status;
	
	@FindBy(id = "systemUser_userName")
	WebElement userName;
	
	@FindBy(id = "systemUser_password")
	WebElement password;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirPassword;
	
	@FindBy(id = "btnSave")
	WebElement btnsave;
	
	public SaveSystemUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userRol() {
		
		Select systemUser = new Select(systemUser_userType);
		systemUser.selectByVisibleText("Admin");
		
	}
	
	public void nameEmployee() {
		nameEmployee.sendKeys("Alice Duval");
	}
	
	public void userName(String nombre) {
		userName.sendKeys(nombre);
	}
	
	public void status() {
		Select selStatus = new Select(status);
		selStatus.selectByVisibleText("Enabled");
	}
	
	public void password() {
		
		password.sendKeys("K9j4J4n8*");
		
	}
	
	public void confirPassword() {
		
		confirPassword.sendKeys("K9j4J4n8*");
		
	}
	
	public void btnsave() {
		btnsave.click();
	}
}
