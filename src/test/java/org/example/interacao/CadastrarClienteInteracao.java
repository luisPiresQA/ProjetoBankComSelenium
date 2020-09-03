package org.example.interacao;

import org.example.paginas.CadastrarClientePagina;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarClienteInteracao extends CadastrarClientePagina {

    private WebDriver driver;

    public CadastrarClienteInteracao(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCampoPrimeiroNome(String senha) {
        campoPrimeiroNome.sendKeys(senha);
    }

    public void preencherCampoUltimoNome(String senha) {
        campoUltimoNome.sendKeys(senha);
    }

    public void preencherCampoCodigoPost(String senha) {
        campoCodigoPost.sendKeys(senha);
    }

    public void preencherCampoPesquisaCliente(String senha) {
        campoPesquisaCliente.sendKeys(senha);
    }

    public void clicarBotaoBankManager() {
        botaoBankManager.click();
    }

    public void clicarBotaoAddCliente() {
        botaoAddCliente.click();
    }

    public void clicarBotaoAddNovoCliente() {
        botaoAddNovoCliente.click();
    }

    public void clicarBotaoMenuCliente() { botaoMenuCliente.click(); }

    public WebElement VerificaElementoBotaoBankManager() {
        return elementoBotaoBankManager;
    }

    public WebElement verificaElemntocampoPrimeiroNome() {
        return elemntocampoPrimeiroNome;
    }

    public WebElement verificaElemntoBotaoAddCliente() {
        return elemntoBotaoAddCliente;
    }

    public WebElement verificaElementoPosCadastro() {
        return elementoPosCadastro;
    }

    public WebElement verificaEelementoCampoPesquisaCliente() {
        return elementoCampoPesquisaCliente;
    }

}


