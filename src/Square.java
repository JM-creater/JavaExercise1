public class Square extends Shape
{
    protected double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double Area() {
        return side * side;
    }
}
