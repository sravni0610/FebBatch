package inher;

public class MultidimArr {

    public static void main(String args[]){


            int arr[][] = {{10,20,30},{30,46,59},{45,87,49}};

                    //new int[2][2];

//            arr[0][0] = 10;
//            arr[0][1] = 20;
//            arr[1][0] = 30;
//            arr[1][1] = 40;

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]+" ");
                }

                System.out.println();
            }

    }
}
