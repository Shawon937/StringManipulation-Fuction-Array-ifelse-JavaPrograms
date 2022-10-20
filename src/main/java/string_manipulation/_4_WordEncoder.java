//Writea program that will give following output:
//Input: chattogram
//Output: C8M
package string_manipulation;

public class _4_WordEncoder {
    public static void main(String[] args) {
        String myStr= "chattogram";
        String s1=String.valueOf(myStr.charAt(0)).toUpperCase();
        String last= String.valueOf(myStr.charAt(myStr.length()-1)).toUpperCase();
        int len = myStr.length()-2;
        System.out.println(s1+len+last);
    }
}
