package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.nio.ch.FileKey;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;

public class Login_Prop {

    public static void main(String args[]) throws IOException, InterruptedException {

        File f = new File("C:\\Users\\sravn\\Documents\\testdata\\prp.txt");

        FileInputStream fis = new FileInputStream(f);

        Properties p = new Properties();

        p.load(fis);

        System.out.println(p.getProperty("id"));
        System.out.println(p.getProperty("pwd"));


        WebDriver wd = new ChromeDriver();

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        wd.get(url);
        wd.manage().window().maximize();
        Thread.sleep(4000);
        wd.findElement(By.id("txtUsername")).sendKeys(p.getProperty("id"));
        wd.findElement(By.name("txtPassword")).sendKeys(p.getProperty("pwd"));
        wd.findElement(By.id("btnLogin")).click();

       File screenshot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\sravn\\Documents\\feb2024\\sample.png"));




    }
}
