/* 6. Write a Java program to retrieve an element (at a specified index) from a given
array list. */
package javaquestion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Question_6 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Yellow");

        System.out.println(list);
        String e=list.get(3);
        System.out.println("Retrieve an elements : "+e);

        String e1=list.get(5);
        System.out.println("Retrieve an elements : "+e1);

    }

}
