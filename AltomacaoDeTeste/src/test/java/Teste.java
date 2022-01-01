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
public class Teste {
    private WebDriver navegador;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "\\Users\\user\\Desktop\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("https://www.juliodelima.com.br/");

    }


    @Test
    public void ClicarIconeTwitter() {

        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        navegador.findElement(By.id("menu-item-38")).click();


    }
    @Test
    public void ClicarIconeYoutube() {

        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        navegador.findElement(By.id("menu-item-11")).click();


    }
    @After
    public void tearDOW(){

      //  navegador.quit();
    }

}


