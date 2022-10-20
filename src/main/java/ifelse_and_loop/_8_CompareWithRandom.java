// Write a program to generate 2 random numbers which will not be shown to the user.
// Take a user input and match it with any of the random numbers.
// If correct give it 1 point and
// if incorrect, do not give it any point.
// Finally, repeat this for 10 times and count the point user achieved.

package ifelse_and_loop;

import java.util.Scanner;

public class _8_CompareWithRandom {
    public static void main(String[] args) {
        int points = 0;
        int min = 1;
        int max = 5;
        double rand1 = Math.random() * (max - min) + min;
        int random1 = (int) Math.floor(rand1);

        double rand2 = Math.random() * (max - min) + min;
        int random2 = (int) Math.floor(rand2);

        Scanner sc = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i + " Chances Remaining,");
            System.out.print("Guess a Number from 1 to 5: ");
            array[i] = sc.nextInt();
            if (array[i] == random1 || array[i] == random2) {
                points++;
            }
        }
        System.out.println("Total Points: " + points);
    }
}
