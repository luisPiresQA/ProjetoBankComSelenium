package org.example.paginas;


import org.example.utils.InstaciaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagina extends InstaciaDriver {
    private WebDriver driver;
    public LoginPagina(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//*[contains(text(),'Bank Manager')]")
    protected WebElement botaoBankManager;

    @FindBy(xpath = "//*[contains(text(),'Customer Login')]")
    protected WebElement botaoLoginCliente;

    @FindBy(xpath = "//*[contains(text(),'Customer Login')]")
    protected WebElement elementoBotaoLoginCliente;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/following::input")
    protected WebElement elemntocampoPrimeiroNome;

    @FindBy(id = "userSelect")
    protected WebElement elementoCampoListaClientes;

    @FindBy(id = "userSelect")
    protected WebElement campoListaClientes;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    protected WebElement botaoAddNovoCliente;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[last()]")
    protected WebElement selecionaUltimoCliente;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/following::input")
    protected WebElement campoPrimeiroNome;

    @FindBy(xpath = "//label[contains(text(),'Last Name')]/following::input")
    protected WebElement campoUltimoNome;

    @FindBy(xpath = "//label[contains(text(),'Post Code')]/following::input")
    protected WebElement campoCodigoPost;

    @FindBy(xpath = "//button[text()=\"Home\"]")
    protected WebElement botaoHome;

    @FindBy(xpath = "//*[contains(text(),'Add Customer')]")
    protected WebElement botaoAddCliente;

    @FindBy(xpath = "//*[contains(text(),'Add Customer')]")
    protected WebElement elemntoBotaoAddCliente;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    protected WebElement elementoBotaoLogin;

}
