package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private static WebDriver driver;

    public static void main(String args[]){


        driver = new ChromeDriver();

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Login_Page.username(driver).sendKeys("admin");
        Login_Page.password(driver).sendKeys("admin");
        Login_Page.login_btn(driver).click();

    }
}
