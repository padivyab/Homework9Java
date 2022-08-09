/* 3. Write a Java program to reverse an array of integer values. */
package javaquestion;

import java.util.Arrays;

public class Question_3 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array :" +Arrays.toString(array));
        for(int i=0; i<array.length/2; i++)
        {
            int c= array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = c;

        }
        System.out.println("Reverse Array :" +Arrays.toString(array));

    }
}
