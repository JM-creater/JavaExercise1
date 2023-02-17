import java.util.*;
public class Main
{
    static double totalArea = 0;

    static void TotalArea(Shape s)
    {
        totalArea += s.Area();
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter the shape information for shape " + (i + 1) + ":");
            System.out.print("Enter 1 for Circle, 2 for Rectangle, 3 for Square: ");
            int type = sc.nextInt();

            Shape s;
            if (type == 1)
            {
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                s = new Circle(radius);
            }
            else if (type == 2)
            {
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                s = new Rectangle(height, width);
            }
            else
            {
                System.out.print("Enter the side length: ");
                double side = sc.nextDouble();
                s = new Square(side);
            }
            System.out.println("Area of shape " + (i + 1) + " is: " + String.format("%.2f",s.Area()));
            TotalArea(s);
        }

        System.out.println("Total area of all shapes is: " + String.format("%.2f",totalArea));

        sc.close();
    }
}