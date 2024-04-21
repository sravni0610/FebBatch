package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

    WebDriver driver;

    @FindBy(id = "menu_pim_viewPimModule")
    WebElement pim;

    public Home_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
