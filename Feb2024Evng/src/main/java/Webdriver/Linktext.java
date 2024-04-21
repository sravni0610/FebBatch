package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        wd.manage().window().maximize();
         wd.findElement(By.linkText("Forgotten Password")).click();
        wd.findElement(By.linkText("Back")).click();
        wd.findElement(By.partialLinkText("Password")).click();

    }
}
