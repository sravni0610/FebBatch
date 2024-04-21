import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Boolean.TRUE;

public class MyStepdefs {

    WebDriver driver;

    @Before
    public void start(){

        driver = TestRunner.driver;

    }
    @Given("User navigates to the application page")
    public void userNavigatesToTheApplicationPage() {

        String exp_title = "OrangeHRM";
        String act_title = driver.getTitle();
        System.out.println(act_title);
        Assert.assertEquals(exp_title,act_title);

    }

    @When("User provides login details")
    public void userProvidesLoginDetails() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
    }


    @And("User clicks on login")
    public void userClicksOnLogin() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("User is navigated to application Dashboard page")
    public void userIsNavigatedToApplicationDashboardPage() {
        String exp_title = "OrangeHRM";
        String act_title = driver.getTitle();
        System.out.println(act_title);
        Assert.assertEquals(exp_title,act_title);

        WebElement pim = driver.findElement(By.xpath("//*[contains(text(),'PIM')]"));

        boolean a = pim.isDisplayed();

        Assert.assertEquals(a,TRUE);
    }

    @When("User provides login details {string},{string}")
    public void userProvidesLoginDetails(String id, String pwd) {


        driver.findElement(By.id("txtUsername")).sendKeys(id);
        driver.findElement(By.name("txtPassword")).sendKeys(pwd);

    }
}
