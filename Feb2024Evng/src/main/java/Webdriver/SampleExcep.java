package Webdriver;

public class SampleExcep {
    public  static void main(String args[]){


        int a[] = new int[4];



        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
       // a[4] = 50;

       try{
           int i = 100/0;
       }catch (ArithmeticException e){
           System.out.println(e);
       }

       finally {
           System.out.println("To execute any time");
       }



       int age = 17;

       if(age <18){
           throw new ArithmeticException("person is not eligible");
       }
       else {
           System.out.println("person is eligible");
       }



    }
}
