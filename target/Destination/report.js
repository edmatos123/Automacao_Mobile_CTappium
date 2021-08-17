$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('CliqueTest\Validar Clique.feature');
formatter.feature({
  "line": 1,
  "name": "Validar Clique",
  "description": "",
  "id": "validar-clique",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "Validar Duplo Clique Lento",
  "description": "",
  "id": "validar-clique;validar-duplo-clique-lento",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@cliqueduplolento"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Que eu esteja acessando a tela de clique",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Efetuar o clique duplo lento",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Exibira o texto Duplo Clique Lento",
  "keyword": "Then "
});
formatter.match({
  "location": "StepClique.Que_eu_esteja_acessando_a_tela_de_clique()"
});
formatter.result({
  "duration": 986644799,
  "status": "passed"
});
formatter.match({
  "location": "StepClique.Efetuar_o_clique_duplo_lento()"
});
formatter.result({
  "duration": 4778012000,
  "status": "passed"
});
formatter.match({
  "location": "StepClique.Exibira_o_texto_Duplo_Clique_Lento()"
});
formatter.result({
  "duration": 235657300,
  "status": "passed"
});
});