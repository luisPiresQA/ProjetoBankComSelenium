package org.example.paginas;


import org.example.utils.InstaciaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbrirContaClientePagina extends InstaciaDriver {

    private WebDriver driver;

    public AbrirContaClientePagina(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//*[contains(text(),'Bank Manager')]")
    protected WebElement elementoBotaoBankManager;

    @FindBy(xpath = "//table/tbody//*[contains(text(),'teste123456')]")
    protected WebElement elementoPosCadastro;

    @FindBy(xpath = "//*[contains(text(),'Add Customer')]")
    protected WebElement elemntoBotaoAddCliente;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/following::input")
    protected WebElement elemntocampoPrimeiroNome;

    @FindBy(xpath = "//div[@class=\"input-group-addon\"]/following::input")
    protected WebElement elementoTabelaCampoPesquisaCliente;

    @FindBy(xpath = "//div[@class=\"input-group-addon\"]/following::input")
    protected WebElement elementoCampoPesquisaCliente;

    @FindBy(xpath = "//*[contains(text(),'Bank Manager')]")
    protected WebElement botaoBankManager;

    @FindBy(xpath = "//*[contains(text(),'Add Customer')]")
    protected WebElement botaoAddCliente;

    @FindBy(xpath = "//*[contains(text(),'Dollar')]")
    protected WebElement selecionaDollar;

    @FindBy(id = "userSelect")
    protected WebElement campoListaCliente;

    @FindBy(id = "userSelect")
    protected WebElement verificaCampoListaCliente;

    @FindBy(id = "currency")
    protected WebElement campoListaMoedas;

    @FindBy(xpath = "//button[@ng-class=\"btnClass3\"]")
    protected WebElement botaoMenuCliente;

    @FindBy(xpath = "//*[contains(text(),'Process')]")
    protected WebElement botaoProcess;

    @FindBy(xpath = "//button[@ng-class=\"btnClass2\"]")
    protected WebElement botaoMenuAbrirConta;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/following::input")
    protected WebElement campoPrimeiroNome;

    @FindBy(xpath = "//label[contains(text(),'Last Name')]/following::input")
    protected WebElement campoUltimoNome;

    @FindBy(xpath = "//div[@class=\"input-group-addon\"]/following::input")
    protected WebElement campoPesquisaCliente;

    @FindBy(xpath = "//label[contains(text(),'Post Code')]/following::input")
    protected WebElement campoCodigoPost;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    protected WebElement botaoAddNovoCliente;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[last()]")
    protected WebElement selecionaUltimoCliente;
}
