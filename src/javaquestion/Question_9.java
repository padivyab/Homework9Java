/* 9.Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map. */
package javaquestion;


import java.util.HashMap;
import java.util.Map;

public class Question_9 {

    public static void main(String[] args) {

        HashMap<String,Integer> people=new HashMap<String,Integer>();
        people.put("C",1);
        people.put("Python",2);
        people.put("PHP",3);
        people.put("Android",4);
        people.put("C++",5);
        people.put("Sql",6);

        System.out.println("Output :");

        /*for (Map.Entry e:lan.entrySet() )
        {
            System.out.println(e.getKey()+" "+e.getValue());

        }*/
        for(String i:people.keySet())
        {
            System.out.println(i+" "+people.get(i));
        }

    }
}
