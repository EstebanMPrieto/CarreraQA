package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement btnAdmin;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement btnUserManagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement btnUser;
	
	@FindBy(id="systemUser_userName")
	WebElement user;
	
	public DashBoard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void btnAdminClick() {
		
		btnAdmin.click();
	}
	
	public void btnUserManagement() {
		
		btnUserManagement.click();
	}
	
	public void btnUser() {
		
		btnUser.click();
		
	}
	public void user(String nombre) {
		
		
		user.sendKeys(nombre);
		
	}
		
	
}
