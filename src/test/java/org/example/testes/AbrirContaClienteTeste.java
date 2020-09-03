package org.example.testes;

import org.example.interacao.AbrirContaClienteInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirContaClienteTeste extends InstaciaDriver {

    AbrirContaClienteInteracao abrircontaCliente = PageFactory.initElements(driver, AbrirContaClienteInteracao.class);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Test
    public void abrirContaCliente(){

        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.VerificaElementoBotaoBankManager()));
        abrircontaCliente.clicarBotaoBankManager();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaElemntoBotaoAddCliente()));
        abrircontaCliente.clicarBotaoAddCliente();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaElemntocampoPrimeiroNome()));
        abrircontaCliente.preencherCampoPrimeiroNome("teste123456");
        abrircontaCliente.preencherCampoUltimoNome("sobreNome1234");
        abrircontaCliente.preencherCampoCodigoPost("123");
        abrircontaCliente.clicarBotaoAddNovoCliente();
        driver.switchTo().alert().accept();
        abrircontaCliente.clicarBotaoMenuAbrirConta();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaElementoCampoListaCliente()));
        abrircontaCliente.clicarCampoListaCliente();
        abrircontaCliente.selcionaUltimoElementoDaLista();
        abrircontaCliente.selecionaOpcaoDollar();
        abrircontaCliente.clicarBotaoProcess();
        driver.switchTo().alert().accept();
        abrircontaCliente.clicarBotaoMenuCliente();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaEelementoCampoPesquisaCliente()));
        abrircontaCliente.preencherCampoPesquisaCliente("teste123456");
        String cliente = abrircontaCliente.verificaElementoPosCadastro().getText();
        Assert.assertEquals(cliente, "teste123456");
    }

    @Test
    public void naoCriaContaCliente(){
        wait.until(ExpectedConditions
                .visibilityOf(abrircontaCliente.VerificaElementoBotaoBankManager()));
        abrircontaCliente.clicarBotaoBankManager();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaElemntoBotaoAddCliente()));
        abrircontaCliente.clicarBotaoMenuAbrirConta();
        wait.until(ExpectedConditions
        .visibilityOf(abrircontaCliente.verificaElementoCampoListaCliente()));
        abrircontaCliente.clicarBotaoProcess();
    }
}
