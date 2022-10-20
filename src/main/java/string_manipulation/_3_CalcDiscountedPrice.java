//Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
// What will be the purchase price?
package string_manipulation;

public class _3_CalcDiscountedPrice {
    public static void main(String[] args) {
        int price=76000;
        int discountPrcnt=10;
        System.out.println("Laptop Price: "+price+"Tk\n"+"Discount: "+discountPrcnt+"%");
        double discountAmount = (price*discountPrcnt)/100;
        double purchasePrice= (price - discountAmount);
        System.out.println("Price After Discount: "+ purchasePrice+" Tk" );

    }
}
