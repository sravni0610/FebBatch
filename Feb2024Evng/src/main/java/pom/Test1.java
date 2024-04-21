package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String args[]){

        WebDriver driver;

        driver = new ChromeDriver();

        Login_Page1 lp = new Login_Page1(driver);
        Home_Page  hp = new Home_Page(driver);

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        lp.username.sendKeys("admin");
        lp.password.sendKeys("Qedge123!@#");
        lp.login_btn.click();

        hp.pim.click();


    }
}
