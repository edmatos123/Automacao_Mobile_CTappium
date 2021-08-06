Feature: Validar Clique

    @cliquelongo
   Scenario: Validar Clique Longo
	   Given Que eu esteja acessando a tela de clique
        When Efetuar o clique longo
		Then Exibira o texto Clique Longo
		
   @cliqueduplo
   Scenario: Validar Duplo Clique
	   Given Que eu esteja acessando a tela de clique
        When Efetuar o clique duplo
		Then Exibira o texto Duplo Clique
		
		