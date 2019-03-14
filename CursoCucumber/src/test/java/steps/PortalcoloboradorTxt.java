package steps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PortalcoloboradorTxt {
	
	private WebDriver driver; 

	@Before
	public void setUp() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://aplic.inmetrics.com.br/pcweb/login.aspx");

	} 

	@Test
	public void gravarDadosDoPortal() throws Exception {

		// Login Portal do Colocaborador
		driver.findElement(By.id("txtUsuario")).sendKeys("");
		
		driver.findElement(By.id("txtSenha")).sendKeys("");

		// Botão
		WebElement botao = driver.findElement(By.id("btnLogin"));
		botao.click();

		// Link Painel de Vagas Colaborador
		WebElement link = driver.findElement(By.linkText("Painel de Vagas Colaborador"));
		link.click();

		// Combo-box Perfil
		Select selectObject = new Select(driver.findElement(By.id("cphBody_ddlPerfil")));
		selectObject.selectByVisibleText("SOFTWARE DEVELOPMENT ENGINEER IN TEST");

		// Copiando dados para arquivo TXT
		WebElement copiar = driver
				.findElement(By.xpath("//*[@id=\"ctl00\"]/div[4]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[2]"));

		String resultado = copiar.getText();

		BufferedWriter xls = new BufferedWriter(
				new FileWriter("C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\Text.txt"));

		xls.write(resultado);

		xls.close();

	}

	@After
	public void fecharNavegador() throws Exception {

		// Copiando dados para arquivo TXT
		WebElement copiar = driver
				.findElement(By.xpath("//*[@id=\"ctl00\"]/div[4]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div[2]"));

		String resultado = copiar.getText();

		BufferedWriter txt = new BufferedWriter(
				new FileWriter("C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\Resultado.xls"));

		txt.write(resultado);

		txt.close();

		driver.quit();

	}

}
