package inher;

public class Bike extends Vehicles{


    void run() {
        System.out.println("Bike runs on 2 wheels");
    }

    public static void main(String args[]){
        Bike b1 = new Bike();
        b1.run();

    }
}
