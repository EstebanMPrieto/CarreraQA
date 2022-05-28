package SouceDemo.SouceDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_BonusTrack1 {
	
	//Atributos: Variables de uso general.
	String url = "https://www.saucedemo.com/";
	String chromePath = "..\\SauceDemo\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	@Test
	public void abrirHomeLogin() {
		
		//Paso 1: Indicar donde esta el Driver.exe
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		//Paso 2: Abrimos el navegador,Maximizamos,Limpiamos las Cookies y ingresamos al URL: https://www.saucedemo.com/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		//Paso 3: Identificamos los campos "Username" y "Password" y los llenamos con los siguientes datos.
		//Usurio: standard_user
		//Contraseña: secret_sauce
		//Paso 4: hacemos click en Loguin.
		//Paso 5: Cerramos el navegador.
		
		WebElement txtlogin = driver.findElement(By.id("user-name"));
		txtlogin.sendKeys("standard_user");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("secret_sauce");
		WebElement botonLogin = driver.findElement(By.id("login-button"));
		botonLogin.click();
		driver.quit();
		
	}

}
