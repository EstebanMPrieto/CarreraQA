package Edit.EducacionIt;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Laboratorio1 {
	
	String url = "http://automationpractice.com/index.php";
	String chromePath = "..\\EducacionIt\\Drivers\\chromedriver.exe";
	String firefoxPath = "..\\EducacionIt\\Drivers\\geckodriver.exe";
	WebDriver driver;
	
	@Test
	public void lab1_test() {
		
		System.out.println("¡Hola Mundo de Automatización!");
	}
	
	@Test
	public void lab1_E1() {
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
		
	}
	
	@Test
	public void lab1_E2() {
		
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
		
	}
	
	@Test
	public void lab1_E3() {
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement txtBusqueda = driver.findElement(By.id("search_query_top"));
		txtBusqueda.sendKeys("Dress");
		txtBusqueda.sendKeys(Keys.ENTER);
		driver.quit();
		
		
		
	}

}
