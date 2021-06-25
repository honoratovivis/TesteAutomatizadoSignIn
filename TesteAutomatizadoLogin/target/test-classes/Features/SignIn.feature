#language: pt
@SignIn
Funcionalidade: Sign In

  Contexto: 
    Quando o usuario estiver na pagina principal do sistema

  @RealizarSignIn @SmokeTest
  Esquema do Cenario: Realizar Sign In com Sucesso
    Quando informar o campo Username como "<usuario>"
    E informar o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema devera autorizar o login, exibindo pagina contendo o Dashboard

    Exemplos: 
      | usuario | senha    |
      | Admin   | admin123 |