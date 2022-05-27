package dasAutoTask;

public class SportCar extends Car{
    int maxSpeed;
    public SportCar(String brand, String autoClass, int weight, Driver driver, Engine engine , int maxSpeed) {
        super(brand, autoClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
