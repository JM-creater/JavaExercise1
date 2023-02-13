public class Rectangle extends Shape
{
    protected double height, width;

    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    @Override
    public double Area() {
        return height * width;
    }
}
