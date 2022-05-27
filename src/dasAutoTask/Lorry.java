package dasAutoTask;

public class Lorry extends Car{
    int loadCapacity;
    public Lorry(String brand, String autoClass, int weight, Driver driver, Engine engine , int loadCapacity) {
        super(brand, autoClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }
}
