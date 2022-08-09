/* 2. Re write the student mark sheet programme using if else and while loop. */
package javaquestion;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {

        Question_2 q2=new Question_2();
        q2.mark();

    }
    public void mark()
    {
        int math = 0;
        int science = 0;
        int english = 0;
        int marks = 100;
        float percentage, total;

        Scanner sc = new Scanner(System.in);
        System.out.println("|____________________________|");
        System.out.println("|      Marksheet             |");
        System.out.println("|____________________________|");
        System.out.println("|   Name     :               |");
        String name = sc.next();
        System.out.print("|   Roll No:                 |");
        int rollno = sc.nextInt();
        System.out.println("|____________________________|");
        System.out.println("|   Subjects  :        Marks |");
        System.out.println("|____________________________|");
        System.out.print("|   Math      :              |");
        math = sc.nextInt();
        while (math>100 || math<0)
        {
            System.out.println("Invalid input : Enter maths marks again :");
            math = sc.nextInt();
        }
        System.out.println("|  Science    :            |");
        science=sc.nextInt();
        while (science>100 || science<0)
        {
            System.out.println("Invalid input : Enter science marks again :");
            science=sc.nextInt();
        }
        System.out.println("|English      :            |");
        english=sc.nextInt();
        while (english>100 || english<0)
        {
            System.out.println("Invalid input : Enter science marks again :");
            english=sc.nextInt();
        }
        System.out.println("|---------------------------|");
        System.out.println("|Enter your total :         |");
        total = math + science + english;
        System.out.println(total);
        System.out.println("|---------------------------|");
        System.out.println("|Percentage :               |");
        percentage = total/3;
        System.out.println(percentage);
        System.out.println("Result :                    |");

        if(math < 35 || science <35 || english <35)
        {
            System.out.println("Fail");
        }
        else {
            if (percentage < 35)
            {
                System.out.println("Fail");
            } else if (percentage > 35)
            {
                System.out.println("Pass");
                System.out.println("|Grade               |");
                if(percentage >= 80)
                {
                    System.out.println("A+");
                } else if (percentage >= 60)
                {
                    System.out.println("A");
                } else if (percentage >= 50)
                {
                    System.out.println("B");
                } else if (percentage >= 35)
                {
                    System.out.println("c");
                }
                System.out.println("|                     |");
            }
        }
    }

}
