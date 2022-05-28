package Paginas;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(partialLinkText="Sign")
	WebElement singIn;
	
	public Home(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void sendText() {
		searchBox.sendKeys("Dress");
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void singIn() {
		singIn.click();
	}
	
}
