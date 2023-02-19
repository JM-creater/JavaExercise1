package Practice1;

public class Person
{
    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    public Person(String name, int age, double height, double weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getBMI()
    {
        return weight / (height * weight);
    }

    public String getCategory()
    {
        double bmi = getBMI();

        if (bmi < 18.5)
        {
            return "Underweight";
        }
        else if (bmi < 25.0)
        {
            return "Normal Weight";
        }
        else if (bmi < 30.0)
        {
            return "Overweight";
        }
        else if (bmi < 35.0)
        {
            return "Obesity level 1";
        }
        else if (bmi < 40.0)
        {
            return "Obesity level 2";
        }
        else
        {
            return "Obesity level 3";
        }
    }

}
