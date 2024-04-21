package inher;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String args[]){


        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        hm.put(001,"Cynthia");
        hm.put(002,"Vandana");
        hm.put(003,null);
        hm.put(004,"Umashankar");
        hm.put(005,"Vandana");


            for(Map.Entry m : hm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }



    }
}
