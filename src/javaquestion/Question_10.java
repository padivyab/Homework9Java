/* 10.Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.*/
package javaquestion;

import java.util.HashMap;

public class Question_10 {

    public static void main(String[] args) {

        HashMap<String,String> zone1=new HashMap<String,String>();
        zone1.put("tube1","station1");
        zone1.put("tube2","station2");
        zone1.put("tube3","station3");
        zone1.put("tube4","station4");

        System.out.println("Zone1"+zone1);

    }
}
