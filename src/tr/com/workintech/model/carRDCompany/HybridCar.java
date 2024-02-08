package tr.com.workintech.model.carRDCompany;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid powered car is starting");
    }

    @Override
    public void drive() {
        super.drive();
    }
}
