package sample;

public class Abc {

    int id;
    String name;

    void insert(int id, String name){

        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("data entered is "+id+" "+name);
    }
    public  static void main(String args[]){

        Abc a1 = new Abc();
        a1.insert(101,"GHJ");
        a1.display();



    }
}
