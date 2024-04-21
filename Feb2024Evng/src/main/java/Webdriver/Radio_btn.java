package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_btn {

    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");

        Thread.sleep(5000);

        wd.manage().window().maximize();
        wd.findElement(By.id("cloanamount")).clear();
        wd.findElement(By.id("cloanamount")).sendKeys("15000");
        wd.findElement(By.name("cloanterm")).clear();
        wd.findElement(By.name("cloanterm")).sendKeys("12");

       Boolean a =  wd.findElement(By.id("cpayoff1")).isSelected();

       System.out.println(a);

        wd.findElement(By.xpath("//*[contains(text(),'Payback altogether')]")).click();
        Thread.sleep(5000);
        wd.findElement(By.xpath("(//*[@value='Calculate'])[1]")).click();

    }
}
