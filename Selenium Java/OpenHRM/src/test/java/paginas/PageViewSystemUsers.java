package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageViewSystemUsers {
	
	
	@FindBy(id="btnAdd")
	WebElement btnAdd;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement txtSearchBox;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	@FindBy(id="btnDelete")
	WebElement btnDelete;
	
	@FindBy(css="#systemUser_userName")
	WebElement userName;
	
	@FindBy(css = "#searchSystemUser_userName")
	WebElement searchUser;
	
	@FindBy(id = "ohrmList_chkSelectAll")
	WebElement chkboxSelectAll;
	
	
	public PageViewSystemUsers (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
		
	
	public void btnAdd() {
		
		btnAdd.click();
	}
	
	public void searchUserName(String nombre) {
		txtSearchBox.sendKeys();
	}
	
	
	
	public void searchBtn() {
		searchBtn.click();
	}
	
	public void userName(String nombre) {
		userName.sendKeys(nombre);
	}
	
	public void btnDelete() {
		btnDelete.click();
	}
	
	public void searchUser(String nombre) {
		searchUser.sendKeys(nombre);
	}
	
	public void chkboxSelectAll() {
		chkboxSelectAll.click();
		
	}
	
	
	
}
