#language: pt
Funcionalidade: Inserir Contas
  
  #  
  #
  #
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Cenario: Deve inserir uma conta com sucesso
    Dado que estou acessando a aplicacao
    Quando informo o usuario "rdeus@hotmail.com"
    E a senha "2430"
    E seleciono entrar 
    Entao visualizo a pagina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E informo a conta "Conta Corrente teste3"
    E seleciono Salvar
    Entao a conta e inserida com sucesso
    
  