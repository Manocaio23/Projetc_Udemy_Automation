#language: pt

@cenario_principal @regressao


Funcionalidade: Contato - UC PAGE

@cenerio1
Cenario: Validar com sucesso - Unica data
Dado esteja no site para cadastrar os dados 
Quando escrevo o primeiro nome
E em seguida escrevo o sobrenome
E preencho o e-mail
E Faco comentario 
E clico no botao Submit 
Entao visualizo as opcoes 

@cenario2
Cenario: Validar com sucesso - Specific data
Dado esteja no site para cadastrar os dados 
Quando escrevo o primeiro <Nome>
E em seguida escrevo o <Sobrenome>
E preencho o <Mail>
E Faco comentario <Comentario>
E clico no botao Submit 
Entao visualizo as opcoes 

Exemplos: 
|Nome  |Sobrenome		 |	Mail	 	 |Comentario		 |
|"Caio"|"Augusto"  |"caiotest@gmail.com"|"feliz 2021!!!"	 |

