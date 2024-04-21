package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {

    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement username;


    @FindBy(id="txtPassword")
    WebElement password;

    @FindBy(id="btnLogin")
    WebElement login_btn;


    public Login_Page1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
