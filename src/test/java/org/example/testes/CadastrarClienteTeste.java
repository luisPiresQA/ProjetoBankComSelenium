package org.example.testes;

import org.example.interacao.CadastrarClienteInteracao;
import org.example.utils.InstaciaDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastrarClienteTeste extends InstaciaDriver {

    CadastrarClienteInteracao cadastraCliente = PageFactory.initElements(driver, CadastrarClienteInteracao.class);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Test
    public void cadastraCliente(){

        wait.until(ExpectedConditions
        .visibilityOf(cadastraCliente.VerificaElementoBotaoBankManager()));
        cadastraCliente.clicarBotaoBankManager();
        wait.until(ExpectedConditions
        .visibilityOf(cadastraCliente.verificaElemntoBotaoAddCliente()));
        cadastraCliente.clicarBotaoAddCliente();
        wait.until(ExpectedConditions
        .visibilityOf(cadastraCliente.verificaElemntocampoPrimeiroNome()));
        cadastraCliente.preencherCampoPrimeiroNome("teste123456");
        cadastraCliente.preencherCampoUltimoNome("sobreNome1234");
        cadastraCliente.preencherCampoCodigoPost("123");
        cadastraCliente.clicarBotaoAddNovoCliente();
        driver.switchTo().alert().accept();
        cadastraCliente.clicarBotaoMenuCliente();
        wait.until(ExpectedConditions
        .visibilityOf(cadastraCliente.verificaEelementoCampoPesquisaCliente()));
        cadastraCliente.preencherCampoPesquisaCliente("teste123456");
        String cliente = cadastraCliente.verificaElementoPosCadastro().getText();
        Assert.assertEquals(cliente, "teste123456");
    }


    @Test
    public void sistemaNaocadastraCliente() {

        wait.until(ExpectedConditions
                .visibilityOf(cadastraCliente.VerificaElementoBotaoBankManager()));
        cadastraCliente.clicarBotaoBankManager();
        wait.until(ExpectedConditions
                .visibilityOf(cadastraCliente.verificaElemntoBotaoAddCliente()));
        cadastraCliente.clicarBotaoAddCliente();
        wait.until(ExpectedConditions
                .visibilityOf(cadastraCliente.verificaElemntocampoPrimeiroNome()));
        cadastraCliente.clicarBotaoAddNovoCliente();
        wait.until(ExpectedConditions
                .textToBePresentInElement(cadastraCliente.verificaElemntocampoPrimeiroNome(),""));
    }
}
