//Input an amount from the user and find out the number of notes from input amount in given array

package function_and_array;

import java.util.Scanner;

public class _2_NoteCount {
    public static void countCurrency(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Taka   NoteCount ");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " \t " + noteCounter[i]);
            }
        }
    }

    public static void main(String argc[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        countCurrency(amount);
    }

}
