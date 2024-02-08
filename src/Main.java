import tr.com.workintech.model.carRDCompany.ElectricCar;
import tr.com.workintech.model.carRDCompany.GasPoweredCar;
import tr.com.workintech.model.carRDCompany.HybridCar;
import tr.com.workintech.model.pacificCarCompany.Car;
import tr.com.workintech.model.pacificCarCompany.Ford;
import tr.com.workintech.model.pacificCarCompany.Holden;
import tr.com.workintech.model.pacificCarCompany.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("--------------------------------------");

        ElectricCar electricCar = new ElectricCar(450.2, 750000);
        electricCar.startEngine();
        electricCar.drive();

        GasPoweredCar gasPoweredCar = new GasPoweredCar(750, 8);
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        HybridCar hybridCar = new HybridCar(120, 50000, 6);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}