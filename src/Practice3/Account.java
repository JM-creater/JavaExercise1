package Practice3;

import java.util.Date;
import java.util.*;

public class Account
{
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;

    public Account()
    {
        this.dateCreated = new Date();
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public boolean withdraw(double amount)
    {
        if (balance < amount)
            return false;
        balance -= amount;
        return true;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public boolean search(int acc_ID)
    {
        if (id == acc_ID)
        {
            display();
            return false;
        }
        return true;
    }


    public void display()
    {
        System.out.println("Id: " + this.id);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.annualInterestRate);
        System.out.println(this.dateCreated.toString());
    }

    public void openAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        this.id = sc.nextInt();

        System.out.print("Enter Amount Balance: ");
        this.balance = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate: ");
        this.annualInterestRate = sc.nextDouble();

        this.dateCreated = new Date();
    }
}
