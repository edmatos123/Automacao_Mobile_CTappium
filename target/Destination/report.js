$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('CliqueTest\Validar Clique.feature');
formatter.feature({
  "line": 1,
  "name": "Validar Clique",
  "description": "",
  "id": "validar-clique",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar Clique Longo",
  "description": "",
  "id": "validar-clique;validar-clique-longo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Que eu esteja acessando a tela de clique",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Efetuar o clique longo",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Exibira o texto Clique Longo",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.Que_eu_esteja_acessando_a_tela_de_clique()"
});
formatter.result({
  "duration": 1054344500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Efetuar_o_clique_longo()"
});
formatter.result({
  "duration": 2678053100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.Exibira_o_texto_Clique_Longo()"
});
formatter.result({
  "duration": 204086800,
  "status": "passed"
});
});