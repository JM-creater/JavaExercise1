package Exercise3;

import java.util.*;

public class UseOrder
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Order order = new Order();
        System.out.println("Enter Order Details:");
        order.prompt();

        System.out.print("Order details: ");
        order.display();

        ShippedOrder shippedOrder = new ShippedOrder();
        System.out.println("\nEnter Shipped Order Details:");
        shippedOrder.prompt();

        System.out.print("Shipped Order Details: ");
        shippedOrder.display();

        scan.close();
    }
}
