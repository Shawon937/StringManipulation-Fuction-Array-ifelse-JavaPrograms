//Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

//      Before Running The program check the TrxId exists in the resources folder.
//      Html fIle path(./src/main/resources/TrxId.html)
package string_manipulation;

import java.io.*;

public class ExtractTxnFromHtmlFile {

    public static void main(String[] args) throws FileNotFoundException
    {
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader("./src/main/resources/TrxId.html");

        try {

            BufferedReader br = new BufferedReader(fr);
            String val;
            while ((val=br.readLine()) != null) {
                sb.append(val);
            }

            // converting into the string
            String result = sb.toString();
            System.out.println("After extracting full html file as String:");
            System.out.println(result);
            System.out.println();

            String number=result.replaceAll( "[^\\d]", " ");
            number = number.replaceAll(" +","");
            String extTxn= "TXN"+number;
            System.out.println("After Extracting Transaction ID:");
            System.out.println(extTxn);
            br.close();


        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}