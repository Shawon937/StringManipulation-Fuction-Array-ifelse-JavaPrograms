//Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet
package string_manipulation;

public class _8_EachFirstCharToUpper {
    public static void main(String[] args) {
        String str = "rahim lives in dhaka";
        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {
            String firstletter = String.valueOf(word[i].charAt(0));
            String restLetter = word[i].substring(1);
            System.out.print(firstletter.toUpperCase() + restLetter + " ");
        }
    }
}