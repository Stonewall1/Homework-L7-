package task1;

public class Triangle extends Figure{
    int baseSide;
    int side2;
    int side3;
    double height;

    public Triangle(int baseSide, int side2, int side3 , double height) {
        this.baseSide = baseSide;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    @Override
    public double countSquare() {
        return square =  0.5 * this.baseSide * height;
    }

    @Override
    public double countPerimeter() {
        return perimeter = this.baseSide + this.side2 + this.side3;
    }
}
