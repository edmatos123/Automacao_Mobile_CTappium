package SwipeTest;

import java.net.MalformedURLException;

import Formulario.MenuPage;
import RecursosAppium.Conector;
import Swipe.SwipePage;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class StepSwipe {
	
	private AndroidDriver<MobileElement> driver;
	private MenuPage menu;
	private SwipePage swipe;
	
	@Before
	public void iniciar() throws MalformedURLException {
		driver = Conector.getConectar();
		menu = new MenuPage(driver);
		swipe = new SwipePage(driver); 
		
	}
	

	
	@Given("^Que eu esteja acessando a tela de Swipe$")
	public void Que_eu_esteja_acessando_a_tela_de_Swipe() {
	    menu.clicarMenu("Swipe");
	}

	@When("^Efetuar o Swipe para a direita até o final$")
	public void Efetuar_o_Swipe_para_a_direita_até_o_final() throws MalformedURLException, InterruptedException {
		swipe.efetuarSwipe(90, 8);
	}

	@Then("^Devera ser validada a informacao apresentada$")
	public void Devera_ser_validada_a_informacao_apresentada() {
	    
	}

	
}
