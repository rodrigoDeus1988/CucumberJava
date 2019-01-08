#language: en
Feature: Logar no jenkins
  Como um usuário 
  Gostaria de acessar aplicacao
  Com meu usuário e senha

  @Login_jenkins
  Scenario Outline: Deve inserir uma conta com sucesso
    Given que estou acessando a jenkins
    When informo o usuario do jenkins "<username>"
    And a senha do jenkins "<password>"
    And seleciono Sign in
    Then visualizo a pagina inicial bem vindo ao jenkins
    And clico no link ruby
    And clico no link Construir agora
    And clico no link Historico de builds
    Then clico no link Saida do console 

    Examples: 
      | username    | password |
      | rodrigoDeus |   243005 |
