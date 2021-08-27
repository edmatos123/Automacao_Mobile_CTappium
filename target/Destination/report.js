$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('SwipeTest\Validar Swipe.feature');
formatter.feature({
  "line": 1,
  "name": "Validar Swipe",
  "description": "",
  "id": "validar-swipe",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar Swipe",
  "description": "",
  "id": "validar-swipe;validar-swipe",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Que eu esteja acessando a tela de Swipe",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Efetuar o Swipe para a direita até o final",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Devera ser validada a informacao apresentada",
  "keyword": "Then "
});
formatter.match({
  "location": "StepSwipe.Que_eu_esteja_acessando_a_tela_de_Swipe()"
});
formatter.result({
  "duration": 1724826100,
  "status": "passed"
});
formatter.match({
  "location": "StepSwipe.Efetuar_o_Swipe_para_a_direita_até_o_final()"
});
formatter.result({
  "duration": 3959871800,
  "status": "passed"
});
formatter.match({
  "location": "StepSwipe.Devera_ser_validada_a_informacao_apresentada()"
});
formatter.result({
  "duration": 441317100,
  "status": "passed"
});
});