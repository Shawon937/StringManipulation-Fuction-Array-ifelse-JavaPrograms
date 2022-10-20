//Take input from a user and check if the number exists in the array

package function_and_array;

import java.util.Scanner;

public class _1_SearchArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 4, 6, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Search: ");
        int toFind = sc.nextInt();

        boolean bool = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == toFind) {
                System.out.println(toFind + " is found in the position " + i + " of the array");
                bool = false;
                break;
            } else
                bool = true;
        }
        if (bool == true) {
            System.out.println("Found No Element");
        }


    }


}