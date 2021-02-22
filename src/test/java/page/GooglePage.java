package page;

import core.BasePage;
import core.Elemento;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import util.EvidenceManager;

import static util.EvidenceManager.GerarEvidencia;

public class GooglePage extends BasePage {

    private Elemento buscaGoogle = new Elemento(getDriver(), "xpath", "//input[@name='q']");
    private Elemento pesquisaGoogle = new Elemento(getDriver(), "xpath", "(//input[@name='btnK'])[1]");
    private Elemento primeiroLink = new Elemento(getDriver(), "xpath", "(//h3)[1]");

    @Dado("acessar o google")
    public void acessarGoogle() throws Exception {
        navegar("https://www.google.com/");
        GerarEvidencia("Tela inicial google");

    }

    @Quando("buscar o site {string}")
    public void buscarNoGoogle(String valorBusca) throws Exception {
        escrever(buscaGoogle, valorBusca);
//        Thread.sleep(500);
        clicar(pesquisaGoogle);
        EvidenceManager.GerarEvidencia("Busca realizada");
    }

    @E("clicar no primeiro link")
    public void acessarItemBusca() throws Exception {
        esperarElemento(primeiroLink, SMALL);
        clicar(primeiroLink);
    }
}
