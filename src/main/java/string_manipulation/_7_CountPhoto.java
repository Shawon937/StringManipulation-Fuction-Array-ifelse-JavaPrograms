// Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]

package string_manipulation;

public class _7_CountPhoto {
    public static void main(String[] args) {
        String[] title = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count=0;

        for (int i = 0; i < title.length ; i++){
            if(title[i].contains(".jpg") || title[i].contains(".png"))
                count++;
        }
        System.out.println("Number of Images: "+count);
    }
}
