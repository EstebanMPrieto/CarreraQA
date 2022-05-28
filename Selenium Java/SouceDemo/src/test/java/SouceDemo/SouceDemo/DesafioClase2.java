package SouceDemo.SouceDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesafioClase2 {
	
	String url = "https://www.saucedemo.com/";
	String chromePath = "..\\SouceDemo\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",chromePath);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@BeforeTest
	public void irURL(){
		driver.get(url);
	}
	
	
	@Test
	public void OrdenDeCompra(){
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("root")));
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();
		
		WebElement txt = driver.findElement(By.id("item_4_title_link"));
		AssertJUnit.assertEquals(txt.getText(), "Sauce Labs Backpack");
		
		WebElement txt2 = driver.findElement(By.id("item_1_title_link"));
		AssertJUnit.assertEquals(txt2.getText(), "Sauce Labs Bolt T-Shirt");
		
		WebElement txt3 = driver.findElement(By.id("item_2_title_link"));
		AssertJUnit.assertEquals(txt3.getText(),"Sauce Labs Onesie");
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		
		driver.findElement(By.id("checkout")).click();
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
		driver.findElement(By.id("first-name")).sendKeys("test");
		driver.findElement(By.id("last-name")).sendKeys("test");
		driver.findElement(By.id("postal-code")).sendKeys("15554");
		driver.findElement(By.id("continue")).click();
		
		WebElement txt4 = driver.findElement(By.className("summary_subtotal_label"));
		AssertJUnit.assertEquals(txt4.getText(),"Item total: $53.97");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		driver.findElement(By.id("finish")).click();
		
		
	}
	
	@AfterSuite
	
		public void cerraChrome(){
			driver.quit();
		}
	

}
