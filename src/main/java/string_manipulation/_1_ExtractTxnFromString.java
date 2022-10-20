//Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

package string_manipulation;

public class _1_ExtractTxnFromString {
    public static void main(String[] args) {
        String html = "<html>\n" +
                      "<title>Test</title>\n" +
                      "<body>\n" +
                      "Your trnx is successful. Trnx Id is: TXN123456\n" +
                      "</body>\n" +
                      "</html>";

        char[] ch= html.toCharArray();
        if(html.contains("TXN")){
            String txnId =html.substring(html.indexOf("TXN"),html.indexOf("TXN")+9);
            System.out.println("Transaction Id: "+txnId);
        }


    }
}
