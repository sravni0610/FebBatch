package sample;

public class Calculator {
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String args[]){

        Calculator c1 = new Calculator();

        c1.add(30.5,40.0);
        c1.add(20,30,40);



    }

}
