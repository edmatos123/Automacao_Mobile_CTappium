package FormularioTest;

import java.net.MalformedURLException;

import Formulario.FormularioPage;
import Formulario.MenuPage;
import RecursosAppium.Conector;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class StepFormulario {
  
	private AndroidDriver<MobileElement> driver;
	private MenuPage menu ;
	private FormularioPage form;
	

   @Before
	public void Iniciar() throws MalformedURLException{
		driver = Conector.getConectar();
		menu = new MenuPage(driver);
		form = new FormularioPage(driver);
	}

	@Given("^Que eu esteja acessando a tela do formulario$")
	public void Que_eu_esteja_acessando_a_tela_do_formulario() throws MalformedURLException {
		
		
		menu.clicarMenu("Formulário");		    
	}

	@When("^Preencher todos os registros$")
	public void Preencher_todos_os_registros() throws MalformedURLException {
	   
		form.preencherNome("Marilia Silva");	
		
	    form.selecionarConsole("PS4");
		form.clicarSeekBar(80);
		form.clicarCheck();
		form.clicarSwitch();	
		form.definirData();		 
		form.definirHorario();
		
		
	}

	@When("^Em seguida salvar o registro$")
	public void Em_seguida_salvar_o_registro() throws MalformedURLException {
		
			
	    form.salvarFormulario();
		
		
	}

	@Then("^Os dados serão salvos conforme preenchido$")
	public void Os_dados_serão_salvos_conforme_preenchido() throws MalformedURLException {
	    
		form.validarDados();
		
	}
	
	@After
	public void finalizar() {
		Conector.Desconectar();
	}
}
