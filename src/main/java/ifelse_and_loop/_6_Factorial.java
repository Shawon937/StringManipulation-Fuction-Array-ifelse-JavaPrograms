//Write  a program to find the factorial of a given number

package ifelse_and_loop;

import java.util.Scanner;

public class _6_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get its Factorial: ");
        int num = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}