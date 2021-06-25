package stepdefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.SignInPage;

public class SignInSteps {
	WebDriver driver;
	
	@Quando("^o usuario estiver na pagina principal do sistema$")
	public void o_usuario_estiver_na_pagina_principal_do_sistema() throws Throwable {
		Hooks.abrirUrl("http://opensource-demo.orangehrmlive.com/");
		driver = Hooks.getDriver();   
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String arg1) throws Throwable {
		SignInPage sp = new SignInPage(driver);
		sp.preencherUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String arg1) throws Throwable {
		SignInPage sp = new SignInPage(driver);
		sp.preencherSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		SignInPage sp = new SignInPage(driver);
		sp.clicarBotaoLogin();
	}

	@Entao("^o sistema devera autorizar o login, exibindo pagina contendo o Dashboard$")
	public void o_sistema_devera_autorizar_o_login_exibindo_pagina_contendo_o_Dashboard() throws Throwable {
		SignInPage sp = new SignInPage(driver);
		sp.validarDashboard();
	}
}