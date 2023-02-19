package Practice3;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Account testAccount = new Account();

        System.out.print("Enter amount to withdraw: ");
        int id = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        double amountWithdraw = sc.nextDouble();

        if (testAccount.withdraw(amountWithdraw)) {
            System.out.println("Withdraw Successfully");
        }
        else {
            System.out.println("Withdraw not successfully");
        }

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        testAccount.deposit(depositAmount);

        testAccount.display();
    }
}
