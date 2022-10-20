//Generate 20 random numbers from 0 to 100 and
// print the max, min and duplicate random numbers (if any)

package function_and_array;

import java.util.Arrays;

public class _7_FindMaxMinDuplicate {

    public static void main(String[] args) {

        int startRange = 1;
        int endRange = 100;
        int[] random = new int[20];

        System.out.println("The Random Numbers are: ");
        for (int i = 0; i < random.length; i++) {
            double rand1 = Math.random() * (endRange - startRange) + startRange;
            random[i] = (int) Math.floor(rand1);
            System.out.print(random[i] + "  ");
        }

        int max = Arrays.stream(random).max().getAsInt();
        System.out.println("\nLargest in the array is: " + max);

        int min = Arrays.stream(random).min().getAsInt();
        System.out.println("Smallest in the array is: " + min);


        for (int i = 0; i < random.length; i++) {
            for (int j = i + 1; j < random.length; j++) {
                if (i != j && random[i] == random[j]) {
                    System.out.println("Duplicate element found for Number: " + random[i]);
                }
            }
        }

    }
}
