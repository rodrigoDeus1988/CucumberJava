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
  "duration": 366210190,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\Paz\\Documents\\Automacao\\CursoCucumber\\drivers\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:33)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:139)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:335)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:89)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat steps.Inserir_contas.queEstouAcessandoAAplicacao(Inserir_contas.java:24)\r\n\tat ✽.Dado que estou acessando a aplicacao(src/test/resources/features/InserirConta.feature:9)\r\n",
  "status": "failed"
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
  "status": "skipped"
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