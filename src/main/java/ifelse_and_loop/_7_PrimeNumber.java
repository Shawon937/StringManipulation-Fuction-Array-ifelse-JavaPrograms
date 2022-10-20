// Write a program to print prime numbers from 2 to n

package ifelse_and_loop;

import java.util.Scanner;

public class _7_PrimeNumber {

    static boolean isPrime(int n) {

        //since 0 and 1 is not prime return false.
        if (n == 1 || n == 0) return false;

        //Run a loop from 2 to n-1
        for (int i = 2; i < n; i++) {
            // if the number is divisible by i, then n is not a prime number.
            if (n % i == 0) return false;
        }
        //otherwise, n is prime number.
        return true;
    }


    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N'th Number: ");
        int N = sc.nextInt();
        //check for every number from 1 to N
        System.out.println("Prime Number from 2 to " + N + ":");
        if (N < 2) {
            System.out.println("Prime Numbers not Found");
        }
        else {
            for (int i = 2; i <= N; i++) {

                //check if current number is prime
                if (isPrime(i)) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
        System.out.println("\n\nTotal prime numbers up to "+ N + ":  "+ count);

    }
}