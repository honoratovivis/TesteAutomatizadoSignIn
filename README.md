# TesteAutomatizadoSignIn

Teste Automatizado realizado com Cucumber e Selenium, utilizando o Open Source OrangeHRM.


Nesse Mini Projeto, foi trabalhado o teste automatizado do Sign In, ou seja, Login. Existiu intencionalmente uma estruturação de Packages, Folder e Classes para deixar mais organizado. Com a intenção de facilitar as manutenções futuras.

O cenário aqui trabalhado foi Sign In, melhor especificado no arquivo SignIn.feature. Informando que o usuário, assim que estiver na página principal do sistema deverá informar o Username e o Password, após isso clicar no botão de Login da página. Para validar se o resultado foi o desejado, através da tag h1 irá ser verificado se a palavra Dashboard foi encontrada, através do @FindBy (how How.CSS, using = "h1:contains('Dashboard')"). Caso seja verdadeiro, este cenário estará completamente testado e validado.


Esse Teste Automatizado utilizou o Google Chrome e o ChromeDriver.
