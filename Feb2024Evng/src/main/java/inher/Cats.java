package inher;

public class Cats extends Animal{

    void drink(){
        System.out.println("Cats like to drink milk");
    }

    public static void main(String args[]){

        Cats c1 = new Cats();
        c1.eat();
        c1.drink();
    }
}
