package dasAutoTask;

public class Main {
    public static void main(String[] args) {
        Driver skilledOne = new Driver("Max" , 12);
        Engine hemi = new Engine(450 , 6000);
        Car car = new Car("Dodge" , "S" , 2200 , skilledOne , hemi);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();

        String result = car.toString();
        System.out.println(result);
    }
}
