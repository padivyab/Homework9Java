/* 4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop. */
package javaquestion;

import java.util.ArrayList;

public class Question_4 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Yellow");
        System.out.println("Output :");

        for(String e:list)
        {
            System.out.println(e);
        }
    }
}
