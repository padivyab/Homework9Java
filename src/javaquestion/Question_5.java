/* 5. Write a Java program to iterate through all elements in an array list using
Iterator. */
package javaquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Question_5 {

    public static void main(String[] args) {

        ArrayList list =new ArrayList(Arrays.asList("Shiv","Alex","Steven","Jone","Charles","Steve")); // Square bracket ma print thase.
        ListIterator listIte = list.listIterator();
        while (listIte.hasNext())
        {
            System.out.println(listIte.next());

        }
    }
}
