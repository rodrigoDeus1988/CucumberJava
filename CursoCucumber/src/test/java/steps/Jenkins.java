package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jenkins {

	WebDriver driver;

	@Given("^que estou acessando a jenkins$")
	public void que_estou_acessando_a_jenkins() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Inmetrics\\git\\CucumberJava\\CursoCucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("http://localhost:8080/login"); 

	}

	@When("^informo o usuario do jenkins \"([^\"]*)\"$")
	public void informo_o_usuario_do_jenkins(String usuario) throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys(usuario);
	}

	@When("^a senha do jenkins \"([^\"]*)\"$")
	public void a_senha_do_jenkins(String password) throws Throwable {

		driver.findElement(By.name("j_password")).sendKeys(password);

	} 

	@When("^seleciono Sign in$") 
	public void seleciono_Sign_in() throws Throwable {

		WebElement botao = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input"));
		botao.click();  

	}

	@Then("^visualizo a pagina inicial bem vindo ao jenkins$")
	public void visualizo_a_pagina_inicial_bem_vindo_ao_jenkins() throws Throwable {

		String texto = driver.findElement(By.linkText("Rodrigo Deus")).getText();
		Assert.assertEquals("Rodrigo Deus", texto);

	}

}
