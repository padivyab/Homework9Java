/* 7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names. */
package javaquestion;

import java.util.ArrayList;

public class Question_7 {

    public static void main(String[] args) {

        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Bakerloo");
        a1.add("Central");
        a1.add("Victoria");
        a1.add("Waterloo");
        a1.add("Metropolitan");
        a1.add("Jubilee");

        System.out.println(a1);
        //System.out.println("Array List is empty or not! "+a1.isEmpty());
        //a1.removeAll(a1);
        //System.out.println("Array List after remove all elements "+a1);
        //System.out.println("Array List is empty or not! "+a1.isEmpty());

        if(a1.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("is not empty");
        }

    }



}
