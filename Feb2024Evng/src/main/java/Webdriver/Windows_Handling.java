package Webdriver;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windows_Handling {

    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://demo.guru99.com/popup.php");
        wd.manage().window().maximize();
        Thread.sleep(5000);

        String parentwindow = wd.getWindowHandle();

        System.out.println("Id associated to parent window is "+parentwindow);

        wd.findElement(By.linkText("Click Here")).click();

        Set<String> windows = wd.getWindowHandles();

        Iterator itr = windows.iterator();

        while (itr.hasNext()){
            String currentwindow = itr.next().toString();



            if(!currentwindow.equals(parentwindow)){
                wd.switchTo().window(currentwindow);
            }
        }

        wd.findElement(By.name("emailid")).sendKeys("abc@gmail.com");


    }
}
