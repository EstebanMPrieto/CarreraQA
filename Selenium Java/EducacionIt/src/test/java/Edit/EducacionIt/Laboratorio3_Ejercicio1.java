package Edit.EducacionIt;

import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio3_Ejercicio1 {

	String url = "http://automationpractice.com/index.php";
	String chromePath = "..\\EducacionIT\\Drivers\\chromedriver.exe" ;
	WebDriver driver;
	
	
	@BeforeSuite(description="Iniciamos ChromeDriver")	
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		
	}
	
	@BeforeTest
	public void ingresoURL() {
		
		driver.get(url);
		
		
	}
	
	@BeforeClass
	public void maxVentana() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	
	public void test() {
		
		
	}
	
	
}
