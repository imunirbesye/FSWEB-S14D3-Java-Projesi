package tr.com.workintech.model.carRDCompany;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas powered car is starting");
    }

    @Override
    public void drive() {
        super.drive();
    }
}
