//Input 2 decimal numbers and check if they are both same or different up to two decimal places.

package ifelse_and_loop;

import java.util.Scanner;

public class _3_Compare2Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first floatingpoint number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second floatingpoint number: ");
        double num2 = input.nextDouble();

        num1 = Math.round(num1 * 100);
        num1 = num1 / 100;

        num2 = Math.round(num2 * 100);
        num2 = num2 / 100;

        if (num1 == num2)
        {
            System.out.println("They are the same upto two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
        input.close();

    }
}
