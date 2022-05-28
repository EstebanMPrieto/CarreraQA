package EducacionIT.OpenHRM;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import paginas.DashBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_BonusTrack1b {
	
	//Atributos: Variables de uso general.
	
	String url = "https://opensource-demo.orangehrmlive.com/";
	String chromePath = "..\\OpenHRM\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	@BeforeTest
	
	public void setUp() {
		
		//Paso 1: Indicar donde esta el Driver.exe
		
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		//Paso 2: Abrimos el navegador,Maximizamos y ingresamos al URL: https://opensource-demo.orangehrmlive.com/
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	
	@Test
	
		public void paginaLogin() {
	
		
		/*
		Paso 3: Identificamos los campos "Username" y "Password" y los llenamos con los siguientes datos.
				Usurio: Admin
				Contraseña: admin123
		Paso 4: hacemos click en Loguin.
		Paso 5: Cerramos el navegador.
		*/
		
		WebElement txtUsuario = driver.findElement(By.id("txtUsername"));
		txtUsuario.sendKeys("Admin");
		WebElement txtContraseña = driver.findElement(By.id("txtPassword"));
		txtContraseña.sendKeys("admin123");
		WebElement botonLogin = driver.findElement(By.id("btnLogin"));
		botonLogin.click();
		
		
	}
	
	public void adminclick() {
	 DashBoard txtclick = new DashBoard(driver);
	 txtclick.btnAdminClick();
	}
	
	@AfterSuite
	public void close() {
		
		driver.close();
		
	}
}
