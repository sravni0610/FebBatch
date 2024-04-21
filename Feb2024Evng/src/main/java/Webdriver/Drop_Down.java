package Webdriver;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Drop_Down {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://www.amazon.co.uk/");

        WebElement drop = wd.findElement(By.id("searchDropdownBox"));

        List<WebElement> dropd = drop.findElements(By.tagName("option"));

        System.out.println(dropd.size());

        for(int i=0;i<dropd.size();i++){
            System.out.println(dropd.get(i).getText());
        }


        wd.findElement(By.id("searchDropdownBox")).sendKeys("Books");
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
        wd.findElement(By.id("nav-search-submit-button")).click();

    }
}
