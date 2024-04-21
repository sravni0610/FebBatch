package TestNg;

import org.testng.annotations.*;

public class Basic1 {


    @Test
    public void test(){
        System.out.println("Actual test method");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("Before Class execution");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("After Class Execution");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("After method execution");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before method execution");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("After test method execution");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("Before test method execution");
    }
}
