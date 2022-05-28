package paginas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id = "search_query_top")
	WebElement txtSearch;
	
	public Home(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void txtSearch() {
		
		txtSearch.sendKeys("Dress");
		txtSearch.sendKeys(Keys.ENTER);
	}

}
