package CliqueTest;


import java.net.MalformedURLException;

import Clique.CliquePage;
import Formulario.MenuPage;
import RecursosAppium.Conector;
import cucumber.annotation.Before;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.nl.Gegeven;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class StepDefinition {
	
	private AndroidDriver<MobileElement> driver;
	private CliquePage clique;
	private MenuPage menu;
	
	@Before
	public void iniciar() throws MalformedURLException {
		driver = Conector.getConectar();
		clique = new CliquePage(driver);
		menu = new MenuPage(driver);
	}

	@Gegeven("^Que eu esteja acessando a tela de clique$")
	public void Que_eu_esteja_acessando_a_tela_de_clique() {
	  
		menu.clicarMenu("Cliques");
		
	}

	@When("^Efetuar o clique longo$")
	public void Efetuar_o_clique_longo() throws MalformedURLException {
	
		clique.clicarLongo();
	}
	
	@When("^Efetuar o clique duplo$")
	public void Efetuar_o_clique_duplo() {

		clique.clicarDuplo();
	}


	@Then("^Exibira o texto Clique Longo$")
	public void Exibira_o_texto_Clique_Longo() {
	  
		clique.validarTexto("Clique Longo");
	}
	

	@Then("^Exibira o texto Duplo Clique")
	public void Exibira_o_texto_Duplo_Clique() {

		clique.validarTexto("Duplo Clique");
	}

	
}
