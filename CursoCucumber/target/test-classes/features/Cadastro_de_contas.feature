#language: pt
Funcionalidade: Cadastro de contas
  
  Como um usu�rio 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Cen�rio: Deve inserir uma conta com sucesso
    Dado que estou acessando a aplica��o
    Quando informo o usu�rio "a@a"
    E a senha "a"
    E seleciono entrar
    Ent�o visualizo a p�gina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Ent�o a conta � inserida com sucesso

  Cen�rio: N�o deve inserir uma conta sem nome
    Dado que estou acessando a aplica��o
    Quando informo o usu�rio "a@a"
    E a senha "a"
    E seleciono entrar
    Ent�o visualizo a p�gina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E seleciono Salvar
    Ent�o sou notificar que o nome da conta � obrigat�rio

  Cen�rio: N�o deve inserir uma conta com nome j� existente
    Dado que estou acessando a aplica��o
    Quando informo o usu�rio "a@a"
    E a senha "a"
    E seleciono entrar
    Ent�o visualizo a p�gina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Ent�o sou notificado que j� existe uma conta com esse nome
