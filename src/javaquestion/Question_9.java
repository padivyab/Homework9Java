/* 9.Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map. */
package javaquestion;


import java.util.HashMap;
import java.util.Map;

public class Question_9 {

    public static void main(String[] args) {

        HashMap<String,Integer> lan=new HashMap<String,Integer>();
        lan.put("C",1);
        lan.put("Python",2);
        lan.put("PHP",3);
        lan.put("Android",4);
        lan.put("C++",5);
        lan.put("Sql",6);

        System.out.println("Output :");

        /*for (Map.Entry e:lan.entrySet() )
        {
            System.out.println(e.getKey()+" "+e.getValue());

        }*/
        for(String i:lan.keySet())
        {
            System.out.println(i+" "+lan.get(i));
        }

    }
}
