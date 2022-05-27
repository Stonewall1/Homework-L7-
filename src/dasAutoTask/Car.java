package dasAutoTask;

public class Car {
    String brand;
    String autoClass;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String brand, String autoClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.autoClass = autoClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void stop(){
        System.out.println("Stop");
    }
    public void start(){
        System.out.println("Go!");
    }
    public void turnRight(){
        System.out.println("Turning right");
    }
    public void turnLeft(){
        System.out.println("Turning left");
    }
    public String toString(){
        String result = " Brand = " + this.brand + "\n Auto class = " + this.autoClass + "\n Weight = " + this.weight +
                "\n Drivers name = " + driver.name + "\n Drivers experience = " + driver.yearsOfPractice +
                "\n Engine Power = " + engine.powerInHp + "\n Engine Performance = " + engine.performance;

        return result;
    }
}
