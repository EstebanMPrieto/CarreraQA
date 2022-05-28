package Edit.EducacionIt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Paginas.Home;
import org.testng.Assert;

public class Laboratorio6 {
	String url = "http://automationpractice.com/index.php";
	String chromeDriverPath = "..\\EducacionIT\\Drivers\\chromedriver.exe";
	String fireFoxDriverPath = "..\\EducacionIT\\Drivers\\geckodriver.exe";
	WebDriver driver;
	
	@Parameters("navegador")

	@BeforeTest
	public void setUp(String navegador) {
		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void buscarPalabra() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
		
		Home txt = new Home(driver);
		txt.sendText();
		
		Assert.assertEquals(driver.getTitle(), "Search - My Store");
		
	}
}
