package org.example.interacao;

import org.example.paginas.TransacoesPagina;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransacoesInteracao extends TransacoesPagina {

    private WebDriver driver;

    public TransacoesInteracao(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void preencherCampoParaDepositoe(String deposito) {
        campoParaDeposito.sendKeys(deposito);
    }

    public void preencherCampoParaSaque(String saque ) {
        campoParaSaque.sendKeys(saque);
    }

    public void clicarCampoListaClientes() { campoListaClientes.click(); }

    public void clicarBotaoLoginCliente() {  botaoLoginCliente.click(); }

    public void clicarBotaoMenuDeposito() {
        botaoMenuDeposito.click();
    }

    public void clicarBotaoMenuSaque() {
        botaoMenuSaque.click();
    }

    public void clicarBotaoMenuTransacoes() {
        botaoMenuTransacoes.click();
    }

    public void clicarBotaoGravarSaque() {
        botaoGravarSaque.click();
    }

    public void clicarBotaoGravaDeposito() {
        botaoGravaDeposito.click();
    }

    public WebElement verificaMensagemSucessoDeposito() {
       return mensagemSucessoDeposito;
    }

    public WebElement verificaMensagemSucessoSaque() { return mensagemSucessoSaque;
    }

    public WebElement verificamMensagemFalhaSaque() { return mensagemFalhaSaque;
    }

    public WebElement verificaElementoCreditoPresente() { return elementoCreditoPresente;
    }

    public WebElement verificaElementoDebitoPresente() { return elementoDebitoPresente;    }

    public WebElement verificaElementoBotaoLoginCliente() { return verificaBotaoLoginCliente;    }

    public WebElement verificaElementoCampoListaClientes() { return verificaCampoListaClientes;    }

    public WebElement verificaElementoBotaoMenuDeposito() { return verificaBotaoMenuDeposito;    }

    public WebElement verificaElementoCampoParaDeposito() { return verificaCampoParaDeposito;    }

    public WebElement verificaElementoelemntoCampoDeposito() { return elemntoCampoDeposito;    }

    public WebElement verificaElementoCampoParaSaque() { return verificaCampoParaSaque;    }


    public void clicarParaLogar() { elementoBotaoLogin.click(); }

    public void selcionaUltimoElementoDaLista() { selecionaUltimoCliente.click(); }

}


