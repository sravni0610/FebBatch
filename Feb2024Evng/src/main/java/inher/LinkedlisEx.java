package inher;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlisEx {

    public static void main(String args[]){

        LinkedList<String> al = new LinkedList<String>();

        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Mango");

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
