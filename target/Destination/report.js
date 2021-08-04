$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('FormularioTest\Caso1.feature');
formatter.feature({
  "line": 1,
  "name": "Validar Formulario",
  "description": "",
  "id": "validar-formulario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar Formulario",
  "description": "",
  "id": "validar-formulario;validar-formulario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Que eu esteja acessando a tela do formulario",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Preencher todos os registros",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Em seguida salvar o registro",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Os dados serão salvos conforme preenchido",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.Que_eu_esteja_acessando_a_tela_do_formulario()"
});
formatter.result({
  "duration": 1582024700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Preencher_todos_os_registros()"
});
formatter.result({
  "duration": 18724876400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Em_seguida_salvar_o_registro()"
});
formatter.result({
  "duration": 1128422000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Os_dados_serão_salvos_conforme_preenchido()"
});
formatter.result({
  "duration": 4211319000,
  "status": "passed"
});
});