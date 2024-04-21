package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamic_Webtable {

    public static void main(String args[]) throws InterruptedException {


        WebDriver wd = new ChromeDriver();
        wd.get("https://www.esky.co.uk/");
        wd.manage().window().maximize();
        Thread.sleep(6000);
        wd.findElement(By.id("TripTypeOneway")).click();
        wd.findElement(By.id("departureOneway")).sendKeys("London");
        wd.findElement(By.id("arrivalOneway")).sendKeys("Chennai");

        String doj = "17/07/2024";

        wd.findElement(By.id("departureDateOneway")).click();

        String a[] = doj.split("/");

        String day = a[0];
        String year = a[2];
        int x = Integer.parseInt(a[1]);

        String mons[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        String mon = mons[x-1];

        String calYear = wd.findElement(By.className("ui-datepicker-year")).getText();

        while (!calYear.equals(year)){
            wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calYear = wd.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calYear);
        }


        String calMon = wd.findElement(By.className("ui-datepicker-month")).getText();

        while (!calMon.equals(mon)){

            wd.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calMon = wd.findElement(By.className("ui-datepicker-month")).getText();
            System.out.println(calMon);
        }

        WebElement table = wd.findElement(By.className("ui-datepicker-calendar"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for(int j=0;j<cols.size();j++){
                if(cols.get(j).getText().equals(day)){
                    cols.get(j).click();
                }
            }
        }



    }
}
