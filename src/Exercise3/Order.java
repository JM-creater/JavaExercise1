package Exercise3;

import java.util.*;

public class Order
{
    protected String customerName;
    protected int customerNumber;
    protected int quantityOrdered;
    protected double unitPrice;
    protected double totalPrice;

    public String getCustomerName()
    {
        return this.customerName;
    }

    public int getCustomerNumber()
    {
        return this.customerNumber;
    }

    public int getQuantityOrdered()
    {
        return this.quantityOrdered;
    }

    public double getUnitPrice()
    {
        return this.unitPrice;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    public void setQuantityOrdered(int quantityOrdered)
    {
        this.quantityOrdered = quantityOrdered;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public void computePrice()
    {
        this.totalPrice = this.quantityOrdered * this.unitPrice;
    }

    public void display()
    {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Customer Number: " + this.customerNumber);
        System.out.println("Quantity Number: " + this.quantityOrdered);
        System.out.println("Unit Price: " + this.unitPrice);
        System.out.println("Total Price: " + this.totalPrice);
    }

    public void prompt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        this.customerName = sc.nextLine();

        System.out.print("Enter customer number: ");
        this.customerNumber = sc.nextInt();

        System.out.print("Enter quantity ordered: ");
        this.quantityOrdered = sc.nextInt();

        System.out.print("Enter unit price: ");
        this.unitPrice = sc.nextDouble();

        computePrice();
    }
}
