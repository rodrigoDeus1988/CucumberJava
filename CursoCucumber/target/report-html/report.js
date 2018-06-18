$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/InserirConta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Inserir Contas",
  "description": "\r\nComo um usu�rio \r\nGostaria de cadastrar contas\r\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "inserir-contas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "inserir-contas;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou acessando a aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "informo o usuario \"rdeus@hotmail.com\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "a senha \"2430\"",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"Conta Corrente teste10\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "a conta e inserida com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "Inserir_contas.queEstouAcessandoAAplicacao()"
});
formatter.result({
  "duration": 5401497420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdeus@hotmail.com",
      "offset": 19
    }
  ],
  "location": "Inserir_contas.informoOUsuario(String)"
});
formatter.result({
  "duration": 187185969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2430",
      "offset": 9
    }
  ],
  "location": "Inserir_contas.aSenha(String)"
});
formatter.result({
  "duration": 103869701,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.selecionoEntrar()"
});
formatter.result({
  "duration": 683285547,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 56730498,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.selecionoContas()"
});
formatter.result({
  "duration": 106298033,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.selecionoAdicionar()"
});
formatter.result({
  "duration": 982121272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta Corrente teste10",
      "offset": 17
    }
  ],
  "location": "Inserir_contas.informoAConta(String)"
});
formatter.result({
  "duration": 169543607,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.selecionoSalvar()"
});
formatter.result({
  "duration": 508186958,
  "status": "passed"
});
formatter.match({
  "location": "Inserir_contas.aContaEInseridaComSucesso()"
});
formatter.result({
  "duration": 824459477,
  "status": "passed"
});
});