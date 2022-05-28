package Edit.EducacionIt;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_BonusTrack2b {
	String url = "https://opensource-demo.orangehrmlive.com/";
	String chromePath = "..\\OpenHRM\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		}

	@BeforeTest
	public void irURL() {
		
		driver.get(url);
		
	}
	
	@Test
	public void loginHRM(){
		
		//Login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		
		WebElement txtUser = driver.findElement(By.id("txtUsername"));
		txtUser.clear();
		txtUser.sendKeys("Admin");
		
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.clear();
		txtPassword.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		//
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainMenu")));
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAdd")));
		
		
	}
		
}
