$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/TesteEstudo.feature");
formatter.feature({
  "name": "Teste site Julio de Lima",
  "description": "Teste estudo",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Ir para Twitter apartir do site Julio de Lima",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que o usuário esteja no site Julio de Lima",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Clicar no icone \"Twitter\"",
  "keyword": "Quando "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "é direcionado ao site do \"Twitter\"",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});