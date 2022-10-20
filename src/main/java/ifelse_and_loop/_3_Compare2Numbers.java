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
        input.close();

        if (Math.abs(num1 - num2) <= 0.001) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }
    }
}