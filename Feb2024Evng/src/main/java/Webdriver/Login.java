package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        wd.get(url);
        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("Admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();






    }
}
