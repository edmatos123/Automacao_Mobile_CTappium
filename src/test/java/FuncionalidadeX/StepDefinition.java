package FuncionalidadeX;


import RecursosAppium.Conector;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.appium.java_client.android.AndroidDriver;


public class StepDefinition {
	private Conector con = null;   
	private AndroidDriver driver = null;
	private MainPage main = null;
	private FormularioPage form = null;
	
	
	@Before
	public void iniciar() throws Exception {
		con = new Conector();
		driver = con.Conectar();
		main = new MainPage(driver);
		form = new FormularioPage(driver);
	}
	

	@Given("^Que eu esteja acessando a tela do formulario$")
	public void Que_eu_esteja_acessando_a_tela_do_formulario() {
		main.clicarMenu("Formulário");		    
	}

	@When("^Preencher todos os registros$")
	public void Preencher_todos_os_registros() {
	   // Preencher o campo Nome
		form.preencherNome("Marilia Silva Pereira");
		
		
	   // Escolher a opção PS4
		
	   // Marcar o Check
		
	   // Selecionar o Switch
		
	   // Alterar Data
		
	   // Alterar Horario 
		
		
		
	}

	@When("^Em seguida salvar o registro$")
	public void Em_seguida_salvar_o_registro() {
		
		// Selecionar o botão Salvar	
	    
	}

	@Then("^Os dados serão salvos conforme preenchido$")
	public void Os_dados_serão_salvos_conforme_preenchido() {
	    
	}
}
