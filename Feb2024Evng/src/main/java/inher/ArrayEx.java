package inher;

public class ArrayEx {

    public static void main(String args[]){

        int a[]= new int[5];

        a[0] = 10;
        a[3] = 30;
        a[1] = 20;
        a[2] = 40;
        a[4] = 50;

        System.out.println(a[1]);

        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }

        System.out.println("For each loop starts");

        for (int i:a) {

            System.out.println(i);

        }




    }
}
