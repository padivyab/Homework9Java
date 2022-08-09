/* 10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.*/
package javaquestion;

import java.util.HashMap;
import java.util.Map;

public class Question_10 {

    public static void main(String[] args) {

        HashMap<String,String> zone1=new HashMap<String,String>();
        zone1.put("BakerStreet","Metrolitan,Circle line,Central line,Hammersmith & City");
        zone1.put("Barbican","Metrolitan,Circle line,Central line,Hammersmith & City");
        zone1.put("Moorgate","Metrolitan,Circle line,Central line,Hammersmith & City");
        zone1.put("Liverpool Street","Metrolitan,Circle line,Central line,Hammersmith & City");

        //System.out.println("Zone1"+zone1);

        String key = "BakerStreet";
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
