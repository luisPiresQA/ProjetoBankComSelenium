package org.example.paginas;


import org.example.utils.InstaciaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransacoesPagina extends InstaciaDriver {

    private WebDriver driver;

    public TransacoesPagina(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//span[text()=\"Deposit Successful\"]")
    protected WebElement mensagemSucessoDeposito;

    @FindBy(xpath = "//span[text()=\"Transaction successful\"]")
    protected WebElement mensagemSucessoSaque;

    @FindBy(xpath = "//button[@ng-class=\"btnClass2\"]")
    protected WebElement botaoMenuDeposito;

    @FindBy(xpath = "//button[@ng-class=\"btnClass1\"]")
    protected WebElement botaoMenuTransacoes;

    @FindBy(xpath = "//tr/td[text()=\"Credit\"]")
    protected WebElement elementoCreditoPresente;

    @FindBy(xpath = "//tr/td[text()=\"Debit\"]")
    protected WebElement elementoDebitoPresente;

    @FindBy(xpath = "//button[text()=\"Deposit\"]")
    protected WebElement botaoGravaDeposito;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    protected WebElement botaoMenuSaque;

    @FindBy(xpath = "//form//button[contains(text(),'Withdraw')]")
    protected WebElement botaoGravarSaque;

    @FindBy(xpath = "//label[contains(text(),'Amount to be Deposited')]/following::input")
    protected WebElement campoParaDeposito;

    @FindBy(xpath = "//label[contains(text(),'Amount to be Withdrawn')]/following::input")
    protected WebElement campoParaSaque;

    @FindBy(id = "userSelect")
    protected WebElement campoListaClientes;

    @FindBy(xpath = "//*[contains(text(),'Customer Login')]")
    protected WebElement botaoLoginCliente;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[last()]")
    protected WebElement selecionaUltimoCliente;

    @FindBy(xpath = "//label[contains(text(),'Amount to be Deposited')]/following::input")
    protected WebElement elemntoCampoDeposito;


    @FindBy(xpath = "//button[text()=\"Login\"]")
    protected WebElement elementoBotaoLogin;

    @FindBy(xpath = "//*[contains(text(),'Customer Login')]")
    protected WebElement verificaBotaoLoginCliente;

    @FindBy(id = "userSelect")
    protected WebElement verificaCampoListaClientes;

    @FindBy(xpath = "//button[@ng-class=\"btnClass2\"]")
    protected WebElement verificaBotaoMenuDeposito;

    @FindBy(xpath = "//label[contains(text(),'Amount to be Deposited')]/following::input")
    protected WebElement verificaCampoParaDeposito;

    @FindBy(xpath = "//label[contains(text(),'Amount to be Withdrawn')]/following::input")
    protected WebElement verificaCampoParaSaque;

    @FindBy(xpath = "//span[text()=\"Transaction Failed. You can not withdraw amount more than the balance.\"]")
    protected WebElement mensagemFalhaSaque;

}
