package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_check {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        String act_title = wd.getTitle();
        System.out.println(act_title);

        String exp_title = "OrangeHRM";

        if(act_title.equals(exp_title)){
            System.out.println("Titles matched and the application loaded is valid");
        }
        else {
            System.out.println("Titles not matched and the application loaded is invalid");
        }

        wd.close();


    }
}
