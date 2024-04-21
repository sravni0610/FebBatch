package inher;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

    public static void main(String args[]){

        ArrayList<String> al = new ArrayList<String>();

        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Mango");


//        for (String a:al) {
//            System.out.println(a);
//        }

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
