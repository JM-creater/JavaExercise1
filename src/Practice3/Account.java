package Practice3;

import java.util.Date;

public class Account
{
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    public void display()
    {
        System.out.println("Id: " + this.id);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.annualInterestRate);
        System.out.println(this.dateCreated.toString());
    }
}
