#language: en
Feature: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Scenario Outline: Cadastro de contas
    Given  que estou acessando a menu
    And clicar em novo usuario   
    When informo o usuarioo "<usuario>" 
    And informo o e-maill "<e-mail>" 
    And a senhaa "<senha>"
    And clicar no botao Salvar 
    Then os conta e inserida com sucesso
    
 Examples: 

| usuario   		 | e-mail     			| senha  |
| Teste_600			 | xxx@teste.com        | teste06|
| Teste_680			 | xxx@teste1.com       | teste07|   