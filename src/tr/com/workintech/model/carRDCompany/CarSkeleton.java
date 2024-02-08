package tr.com.workintech.model.carRDCompany;

public class CarSkeleton {
    private String name;
    private String description;

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void drive() {
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car engine is running");
    }
}
