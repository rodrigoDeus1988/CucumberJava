#language: en
Feature: Inserir Contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  @Inclusao_de_contas
  Scenario: Deve inserir uma conta com sucesso  
    Given  que estou acessando a aplicacao
    When informo o usuario "rdeus@hotmail.com"
    And a senha "2430"
    And seleciono entrar 
    And visualizo a pagina inicial
    And seleciono Contas
    And seleciono Adicionar
    And informo a conta "Conta Corrente teste10"
    And seleciono Salvar
    Then  a conta e inserida com sucesso