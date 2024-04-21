package inher;

public class Dogs extends Animal{

    void bark(){
        System.out.println("Dogs bark");
    }

    public static void main(String args[]){
        Dogs d1 = new Dogs();

        d1.bark();
        d1.eat();
    }

}
