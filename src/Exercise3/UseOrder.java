package Exercise3;

import java.util.*;

public class UseOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order Details:");
        Order order = new Order();

        System.out.print("Enter customer name: ");
        order.setCustomerName(scanner.nextLine());

        System.out.print("Enter customer number: ");
        order.setCustomerNumber(scanner.nextInt());

        System.out.print("Enter quantity ordered: ");
        order.setQuantityOrdered(scanner.nextInt());

        System.out.print("Enter unit price: ");
        order.setUnitPrice(scanner.nextDouble());

        order.computePrice();
        order.display();

        System.out.println("\nShipped Order Details:");
        ShippedOrder shippedOrder = new ShippedOrder();

        System.out.print("Enter customer name: ");
        shippedOrder.setCustomerName(scanner.next());

        System.out.print("Enter customer number: ");
        shippedOrder.setCustomerNumber(scanner.nextInt());

        System.out.print("Enter quantity ordered: ");
        shippedOrder.setQuantityOrdered(scanner.nextInt());

        System.out.print("Enter unit price: ");
        shippedOrder.setUnitPrice(scanner.nextDouble());

        shippedOrder.computePrice();
        shippedOrder.display();

        scanner.close();
    }
}
