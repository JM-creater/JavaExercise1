package Practice2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Rectangle[] rectangle = new Rectangle[3];

        for (int i = 0; i < rectangle.length; i++)
        {
            System.out.println("Do you want to enter the width and the length? (y/n)");

            char choice = sc.next().charAt(0);
            if (choice == 'y')
            {
                System.out.print("Input two numbers here: ");
                rectangle[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            else
            {
                rectangle[i] = new Rectangle();
            }
        }

        System.out.println("The Rectangle are: ");
        for (int i = 0; i < rectangle.length; i++)
        {
            System.out.println("Rectangle " + (i+1) + " :width " + rectangle[i].getWidth() + ", height " + rectangle[i].getHeight());
        }

    }
}
