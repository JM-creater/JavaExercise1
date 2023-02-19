package Practice3;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number of customers do you want to input? ");
        int numCustomers = sc.nextInt();
        Account[] accounts = new Account[numCustomers];

        for (int i = 0; i < accounts.length; i++)
        {
            System.out.printf("Enter details for customer %d\n", i + 1);
            accounts[i] = new Account();
            accounts[i].openAccount();
        }

        Account open = new Account();
        open.openAccount();

        Account testAccount = open;

        int choice;

        do
        {
            System.out.println(" ");
            System.out.println("[1] - WITHDRAW");
            System.out.println("[2] - DEPOSIT");
            System.out.println("[3] - SEARCH");
            System.out.println("[4] - DISPLAY");
            System.out.println("[5] - EXIT");
            System.out.println(" ");
            System.out.println("ENTER AN OPTION: ");
            choice = sc.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter amount to withdraw: ");
                double amountWithdraw = sc.nextDouble();

                if (testAccount.withdraw(amountWithdraw))
                {
                    System.out.println("Withdraw Successfully");
                }
                else
                {
                    System.out.println("Withdraw not successful");
                }
            }

            else if (choice == 2)
            {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                testAccount.deposit(depositAmount);
            }

            else if (choice == 3)
            {
                System.out.print("Enter ID you want to search: ");
                int acc_ID = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < accounts.length; i++) {
                    found = accounts[i].search(acc_ID);
                    if (found) {
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed! Account doesn't exist.");
                }
            }

            else if (choice == 4)
            {
                for (int i = 0; i < accounts.length; i++)
                {
                    accounts[i].display();
                }
                System.exit(0);
            }

            else  if (choice == 5)
            {
                System.exit(0);
            }

            else
            {
                System.out.println("Invalid choice.");
            }

            System.out.println(" ");
            testAccount.display();

        } while (choice != 5);
    }
}
