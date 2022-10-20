//Write a program to sum of user input until users input ‘q’ from keyboard

package ifelse_and_loop;

import java.util.Scanner;

public class _9_SumOfInput {

    public static void main(String[] args) {

        char ch='y';
        int sum = 0;
        int digit;
        try {
            Scanner sc = new Scanner(System.in);

            do {
                System.out.print("\nInput a number and press enter: ");
                digit = sc.nextInt();
                sum = sum + digit;
                System.out.print("Press q to quit Or, press any other key to continue:");
                ch = sc.next().charAt(0);

            }
            while (ch != 'q');
            System.out.println("Sum Total of input numbers: " + sum);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input!! Program Closed. ");
        }


    }
}