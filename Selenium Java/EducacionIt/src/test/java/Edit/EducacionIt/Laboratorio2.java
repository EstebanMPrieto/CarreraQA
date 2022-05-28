package Edit.EducacionIt;

import org.testng.annotations.Test;

import Paginas.Home;
import Paginas.Login;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.time.Duration;



public class Laboratorio2 {
	
	private String url = "http://automationpractice.com/index.php";
	private String chromePath = "..\\EducacionIt\\Drivers\\chromedriver.exe";
	private String firefoxPath = "..\\EducacionIt\\Drivers\\geckodriver.exe";
	private	String mail = "Test" + Math.random() +"@test.com";
	WebDriver driver;
	
	
	@Parameters("navegador")	
	
	@BeforeTest
	
	public void setUp(String navegador) {
		
		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
		}else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxPath);
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	
		}
	
	@Test(priority=1,description="Registro de Usuario")
	public void lab2_E1() {
		
		//Definimos la espera
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Home singInClic = new Home(driver);
		singInClic.singIn();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
		
		Login email = new Login(driver);
		email.emailBox(mail);
		
		Login btnCreateClick = new Login(driver);
		btnCreateClick.btnCreate();
		
		//Creacion de cuenta
		
		//Llenamos el formularios
		
		//1 Seleccion de genero
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender1")));
		
		Login genderbtn = new Login(driver);
		genderbtn.genderbtn();
		
		//Completa datos de nombre,apellido,contraseña
		
		Login fname = new Login(driver);
		fname.fnameTxt();
		
		Login lname = new Login(driver);
		lname.lnameTxt();
		
		Login cPass = new Login(driver);
		cPass.cPass();
		
		
		
		//Completamos Fecha de nacimiento.
		Select dia = new Select(driver.findElement(By.id("days")));
		
		dia.selectByValue("22");
		
		
		Select mes = new Select(driver.findElement(By.id("months")));
		
		mes.selectByIndex(1);
		
		Select anio = new Select(driver.findElement(By.id("years")));
		
		anio.selectByValue("1987");
		
		
		// Seleccionamos 2 CheckBOX
		
		Login nletter = new Login(driver);
		nletter.nletter();
		
		Login optin = new Login(driver);
		optin.optin();
		
		//Ingresamos una direccion-Locacion.
		
		Login company = new Login(driver);
		company.company();
		
		Login address = new Login(driver);
		address.address();
		
		Login city = new Login(driver);
		city.city();
		
		
		//Seleccionamos un estado-provincia.
		Select estado = new Select(driver.findElement(By.cssSelector("#id_state")));
		
		estado.selectByValue("6");
		
		//Ingresamos un codigo postal valido, tiene que contener 5 digitos
		Login postcode = new Login(driver);
		postcode.postcode();
		
		//Ingresamos un numero de telefono.
		Login phone = new Login(driver);
		phone.phone();
		
		//Ingresamos un alias para identificar la direccion
		Login alias = new Login(driver);
		alias.alias();
		
		
		Login submit = new Login(driver);
		submit.submit();
		
		Assert.assertEquals(driver.getTitle(),"My account - My Store");
		
		
		}
	
	
	
	//Agregue este test para probar como funcionan dos test en la misma clase
	
	@Test(priority=2,description="Buscar palabra")
	public void lab1_E3() {
		
		driver.get(url);
		//Definimos la espera
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
		
		//Buscamos el elemento SearchBox
		WebElement txtBusqueda = driver.findElement(By.id("search_query_top"));
		
		//Enviamos la palabra "Dress" y damos ENTER		
		txtBusqueda.sendKeys("Dress");
		txtBusqueda.sendKeys(Keys.ENTER);
		
		}
	
	@AfterClass
	public void finPrueba(){
		
		System.out.println("Fin de prueba");
		
	}
	
	@AfterTest
	
	public void salir() {
		
		//Terminados los Test, cerramos el Driver
		driver.quit();
		
		}
	
	@AfterSuite
	public void fin() {
		
		System.out.println("Fin de Suite De Pruebas");
	}
	
	
}
