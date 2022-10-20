//Write a program that will count how many vowels in the given string:
//"roadtosdet"
//Output: 4

package string_manipulation;

public class _5_CountVowel {
    public static void main(String[] args) {

        int vCount = 0;
        String str = "roadtosdet";
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
    }
}