package org.example.interacao;

import org.example.paginas.LoginPagina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginInteracao extends LoginPagina {

    private WebDriver driver;
    private String name;
    private int repostaRecebida;

    public LoginInteracao(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement verificaElemntocampoPrimeiroNome() {
        return elemntocampoPrimeiroNome;
    }

    public WebElement verificaElemntoBotaoAddCliente() {
        return elemntoBotaoAddCliente;
    }

    public WebElement verificaElementoBotaoLoginClientee() {
        return elementoBotaoLoginCliente;
    }

    public WebElement verificaElementoCampoListaClientes() {
        return elementoCampoListaClientes;
    }

    public void clicarBotaoBankManager() { botaoBankManager.click(); }

    public void clicarBotaoAddNovoCliente() {
        botaoAddNovoCliente.click();
    }

    public void preencherCampoUltimoNome(String senha) {
        campoUltimoNome.sendKeys(senha);
    }

    public void preencherCampoCodigoPost(String senha) {
        campoCodigoPost.sendKeys(senha);
    }

    public void clicarBotaoAddCliente() {
        botaoAddCliente.click();
    }

    public void clicarBotaoLoginCliente() {  botaoLoginCliente.click(); }

    public void clicarParaLogar() { elementoBotaoLogin.click(); }

    public void preencherCampoPrimeiroNome(String senha) {
        campoPrimeiroNome.sendKeys(senha);
    }

    public void clicarCampoListaClientes() { campoListaClientes.click(); }

    public void clicarBotaoHome() { botaoHome.click(); }

    public void selcionaUltimoElementoDaLista() { selecionaUltimoCliente.click(); }

    public void clicarLoginCliente(String nomeRecebido) {

        List<WebElement> resposta = driver.findElements(By.xpath("//*[@id=\"userSelect\"]/option"));

        for (int i = 0; i < resposta.size(); i++) {
            String auxi = resposta.get(i).getText();
            if (auxi.equals(nomeRecebido)) {
                resposta.get(i).click();
                setReposta(1); getReposta(); return;
            }
        }
        setReposta(2);
        getReposta();
    }

    public void setReposta(int reposta) { this.repostaRecebida = reposta; }

    public int getReposta() { return repostaRecebida; }
}


