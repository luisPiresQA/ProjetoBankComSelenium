package org.example.testes;

import org.example.interacao.LoginInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTeste extends InstaciaDriver {

    LoginInteracao login = PageFactory.initElements(driver, LoginInteracao.class);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Test
    public void loginEfetuadoAposVerificarQueNaoPossuiRegistro(){

        wait.until(ExpectedConditions
        .visibilityOf(login.verificaElementoBotaoLoginClientee()));
        login.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(login.verificaElementoCampoListaClientes()));
        login.clicarCampoListaClientes();
        login.clicarLoginCliente("Harssry Potter");
        if (login.getReposta() == 1) {
            login.clicarParaLogar();
        }
        else if (login.getReposta() == 2) {
            login.clicarBotaoHome();
            login.clicarBotaoBankManager();
            wait.until(ExpectedConditions
            .visibilityOf(login.verificaElemntoBotaoAddCliente()));
            login.clicarBotaoAddCliente();
            wait.until(ExpectedConditions
            .visibilityOf(login.verificaElemntocampoPrimeiroNome()));
            login.preencherCampoPrimeiroNome("teste123456");
            login.preencherCampoUltimoNome("sobreNome1234");
            login.preencherCampoCodigoPost("123");
            login.clicarBotaoAddNovoCliente();
            driver.switchTo().alert().accept();
            login.clicarBotaoHome();
            login.clicarBotaoLoginCliente();
            login.clicarCampoListaClientes();
            login.clicarLoginCliente("teste123456");
            login.selcionaUltimoElementoDaLista();
            login.clicarParaLogar();
        }
    }

    @Test
    public void loginSucesso(){
        wait.until(ExpectedConditions
        .visibilityOf(login.verificaElementoBotaoLoginClientee()));
        login.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(login.verificaElementoCampoListaClientes()));
        login.clicarCampoListaClientes();
        login.selcionaUltimoElementoDaLista();
        login.clicarParaLogar();
    }
}
