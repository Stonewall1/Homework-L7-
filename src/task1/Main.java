package task1;

public class Main {
    public static void main(String[] args) {
        Figure[] array = new Figure[5];

        Triangle triangle1 = new Triangle(5, 5, 5 , 2.5);
        Triangle triangle2 = new Triangle(10 , 8 , 4 , 1.8);
        Circle circle1 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(24, 8);

        array[0] = triangle1;
        array[1] = triangle2;
        array[2] = circle1;
        array[3] = rectangle1;
        array[4] = rectangle2;

        double perimeterSum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                perimeterSum = perimeterSum + array[i].countPerimeter();
            }
        }
        System.out.println(perimeterSum);

        double squareSum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                squareSum = squareSum + array[i].countSquare();
            }
        }
        System.out.println(squareSum);
    }
}
