package Practice2;

public class Rectangle
{
    protected double width = 1.0;
    protected double height = 1.0;

    public Rectangle()
    {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        return this.height * this.width;
    }

    public double getPerimeter()
    {
        return 2 * (this.height + this.width);
    }

}
