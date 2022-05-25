package task1;

public class Circle extends Figure{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double countSquare() {
        return square = Figure.pi * this.radius * this.radius;
    }

    @Override
    public double countPerimeter() {
        return perimeter = 2 * Figure.pi * this.radius;
    }
}
