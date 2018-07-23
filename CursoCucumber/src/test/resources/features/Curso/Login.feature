#language: en
Feature: Logar na aplicacao 

  Como um usuário 
  Gostaria de acessar aplicacao
  Com meu usuário e senha

@Login_Sucesso
Scenario: Deve inserir uma conta com sucesso 
	Given  que estou acessando a aplicacao 
	When informo o usuario "rdeus2@hotmail.com" 
	And a senha "2430" 
	And seleciono entrar 
	And visualizo a pagina inicial
	
@Login_acesso_negado
Scenario: Deve apresentar mensagem de erro de acesso  
	Given  que estou acessando a aplicacao 
	When informo o usuario "rdeus2@hotmail.com" 
	And a senha "24301232" 
	And seleciono entrar 
	And visualizo a pagina inicial mensagem de erro   