/* 10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.*/
package javaquestion;

import java.util.HashMap;
import java.util.Map;

public class Question_10 {

    public static void main(String[] args) {

        HashMap<String,String> zone1=new HashMap<String,String>();
        zone1.put("tube1","station1,station2,station3");
        zone1.put("tube2","station2");
        zone1.put("tube3","station3");
        zone1.put("tube4","station4");

        //System.out.println("Zone1"+zone1);

        String key = "tube1";
        System.out.println("At this station these trains will stop :");

        for(Map.Entry<String,String> stations : zone1.entrySet())
        {
            //System.out.println(i+" "+zone1.get(i));
            if(stations.getKey() == key)
            {
                System.out.println(stations.getValue());
            }
        }
    }
}
