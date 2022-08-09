/* 1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate). */
package calculate;

import calculate.Calculator;

import java.util.Scanner;

public class Main_01 extends Calculator {

        public static void main(String[] args) {

            char c1;
            do {

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the first number");
                int a =sc.nextInt();
                System.out.println("Enter the symbol(+,-,/,*)");
                char c = sc.next().charAt(0);
                System.out.println("Enter the second number");
                int b= sc.nextInt();
                System.out.println("Total");

                Calculator cal=new Calculator();
                cal.calculateResult(a,b,c);

                System.out.println("whould you like to do more calculation.? : y or n");
                c1=sc.next().charAt(0);

            }
            while (c1 == 'Y' || c1 == 'y');

        }
}