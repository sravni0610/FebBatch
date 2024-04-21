package inher;

public class IfelseIf {

    public static void main(String args[]){

        int marks = 165;

        if(marks < 40){
            System.out.println("fail");
        }
        else if (marks >= 40 && marks < 60) {

            System.out.println("B Grade");

        }
        else if(marks >=60 && marks <75){
            System.out.println("A Grade");
        }
        else if(marks >=75 && marks <=100){
            System.out.println("Distinction");
        }
        else {
            System.out.println("Invalid marks");
        }
    }
}
