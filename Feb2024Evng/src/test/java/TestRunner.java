import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:taget/rept.html"}

)

public class TestRunner {

    public static WebDriver driver;

    @BeforeClass

    public static void startBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
    }
}
