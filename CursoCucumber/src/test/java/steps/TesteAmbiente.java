package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//***
public class TesteAmbiente {
	
	public static void execucao (String ambiente){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodrigo.florindo\\git\\CursoCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com"); 
	}    

} 
 