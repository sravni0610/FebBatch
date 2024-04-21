package inher;

public class BabyDog extends Dogs{

    void weep(){
        System.out.println("Baby dogs weep");
    }

    public static void main(String args[]){
        BabyDog b1 = new BabyDog();
        b1.eat();
        b1.bark();
        b1.weep();
    }


}
