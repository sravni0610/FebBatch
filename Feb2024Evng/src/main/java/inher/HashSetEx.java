package inher;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String args[]){

        HashSet<String> hs = new HashSet<String>();

        hs.add("Cynthia");
        hs.add("Vandana");
        hs.add("Umashankar");
        hs.add("Cynthia");

        Iterator itr = hs.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());

        }


    }
}
