package page;


import core.BasePage;
import core.Elemento;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import util.EvidenceManager;


import static org.junit.Assert.assertTrue;

public class YouTubePage extends BasePage {

    private Elemento home = new Elemento(getDriver(), "xpath", "(//a[@id='endpoint'])[1]");
    private Elemento inputBusca = new Elemento(getDriver(), "xpath", "//form[@id='search-form']//input");
    private Elemento buttonBusca = new Elemento(getDriver(), "xpath", "//button[@id='search-icon-legacy']");
    private Elemento video = new Elemento(getDriver(), "xpath", "//*[text()='DBZ - Vegeta! Olha beeem! WHOOOOOOOOOOOOOOOL!!!']");


    @Entao("acessar o youTube")
    public void validarAcessoComSucesso() throws Exception {
        esperarElemento(home, MIDDLE);
        assertTrue(validarElemento(home));
        EvidenceManager.GerarEvidencia("Tela inicial youtube");
    }

    @Quando("buscar pelo video {string}")
    public void buscarVideo(String valorBusca) throws Exception {
        escrever(inputBusca, valorBusca);
        clicar(buttonBusca);
    }

    @E("clicar no primeiro item")
    public void clicarVideoBusca() throws Exception {
        esperarElemento(video, SMALL);
        EvidenceManager.GerarEvidencia("busca do video");
        clicar(video);
    }

    @Entao("ver o video")
    public void verVideo() throws Exception {
        //assertion
        Thread.sleep(10000);
        EvidenceManager.GerarEvidencia("video executado");
    }

}
