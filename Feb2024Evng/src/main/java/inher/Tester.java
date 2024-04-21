package inher;

public class Tester extends Employee{

    double bonus = 555.46;

    public static void main(String args[]){

        Tester t1 = new Tester();
        System.out.println("Salary of tester with bonus is "+(t1.salary+t1.bonus));


    }
}
