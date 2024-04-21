package TestNg;

import org.testng.annotations.Test;

public class Basic2 {

    @Test(priority = 0)
    public void A(){
        System.out.println("A test");
    }

    @Test(priority = 1)
    public void a(){
        System.out.println("a test");
    }

    @Test(priority = 2)
    public void B(){
        System.out.println("B test");
    }
}
