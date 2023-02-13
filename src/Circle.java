public class Circle extends Shape
{
    protected double radius;

    public Circle(double r)
    {
        this.radius = r;
    }

    @Override
    public double Area()
    {
        return Math.PI * radius * radius;
    }
}
