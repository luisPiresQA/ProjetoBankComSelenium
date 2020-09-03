package org.example.testes;

import org.example.interacao.TransacoesInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransacoesTeste extends InstaciaDriver {

    TransacoesInteracao transacoes = PageFactory.initElements(driver, TransacoesInteracao.class);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Test
    public void registrarDeposito(){

        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoLoginCliente()));
        transacoes.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoListaClientes()));
        transacoes.clicarCampoListaClientes();
        transacoes.selcionaUltimoElementoDaLista();
        transacoes.clicarParaLogar();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuDeposito();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoParaDeposito()));
        transacoes.preencherCampoParaDepositoe("123132");
        transacoes.clicarBotaoGravaDeposito();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaMensagemSucessoDeposito()));
    }

    @Test
    public void mensagemPreenhaCampoDeposito(){
        wait.until(ExpectedConditions
                .visibilityOf(transacoes.verificaElementoBotaoLoginCliente()));
        transacoes.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
                .visibilityOf(transacoes.verificaElementoCampoListaClientes()));
        transacoes.clicarCampoListaClientes();
        transacoes.selcionaUltimoElementoDaLista();
        transacoes.clicarParaLogar();
        wait.until(ExpectedConditions
                .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuDeposito();
        wait.until(ExpectedConditions
                .visibilityOf(transacoes.verificaElementoCampoParaDeposito()));
        transacoes.clicarBotaoGravaDeposito();
        wait.until(ExpectedConditions
                .textToBePresentInElement(transacoes.verificaElementoelemntoCampoDeposito(),""));
    }

    @Test
    public void registrarSaque(){
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoLoginCliente()));
        transacoes.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoListaClientes()));
        transacoes.clicarCampoListaClientes();
        transacoes.selcionaUltimoElementoDaLista();
        transacoes.clicarParaLogar();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuDeposito();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoParaDeposito()));
        transacoes.preencherCampoParaDepositoe("123132");
        transacoes.clicarBotaoGravaDeposito();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaMensagemSucessoDeposito()));
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuSaque();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoParaSaque()));
        transacoes.preencherCampoParaSaque("23");
        transacoes.clicarBotaoGravarSaque();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaMensagemSucessoSaque()));
    }

    @Test
    public void falhaDuranteSaque(){
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoLoginCliente()));
        transacoes.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoListaClientes()));
        transacoes.clicarCampoListaClientes();
        transacoes.selcionaUltimoElementoDaLista();
        transacoes.clicarParaLogar();
        wait.until(ExpectedConditions
       .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuSaque();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoParaSaque()));
        transacoes.preencherCampoParaSaque("23");
        transacoes.clicarBotaoGravarSaque();
        wait.until(ExpectedConditions
                .visibilityOf(transacoes.verificamMensagemFalhaSaque()));
    }

    @Test
    public void VerificarTransacoesSaqueDeposito(){
        wait.until(ExpectedConditions
       .visibilityOf(transacoes.verificaElementoBotaoLoginCliente()));
        transacoes.clicarBotaoLoginCliente();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCampoListaClientes()));
        transacoes.clicarCampoListaClientes();
        transacoes.selcionaUltimoElementoDaLista();
        transacoes.clicarParaLogar();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoBotaoMenuDeposito()));
        transacoes.clicarBotaoMenuTransacoes();
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoCreditoPresente()));
        wait.until(ExpectedConditions
        .visibilityOf(transacoes.verificaElementoDebitoPresente()));
    }
}
