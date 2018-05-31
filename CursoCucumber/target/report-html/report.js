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
  "description": "\nComo um usu�rio \nGostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "inserir-contas",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 5619824180,
  "status": "passed"
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
  "name": "informo a conta \"Conta Corrente teste3\"",
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
  "duration": 5059524433,
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
  "duration": 13014810,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.Inserir_contas.informoOUsuario(Inserir_contas.java:31)\r\n\tat ✽.Quando informo o usuario \"rdeus@hotmail.com\"(src/test/resources/features/InserirConta.feature:10)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.selecionoEntrar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.visualizoAPaginaInicial()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.selecionoContas()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.selecionoAdicionar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta Corrente teste3",
      "offset": 17
    }
  ],
  "location": "Inserir_contas.informoAConta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.selecionoSalvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Inserir_contas.aContaEInseridaComSucesso()"
});
formatter.result({
  "status": "skipped"
});
});