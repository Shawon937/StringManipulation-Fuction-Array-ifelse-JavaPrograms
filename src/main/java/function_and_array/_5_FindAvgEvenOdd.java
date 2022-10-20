//Take 5 numbers from users in an array.
// Then find out the average number,
// how many even and how many odd numbers using these functions:
// average(), countEvenNumbers(), countOddNumbers()
package function_and_array;

import java.util.Scanner;

public class _5_FindAvgEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Input a number:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            int n = num.length - 1 - i;
            System.out.println("Input again: " + n + " times remaining");
        }

        System.out.println("Numbers are: ");
        for (int val : num) {
            System.out.print(val + "  ");
        }

        _5_FindAvgEvenOdd obj = new _5_FindAvgEvenOdd();
        obj.average(num);
        obj.countEvenNumbers(num);
        obj.countOddNumbers(num);


    }

    void average(int[] num) {
        int sum = 0;
        for (int val : num) {
            sum += val;
        }
        Double avg = Double.valueOf(sum / num.length);
        System.out.println("\nAverage:" + avg);

    }

    void countEvenNumbers(int[] num) {
        int count = 0;
        for (int val : num) {
            if (val % 2 == 0)
                count++;
        }
        System.out.println("Total Even Numbers:" + count);

    }

    void countOddNumbers(int[] num) {
        int count = 0;
        for (int val : num) {
            if (val % 2 != 0)
                count++;
        }
        System.out.println("Total Odd Numbers:" + count);

    }
}
