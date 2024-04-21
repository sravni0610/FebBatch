package inher;

public class ForEx {

    public static void main(String args[]){


//        for(int i=1;i<=10;i++){
//
//            if(i%2==0){
//                System.out.println(i);
//            }
//            else{
//                System.out.println("odd number is "+i);
//            }
//        }


        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2 && j==2){
                    break bb;
                }
                System.out.println(i+" "+j);    //i = 2    j= 1
            }
        }




    }
}
