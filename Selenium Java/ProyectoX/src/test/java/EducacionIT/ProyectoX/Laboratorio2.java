package EducacionIT.ProyectoX;

import org.testng.annotations.Test;

import Utilities.CapturaEvidencia;
import paginas.Home;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Laboratorio2 
{
	
	//Atributos: Variables de uso general.
	String url = "http://automationpractice.com/index.php";
	String chromePath = "..\\ProyectoX\\Driver\\chromedriver.exe";
	String firefoxPath = "..\\ProyectoX\\Driver\\geckodriver.exe";
	String evidenciaPath = "..\\ProyectoX\\Evidencia\\AutomationPractice.docx";
	String TituloEvidencia = "Automation Practice";
	WebDriver driver;
	
	//Metodos: Rutinas para automatizar en Chrome y Firefox
	@Test
	public void buscarPalabraChrome() throws InvalidFormatException, IOException, InterruptedException 
	{
		
		//Paso 1: Indicar donde esta el Driver.exe
		System.setProperty("webdriver.chrome.driver",chromePath);
		//Paso 2: Abrir la Pagina que queremos Automatizar
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//Paso 3: Escribir la palabra a buscar
		
		Home txtsearch = new Home(driver);
		txtsearch.txtSearch();
		
		CapturaEvidencia.escribirTituloEnDocumento(evidenciaPath, TituloEvidencia, 24);
		CapturaEvidencia.capturarPantallaEnDocumento(driver, evidenciaPath + "img.jpg", evidenciaPath, "Resultado de la Busqueda");
		
		
		//Paso 5: Cerrar el navegador
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Test
	public void buscarPalabraFirefox() 
	{
		
		//Paso 1: Indicar donde esta el Driver.exe
		System.setProperty("webdriver.gecko.driver",firefoxPath);
		
		//Paso 2: Abrir la Pagina que queremos Automatizar
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//Paso 3: Escribir la palabra a buscar
		WebElement txtBuscador = driver.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("Dress");
		
		//Paso 4: Hacer la busqueda
		txtBuscador.sendKeys(Keys.ENTER);
		
		//Paso 5: Cerrar el navegador
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
}
