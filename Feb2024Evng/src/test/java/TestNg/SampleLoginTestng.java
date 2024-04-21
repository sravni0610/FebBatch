package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleLoginTestng {

    WebDriver driver;

    @BeforeMethod

    public void before(){

        System.out.println("Before Method Called");

        driver = new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

    }


    @Test

    public void Login(){

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogi")).click();
    }


    @AfterMethod

    public void after(){
        System.out.println("After Method is triggered");
        driver.close();
    }

}
