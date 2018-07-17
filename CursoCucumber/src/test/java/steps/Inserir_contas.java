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

public class Inserir_contas {

	WebDriver driver;

	@Given("^que estou acessando a aplicacao$")
	public void queEstouAcessandoAAplicacao() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rodrigo.florindo\\git\\CursoCucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		driver.get("https://srbarriga.herokuapp.com");

	}

	@When("^informo o usuario \"([^\"]*)\"$")
	public void informoOUsuario(String arg1) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {

		driver.findElement(By.id("senha")).sendKeys(arg1);
	}

	@When("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {

		WebElement botao = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		botao.click();
	}

	@When("^visualizo a pagina inicial$")
	public void visualizoAPaginaInicial() throws Throwable {

		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Bem vindo, teste1!", texto);
	}

	@When("^visualizo a pagina inicial mensagem de erro$")
	public void visualizo_a_pagina_inicial_mensagem_de_erro() throws Throwable {

		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Problemas com o login do usuário", texto);

	}

	@When("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		WebElement botao = driver.findElement(By.linkText("Contas"));
		botao.click();
	}

	@When("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {

		WebElement botao = driver.findElement(By.linkText("Adicionar"));
		botao.click();
	}

	@When("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {

		driver.findElement(By.id("nome")).sendKeys(arg1);
	}

	@When("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {

		WebElement botaosalvar = driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button"));
		botaosalvar.click();

	}

	@Then("^a conta e inserida com sucesso$")
	public void aContaEInseridaComSucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);

		driver.quit();
	}

}