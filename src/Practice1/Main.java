package Practice1;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Person person = new Person("Martin", 21, 77.6, 148.34);

        System.out.print(person.name + "'s BMI is " + String.format("%.4f",person.getBMI()) + ", which is " + person.getCategory());


    }
}
