package tr.com.workintech.model.pacificCarCompany;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "the car is breaking";
    }
}
