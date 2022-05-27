package task1;

public class Rectangle extends Figure{
    double longSide;
    double lessSide;

    public Rectangle(double longSide, double lessSide) {
        this.longSide = longSide;
        this.lessSide = lessSide;
    }

    @Override
    public double countSquare() {
        return square = this.lessSide * this.longSide;
    }

    @Override
    public double countPerimeter() {
       return perimeter = 2*(this.longSide + this.lessSide);
    }
}
