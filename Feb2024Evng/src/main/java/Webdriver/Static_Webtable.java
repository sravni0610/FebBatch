package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Static_Webtable {


    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        wd.get(url);
        Thread.sleep(5000);
        wd.manage().window().maximize();
        wd.findElement(By.id("txtUsername")).sendKeys("Admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();

        Actions action = new Actions(wd);
        WebElement pim = wd.findElement(By.xpath("//*[contains(text(),'PIM')]"));
        WebElement config = wd.findElement(By.id("menu_pim_Configuration"));
        WebElement emplist = wd.findElement(By.id("menu_pim_viewEmployeeList"));

        action.moveToElement(pim).moveToElement(config).moveToElement(emplist).build().perform();

        Thread.sleep(5000);

        emplist.click();

        WebElement table = wd.findElement(By.id("resultTable"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){
            List<WebElement>  cols = rows.get(i).findElements(By.tagName("td"));

            for(int j=0;j<cols.size();j++){
                System.out.println(cols.get(j).getText()+"   ");
            }
        }


    }
}
