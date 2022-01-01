import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import org.apache.http.util.Asserts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
public class TesteEstudoStep {
    private WebDriver navegador;
    @Dado("que o usuário esteja no site Julio de Lima")
    public void queOUsuárioEstejaNoSiteJulioDeLima() {
        System.setProperty("webdriver.chrome.driver", "\\Users\\user\\Desktop\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("https://www.juliodelima.com.br/");

    }

    @Quando("Clicar no icone {string}")
    public void clicarNoIcone(String sr) {

        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        navegador.findElement(By.id("menu-item-38")).click();

    }

    @Então("é direcionado ao site do {string}")
    public void éDirecionadoAoSiteDo(String string) {

    }


}





