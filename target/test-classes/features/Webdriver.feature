#language: pt

@login @regressao


Funcionalidade: Webdriver - fazer login 


Contexto: 
Dado que esteja no site feioso
Quando escrevo o "webdriver"


@login1
Cenario: Login com sucesso
E a "webdriver123" 
E clico no login
Entao deve aparece um alelert falando sucesso

@login2
Cenario: Login com erro 
E digito "password123"
E clico no botao login
Entao deve aparece um alelert falando erro


Exemplos:

|Login|Senha|Senhaerrada|
|"webdriver"|"webdriver123" |"password123"  |