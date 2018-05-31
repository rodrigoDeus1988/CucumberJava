package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Inserir_contas {

	WebDriver driver;

	//*****//
	@Dado("^que estou acessando a aplicacao$")
	public void queEstouAcessandoAAplicacao() throws Throwable {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\Paz\\Documents\\Automacao\\CursoCucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://srbarriga.herokuapp.com");

	}

	@Quando("^informo o usuario \"([^\"]*)\"$")
	public void informoOUsuario(String arg1) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(arg1);

	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {

		driver.findElement(By.id("senha")).sendKeys(arg1);

	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() throws Throwable {

		WebElement botao = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
        botao.click();
	}

	@Entao("^visualizo a pagina inicial$")
	public void visualizoAPaginaInicial() throws Throwable {
		
		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Bem vindo, Rodrigo Deus!", texto); 
		

	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		
		WebElement botao = driver.findElement(By.linkText("Contas"));
        botao.click();
		

	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		
		WebElement botao = driver.findElement(By.linkText("Adicionar"));
        botao.click();

	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
		
		driver.findElement(By.id("nome")).sendKeys(arg1); 

	} 

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
		
		WebElement botaosalvar = driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button"));
		botaosalvar.click();
		

	}

	@Entao("^a conta e inserida com sucesso$")
	public void aContaEInseridaComSucesso() throws Throwable {
		
		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);
		
		driver.quit();

	}

}

