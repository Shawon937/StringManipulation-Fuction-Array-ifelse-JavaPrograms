// Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
// If you buy 2 shirt and 1 sharee,
// then 400 tk will be discounted.
// After your purchase what will be your total cost?

package string_manipulation;

import java.util.Scanner;

public class _2_ShirtShareeOffer {

    public static void main(String[] args) {

        int shirtPrice=1200;
        int shareePrice=3500;
        System.out.println("Shirt Price:"+shirtPrice+ "\nSharee Price:"+shareePrice);

        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of Shirt: ");
        int shirtAmount = sc.nextInt();
        System.out.print("Amount of Sharee: ");
        int shareeAmount= sc.nextInt();

//    System.out.println("Laptop Price: "+price+"Tk\n"+"Discount: "+discountPrcnt+"%");
        if(shirtAmount>=2 && shareeAmount>=1) {
            double discountAmount = 400;
            double totalCost = (shirtAmount*shirtPrice) + (shareeAmount*shareePrice) - discountAmount;
            double actualCost = (shirtAmount*shirtPrice) + (shareeAmount*shareePrice);
            System.out.println("Actual Cost: "+ actualCost);

            System.out.println("Discount Applied: " + discountAmount + "Tk");
            System.out.println("Total Cost: " + totalCost + " Tk");
        }
        else{
            double totalCost = (shirtAmount * shirtPrice + shareeAmount * shareePrice);
            System.out.println("No Discount Applied");
            System.out.println("Total Cost: " + totalCost + " Tk");
        }


    }


}
