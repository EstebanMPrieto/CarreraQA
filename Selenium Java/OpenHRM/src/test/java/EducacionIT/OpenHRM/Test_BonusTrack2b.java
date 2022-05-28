package EducacionIT.OpenHRM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utilities.CapturaEvidencia;
import paginas.DashBoard;
import paginas.PageHome;
import paginas.PageViewSystemUsers;
import paginas.SaveSystemUser;

public class Test_BonusTrack2b {
	private String url = "https://opensource-demo.orangehrmlive.com/";
	private String chromePath = "..\\OpenHRM\\Drivers\\chromedriver.exe";
	private String firefoxPath = "..\\OpenHRM\\Drivers\\geckodriver.exe";
	private String screenShotPath = "..\\OpenHRM\\Envidencia\\";
	private String docPath = "..\\OpenHRM\\Evidencia\\documentoEvidencia.docx";
	private WebDriver driver;
	private String name = "Test" + Math.random();
	
	@Parameters("navegador")
	
	@BeforeTest
	public void setUp(String navegador) {
		if (navegador.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
		} else if (navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxPath);
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		
	
		}
	

	
	@Test(description = "CP01 - Login", priority=1 )
	public void loginHRM() throws IOException, InvalidFormatException, InterruptedException{
		
		//Login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		
		CapturaEvidencia.escribirTituloEnDocumento(docPath, "Testing Automation" , 24);
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, screenShotPath + "img.jpg" , docPath, "Login");
		
		PageHome user = new PageHome(driver);
		user.datosUser();
		
		PageHome password = new PageHome(driver);
		password.txtPassword();
		
		PageHome clickLogin = new PageHome(driver);
		clickLogin.btnLogin();
	}
	
	
	@Test(description = "CP02 - Add User",priority=2 )
	
	public void addUSER() throws InvalidFormatException, IOException, InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_viewAdminModule")));
		
		DashBoard btnAdmin = new DashBoard(driver);
		btnAdmin.btnAdminClick();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnAdd")));
		
		PageViewSystemUsers btnAdd = new PageViewSystemUsers(driver);
		btnAdd.btnAdd();
		
				
		SaveSystemUser admin = new SaveSystemUser(driver);
		admin.userRol();
		
		
		SaveSystemUser nameUser = new SaveSystemUser(driver);
		nameUser.nameEmployee();
		
		
		DashBoard user = new DashBoard(driver);
		user.user(name);
		
		SaveSystemUser password = new SaveSystemUser(driver);
		password.password();
		
		SaveSystemUser confirmPass = new SaveSystemUser(driver);
		confirmPass.confirPassword();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("systemUser_password_strength_meter")));
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, screenShotPath + "img.jpg" , docPath, "Formulario LLeno");
		
		SaveSystemUser btnSave = new SaveSystemUser(driver);
		btnSave.btnsave();
		
		
	}

	
	
	
	@Test(description="CP03 - Delete User",priority=3)
	
	public void delUser() throws InvalidFormatException, IOException, InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#searchSystemUser_userName")));
		
		PageViewSystemUsers searchUser = new PageViewSystemUsers(driver);
		searchUser.searchUser(name);
		
		PageViewSystemUsers btnsearch = new PageViewSystemUsers(driver);
		btnsearch.searchBtn();
		
				
		PageViewSystemUsers chkBox = new PageViewSystemUsers(driver);
		chkBox.chkboxSelectAll();
		
		CapturaEvidencia.capturarPantallaEnDocumento(driver, screenShotPath + "img.jpg" , docPath, "Previo a eleminar el usuario");
		
		PageViewSystemUsers btnDelete = new PageViewSystemUsers(driver);
		btnDelete.btnDelete();
		
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
		
				
		
	}
	
	
	@AfterTest
	public void quit() {
		driver.close();
	}

}


