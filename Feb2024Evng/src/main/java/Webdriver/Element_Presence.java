package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Presence {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");

        driver.manage().window().maximize();

        String str = "Rajinikanth";

        String PgSrc = driver.getPageSource();

        if(PgSrc.contains(str)){

            System.out.println("Element is present in the page source");
        }

        else
        {
            System.err.println("Element is not present");
        }

        driver.close();


    }
}
