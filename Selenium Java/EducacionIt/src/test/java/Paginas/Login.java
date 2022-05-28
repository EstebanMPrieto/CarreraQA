package Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
	
	@FindBy(id = "SubmitCreate")
	WebElement btnCreate;
	
	@FindBy(id="email_create")
	WebElement emailBox;
	
	@FindBy(css="#id_gender1")
	WebElement genderbtn;
	
	@FindBy(name="customer_firstname")
	WebElement fnameBtn;
	
	@FindBy(id="customer_lastname")
	WebElement lnameBtn;
	
	@FindBy(id="passwd")
	WebElement cPass;
	
	@FindBy(id="days")
	WebElement days;
	
	@FindBy(id="months")
	WebElement months;
	
	@FindBy(id="years")
	WebElement years;
	
	@FindBy(id="newsletter")
	WebElement nletter;
	
	@FindBy(id="optin")
	WebElement optin;
	
	@FindBy(css="#company")
	WebElement company;
	
	@FindBy(css="#address1")
	WebElement address;
	
	@FindBy(css="#city")
	WebElement city;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="phone_mobile")
	WebElement phone;
	
	@FindBy(id="alias")
	WebElement alias;
	
	@FindBy(id="submitAccount")
	WebElement submit;
	
	
	
	public Login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void emailBox(String email) {
		emailBox.sendKeys(email);
	}
	
	public void btnCreate() {
		
		btnCreate.click();
	}
	
	public void genderbtn() {
		genderbtn.click();
	}
	
	public void fnameTxt() {
		
		fnameBtn.sendKeys("Arturo");
	}
	
	public void lnameTxt() {
		lnameBtn.sendKeys("Pekerman");
	}
	
	public void cPass() {
		cPass.sendKeys("HolaMundo");
	}
	
	public void nletter() {
		nletter.click();
	}
	
	public void optin() {
		optin.click();
	}
	
	public void company() {
		company.sendKeys("CompumundoHiperMegaRed");
	}
	
	public void address() {
		address.sendKeys("calle falsa 123");
	}
	
	public void city() {
		city.sendKeys("Springfield");
	}
	
	public void postcode() {
		postcode.sendKeys("22423");
	}
	
	public void phone() {
		phone.sendKeys("1133443355");
	}
	
	public void alias() {
		alias.clear();
		alias.sendKeys("Trabajo");
	}
	
	public void submit() {
		submit.click();
	}

}
