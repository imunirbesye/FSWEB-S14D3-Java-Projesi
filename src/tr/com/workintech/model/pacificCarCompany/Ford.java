package tr.com.workintech.model.pacificCarCompany;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Ford's engine is starting";
    }

    public String accelerate() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Ford is accelerating";
    }

    public String brake() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Ford is breaking";
    }
}
