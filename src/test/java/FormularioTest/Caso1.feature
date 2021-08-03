Feature: Validar Formulario

   Scenario: Validar Formulario
	   Given Que eu esteja acessando a tela do formulario
        When Preencher todos os registros 
        And  Em seguida salvar o registro 
		Then Os dados serão salvos conforme preenchido