#language: pt

@login
Funcionalidade: Webdriver - fazer login 

@login1
Cenario: Login com sucesso
Dado que esteja no site feioso
Quando escrevo o <login1>
E a <senha2> 
E clico no login
Entao deve aparece um alelert falando sucesso

@login2
Cenario: Login com erro 
Dado que esteja no site feioso
Quando escrevo o login normal
E digito <senhaerrada> 
E clico no login
Entao deve aparece um alelert falando erro


Exemplos:

|login1			|			senha2		  |	  senhaerrada |
|"webdriver"|"webdriver123" |"password123"  |