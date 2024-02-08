package tr.com.workintech.model.carRDCompany;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric powered car is starting");
    }

    @Override
    public void drive() {
        super.drive();
    }
}
