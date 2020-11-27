import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
    private WebDriver driver;
    private String path = "http://localhost:8080/opdracht_web3_war_exploded/Controller";

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenne\\2TI\\Web3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(path+"?command=Register");
    }

    @After
    public void clean() {
        driver.quit();
    }



}
