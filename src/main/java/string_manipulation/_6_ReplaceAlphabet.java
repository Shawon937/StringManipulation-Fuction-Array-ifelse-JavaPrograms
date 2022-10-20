//Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur

package string_manipulation;

public class _6_ReplaceAlphabet {
    public static void main(String[] args) {

        String str = "Ratul and Rahim lives in Rangpur";
        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {
            if(word[i].equals("Rahim")) {
                String firstletter = String.valueOf(word[i].charAt(0)).replace('R','F');
                String restLetter = word[i].substring(1);
                word[i]=firstletter + restLetter;
            }
        }

        System.out.println("Before:" + str);
        System.out.print("After :");

        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]+" ");
        }
        }
    }

