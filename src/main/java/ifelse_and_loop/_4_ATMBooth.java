//Write a program to check balance and withdraw money from ATM booth using if else or switch case

package ifelse_and_loop;

import java.util.Scanner;

public class _4_ATMBooth {

    // Display current balance in account
    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " + balance);
    }

    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawn Amount : " + withdrawAmount);
        if (withdrawAmount > 50000) {
            System.out.println("You can't withdraw more than 50,000 Tk per Transaction");
        } else {
            if (balance >= withdrawAmount) {
                balance = balance - withdrawAmount;
                displayBalance(balance);
                System.out.println("Please collect your money and collect the card");
            } else {
                System.out.println("Sorry! Insufficient Funds");
                System.out.println();
            }
        }
        return balance;
    }




    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int balance = 100000;

        // calling display balance
        displayBalance(balance);

        System.out.print("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();


        // withdrawing amount
        balance = amountWithdrawing(balance, withdrawAmount);


    }
}