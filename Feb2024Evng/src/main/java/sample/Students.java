package sample;

public class Students {

    int id;
    String name;
    String subject;
    int age;

    static String clg = "ABC egr clg";
     Students() {

    }

    Students(int i, String n,String s,int a){

         age =a;
         id=i;
         name =n;
         subject = s;

    }


    void display(){

        System.out.println("Student name is "+name);
        System.out.println("Student id is "+id);
        System.out.println("Student clg is "+clg);
    }

   void area(int l, int b){
        System.out.println("area of rectangle is "+(l*b));
   }

   void insert(String n,int i){
        name = n;
        id = i;
   }

   int mnm(){
        return  18;
   }

   Students(int i, String n){
        id = i;
        name =n;
   }
    public  static void main(String args[]){

        Students s1 = new Students();
        Students s2 = new Students(102,"xyz","JAva",28);
        Students s3 = new Students(103,"Ravi");
        s3.display();

        s1.display();
        s1.insert("Raj",101);

        s1.display();
        s1.area(20,5);

        System.out.println(s1.mnm());

//        s2.id = 102;
//        s2.name="Uma";
        s2.display();


    }

}
