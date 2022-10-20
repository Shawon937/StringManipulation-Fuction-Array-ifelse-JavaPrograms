//Write a program to sum of numbers which only divisible by 5 from 1 to 100

package ifelse_and_loop;

public class _5_SumOfNumberDivBy5 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 100;
        System.out.println("numbers only divisible by 5 from 1 to 100:\n");
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
                sum += i;
            }
        }
        System.out.println("\nSum the numbers: " + sum);
    }
}