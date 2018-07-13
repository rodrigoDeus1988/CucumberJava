package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Cadastro_de_contas { 

	WebDriver driver;
	
	@Given("^que estou acessando a menu$")
	public void queEstouAcessandoAAplicacao() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rodrigo.florindo\\git\\CursoCucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		driver.get("https://srbarriga.herokuapp.com");
	}

	@Given("^clicar em novo usuarioo$")
	public void clicar_em_novo_usuarioo() throws Throwable {

		WebElement menu = driver.findElement(By.linkText("Novo usu�rio?"));
		menu.click();

	}

	@When("^informo o e-maill \"([^\"]*)\"$")
	public void informo_o_e_maill(String arg1) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^clicar no botao Salvar$")
	public void clicar_no_botao_Salvar() throws Throwable {

		WebElement botao = driver.findElement(By.xpath("/html/body/div[2]/form/input"));
		botao.click();
	}

	@Then("^os conta e inserida com sucesso$")
	public void os_conta_e_inserida_com_sucesso() throws Throwable {

		String texto = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);

	} 

}
