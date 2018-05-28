#language: pt
Funcionalidade: Aprender  Cucumber
  
  #
  #
  #
  como um aluno
  Eu quero aprender a utilizar  Cucumber
  Para que eu possa automatizar criterios de aceitação

  Cenario: Deve executar especificação
    Dado que criei o arquivo corretamente 
    Quando execula-lo
    Entao a especificacao deve finalizar com sucesso
    Entao outro passo qualquer coisa 
    
  Cenario: Deve incrementar contador
   Dado que o valor do contador  15        
   Quando eu incrementar em 3
   Entao o valor de contador 18
   
   Cenario: Deve incrementar contador
   Dado que o valor do contador  30        
   Quando eu incrementar em 30
   Entao o valor de contador 60
   
   
   Cenario: Deve calcular atraso na entrega
   Dado que a entrega e dia 05/04/2018  
   #Quando a entrega atrasar em 2 dias  
   Entao a entrega sera efetuada em 07/04/2018 
   
   Cenario: Deve calcular atraso na entrega da china 
   Dado que a entrega e dia 05/05/2018  
   #Quando a entrega atrasar em 2 meses
   Entao a entrega sera efetuada em 05/06/2018 
   
   
   