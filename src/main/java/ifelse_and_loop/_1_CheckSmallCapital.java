// Write a program to check if inputted letter is small or capital

package ifelse_and_loop;

import java.util.Scanner;

public class _1_CheckSmallCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch + " is a Capital Letter");

        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch + " is a Small Letter");

        else
            System.out.println("\n" + ch + " is not an aplhabetic character");

    }
}
