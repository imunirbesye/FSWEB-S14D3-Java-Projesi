package tr.com.workintech.model.pacificCarCompany;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Mitsubishi's engine is starting";
    }

    public String accelerate() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Mitsubishi is accelerating";
    }

    public String brake() {
        Logger logger = Logger.getLogger(Car.class.getName());
        logger.log(Level.INFO, getClass().getSimpleName());
        return "Mitsubishi is breaking";
    }
}
